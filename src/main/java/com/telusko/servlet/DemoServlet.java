package com.telusko.servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/demo")
public class DemoServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String name = "Chudna";
		//Student st = new Student(0, "modna");
		List<Student> studs = Arrays.asList(new Student(1, "modna"),new Student(2, "Chudna"),new Student(3, "bodna"));
		//req.setAttribute("label", name);
		//req.setAttribute("st", st);
		req.setAttribute("students", studs);
		RequestDispatcher rd = req.getRequestDispatcher("welcome.jsp");
		rd.forward(req, res);
	}

}
