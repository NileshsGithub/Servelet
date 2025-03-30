package com.example.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if (email.endsWith("@gmail.com") && password.length() >= 6) {
            out.println("<h2>Login Successful!</h2>");
        } else {
            out.println("<h2 style='color:red;'>Invalid Email or Password!</h2>");
            out.println("<p>Email must end with @email.com</p>");
            out.println("<p>Password must be more than 6 characters.</p>");
        }
    }
}
