package com.example.servlet.controllers.planning;

import com.example.servlet.services.SupPlanningDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Deleteplanning extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SupPlanningDao planningDao = new SupPlanningDao();
        planningDao.deleteById(Integer.parseInt(req.getParameter("id")));
    }
}
