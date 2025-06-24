package com.example.demo.controllers.admin;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "AdminLogoutServlet", value = "/admin-logout")
public class AdminLogoutServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        HttpSession session = request.getSession();

        session.removeAttribute("logged-in-admin");

        response.sendRedirect("pages/admin/login.jsp");
    }
}