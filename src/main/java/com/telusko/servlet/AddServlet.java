package com.telusko.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet  extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i+j;
		//res.getWriter().println(i+j);
		
		/*
		 * req.setAttribute("k", i+j); RequestDispatcher rd =
		 * req.getRequestDispatcher("square"); rd.forward(req, res);
		 */
		
		//req.getSession().setAttribute("k", i+j);
		
		res.addCookie(new Cookie("k", ""+k));
		
		res.sendRedirect("square"); 
	}
}
