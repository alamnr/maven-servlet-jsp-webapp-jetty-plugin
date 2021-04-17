package com.telusko.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login/logout")
public class LogoutServlet extends HttpServlet {
	public void doPost(HttpServletRequest request , HttpServletResponse  response) throws ServletException, IOException {
		request.getSession().removeAttribute("userName");
		request.getSession().invalidate();
		response.sendRedirect("login.jsp?logout=success");
	}
}
