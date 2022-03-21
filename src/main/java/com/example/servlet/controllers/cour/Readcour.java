package com.example.servlet.controllers.cour;

import com.example.servlet.model.Cour;
import com.example.servlet.services.SupCourDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class Readcour extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SupCourDao courDao = new SupCourDao();
        List<Cour> cours = courDao.getAllItems();
    }
}
