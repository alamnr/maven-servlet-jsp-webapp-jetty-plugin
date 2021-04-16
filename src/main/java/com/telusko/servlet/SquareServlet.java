package com.telusko.servlet;

import java.io.IOException;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/square")
@WebInitParam(name = "name", value = "gonesh")
public class SquareServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		doGet(req, res);
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		  //int k = (int) req.getAttribute("k");
		  //int k = Integer.parseInt(req.getParameter("k"));
		    //int k = (int) req.getSession().getAttribute("k");
		 int k=0;
		 for (Cookie ck : req.getCookies()) {
			 if(ck.getName().equals("k")) {
				 k= Integer.parseInt(ck.getValue());
			 }
		}
		  
		 res.getWriter().println("square value - "+ k*k + "  "+getServletContext().getInitParameter("name") + "  "+ getServletConfig().getInitParameter("name"));
		 
		
		//res.getWriter().println("send redirect");
	}

}
