package com.telusko.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		doGet(req, res);
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		  //int k = (int) req.getAttribute("k");
		  int k = Integer.parseInt(req.getParameter("k"));
		 res.getWriter().println("square value - "+ k*k);
		 
		
		//res.getWriter().println("send redirect");
	}

}
