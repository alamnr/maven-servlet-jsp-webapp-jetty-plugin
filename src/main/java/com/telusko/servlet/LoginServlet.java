package com.telusko.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.telusko.dao.LoginDao;

@WebServlet(urlPatterns = {"/login/login", ""})
public class LoginServlet  extends HttpServlet {
	
	LoginDao loginDao = new LoginDao();
	
	public void doPost(HttpServletRequest request , HttpServletResponse  response) throws ServletException, IOException {
		
		
		String userName= request.getParameter("userName");
		String password = request.getParameter("password");
		
		//if(userName.equals("chudna") && password.equals("modna")) {
		try {
			if(loginDao.check(userName, password)) {
				request.getSession().setAttribute("userName", userName);
				response.sendRedirect("welcome.jsp");
			} else {
				request.setAttribute("error", "User name or password is not correcr");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		} catch (ClassNotFoundException | SQLException | IOException | ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
