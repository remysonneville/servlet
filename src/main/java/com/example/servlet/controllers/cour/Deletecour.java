package com.example.servlet.controllers.cour;

import com.example.servlet.services.SupCourDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Deletecour extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SupCourDao courDao = new SupCourDao();
        courDao.deleteById(Integer.parseInt(req.getParameter("id")));
    }
}
