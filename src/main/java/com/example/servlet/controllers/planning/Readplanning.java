package com.example.servlet.controllers.planning;

import com.example.servlet.model.Planning;
import com.example.servlet.services.SupPlanningDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class Readplanning extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SupPlanningDao planningDao = new SupPlanningDao();
        List<Planning> plannings = planningDao.getAllItems();
    }
}
