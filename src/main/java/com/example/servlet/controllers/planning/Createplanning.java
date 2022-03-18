package com.example.servlet.controllers.planning;

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
import java.util.List;
import java.util.stream.Collectors;

public class Createplanning extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Planning planning = new Planning();
        SupCourDao courDao = new SupCourDao();
        SupPlanningDao planningDao = new SupPlanningDao();
        planning.setName(req.getParameter("name"));
        try {
            planning.setBeginnig(new SimpleDateFormat("dd/MM/yyyy 'at' hh:mm:ss").parse(req.getParameter("beginnig")));
            planning.setEnding(new SimpleDateFormat("dd/MM/yyyy 'at' hh:mm:ss").parse(req.getParameter("name")));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        List<Integer> allCour = Arrays.stream(req.getParameter("allCour").split("\\s"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Cour> cours = Collections.emptyList();
        for (int i: allCour) {
            cours.add(courDao.findById(i));
        }
        planning.setAllCour(cours);
        planningDao.addItem(planning);
    }
}
