
package com.servletregisterform;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class SucessServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

       response.setContentType("text/html");
        //System.out.println("do get method");
        PrintWriter out = response.getWriter();
        
        out.println("This is sucess servlet");
        
        out.println("<h4>sucessfully regiserd</h4>");   
    
    }

 
      
}
