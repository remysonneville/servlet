package com.supinfo.supcommerce.servlet;

import com.supinfo.sun.supcommerce.bo.SupProduct;
import com.supinfo.sun.supcommerce.doa.SupProductDao;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "listProduct", value = "/listProduct")
public class ListProductServlet extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        List<SupProduct> allProduct = SupProductDao.getAllProducts();
        boolean removing = false;
        try{
        int ID = Integer.parseInt(req.getParameter("ID"));
        for (SupProduct product : allProduct) {
            if (product.getId() == ID){
                SupProductDao.removeProduct(product);
                removing = true;
                break;
            }
        }
        }catch (Exception e){
        }

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<html><body>");
        out.println("<h1>Product removed</h1>");
        out.println("<p>"+ removing +"</p>");
        out.println("</body></html>");
    }
}
