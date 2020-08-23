package com.wipro;

import java.io.IOException;


import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Assignment2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletContext context;
	ServletConfig config;	
	
	public Assignment2() {
        super();
        // TODO Auto-generated constructor stub
    }
	@Override
	public void init() throws ServletException {
		context = getServletContext();
		config = getServletConfig();
		
	}
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<h1>ServletContext parameters</h1>");
		Enumeration<String> e1 = context.getInitParameterNames();
		while (e1.hasMoreElements()) {
			String paramName = e1.nextElement();
			out.println(paramName + ": " + context.getInitParameter(paramName) + "<br />");
		}
		
		out.println("<h1>ServletConfig parameters</h1>");
		Enumeration<String> e2 = config.getInitParameterNames();
		while (e2.hasMoreElements()) {
			String paramName = e2.nextElement();
			out.println(paramName + ": " + config.getInitParameter(paramName) + "<br />");
		}
		
//		out.println(context.getInitParameter("Email"));
//		out.println("<br />");
//		String email = config.getInitParameter("Email");
//		out.println(email);
		
		out.close();
	}

}