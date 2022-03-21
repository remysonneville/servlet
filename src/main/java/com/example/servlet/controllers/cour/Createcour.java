package com.example.servlet.controllers.cour;

import com.example.servlet.model.Cour;
import com.example.servlet.model.Planning;
import com.example.servlet.services.SupCourDao;
import com.example.servlet.services.SupPlanningDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Createcour extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cour cour = new Cour();
        SupCourDao courDao = new SupCourDao();

        cour.setMaterial(req.getParameter("material"));
        cour.setId(Integer.parseInt(req.getParameter("id")));
        try {
            cour.setBeginning(new SimpleDateFormat("dd/MM/yyyy 'at' hh:mm:ss").parse(req.getParameter("beginning")));
            cour.setEnding(new SimpleDateFormat("dd/MM/yyyy 'at' hh:mm:ss").parse(req.getParameter("ending")));
            cour.setDate(new SimpleDateFormat("dd/MM/yyyy 'at' hh:mm:ss").parse(req.getParameter("date")));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        courDao.addItem(cour);
    }
}
