package com.krishna;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/firstServlet")
public class FirstServlet extends HttpServlet {
// if we dont extend httpservlet then it will behave like a normql jqvq class
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

       String name= request.getParameter("uname");
       String ucity= request.getParameter("ucity");
       PrintWriter writer= response.getWriter();
       writer.println("<html> <head> <title> Second WebApp </title> </head>");

       writer.println("hello"+ name);
       writer.println(" I know u r from "+ ucity);
       writer.close();
    }
}