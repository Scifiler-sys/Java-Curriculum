package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DirectServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	{
		resp.setStatus(200);
		
		resp.setContentType("application/json");
		
		resp.getWriter().write("{\n\"name\":\"Stephen\", \n\"type\":\"Trainer\"\n}");
	}
}
