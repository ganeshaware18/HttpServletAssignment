package com.servletregisterform;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOError;
import java.io.IOException;
import java.io.PrintWriter;

public class RegisterServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        //System.out.println("do get method");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("username");
        String password = request.getParameter("userpassword");
        String email = request.getParameter("useremail");
        String gender = request.getParameter("usergender");
        String course = request.getParameter("usercourse");
        String condition = request.getParameter("usercondtion");
        if (condition != null) {

            if (condition.equals("checked")) {
                out.println("<h1> Welcome To Register Servlet  </h1>");

                out.println("<h2> NAME: " + name + "</h2>");
                out.println("<h2> PASSWORD: " + password + "</h2>");
                out.println("<h2> EMAIL: " + email + "</h2>");
                out.println("<h2> GENDER: " + gender + "</h2>");
                out.println("<h2> COURSE: " + course + "</h2>");
                out.println("<h2> CONDTION: ACCEPTED</h2>");

                RequestDispatcher rd = request.getRequestDispatcher("SucessServlet");
                rd.forward(request, response);
            } else {
                out.println("<h2> you have not accept condtion");
            }
        } else {
            out.println("<h2> you have not accept condtion</h2>");

            RequestDispatcher rd = request.getRequestDispatcher("index.html");
            rd.include(request, response);
        }
        //out.println("date" + new Date().toString());
    }
}
