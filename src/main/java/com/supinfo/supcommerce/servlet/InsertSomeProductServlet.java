package com.supinfo.supcommerce.servlet;

import com.supinfo.sun.supcommerce.bo.SupProduct;
import com.supinfo.sun.supcommerce.doa.SupProductDao;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "basicInsert", value = "/basicInsert")
public class InsertSomeProductServlet  extends HttpServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        SupProduct a = new SupProduct();
        a.setContent(req.getParameter("content"));
        a.setName(req.getParameter("name"));
        a.setPrice(0);
        SupProductDao.addProduct(a);
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<html><body>");
        out.println("<h1>Product added</h1>");
        out.println("<p>"+ a.getContent() + a.getName() + a.getPrice() +"</p>");
        out.println("</body></html>");
    }
}
