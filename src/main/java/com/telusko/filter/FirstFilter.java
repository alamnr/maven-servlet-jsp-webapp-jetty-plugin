package com.telusko.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

@WebFilter(urlPatterns =  {"/add","add.jsp"})
public class FirstFilter implements Filter {
	
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}
	
	private void rejectRequest(ServletRequest request, ServletResponse response) throws IOException, ServletException {
		request.setAttribute("error", "Please enter a valid number");
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		if(request.getParameter("num1").isEmpty() || request.getParameter("num2").isEmpty()) {
			rejectRequest(request,response);
		} else {
			int num1 = Integer.parseInt(request.getParameter("num1"));
			int num2 = Integer.parseInt(request.getParameter("num2"));
			if (num1<0 || num2 <0 ) {
				rejectRequest(request,response);
			} else {
				chain.doFilter(request, response);
			}
		}
		
		
				
	}
	
	public void destroy() {}

}
