package com.example.servlet.controllers.planning;

import com.example.servlet.model.Cour;
import com.example.servlet.model.Planning;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Updateplanning extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Planning planning = new Planning();
        planning.setName(req.getParameter("name"));
        try {
            planning.setBeginnig(new SimpleDateFormat("dd/MM/yyyy").parse(req.getParameter("beginnig")));
            planning.setEnding(new SimpleDateFormat("dd/MM/yyyy").parse(req.getParameter("name")));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        req.getParameter("allCour");
    }
}
