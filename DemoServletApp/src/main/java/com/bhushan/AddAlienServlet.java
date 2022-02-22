package com.bhushan;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addAlien")
public class AddAlienServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String name = request.getParameter("aname");
		int id = Integer.parseInt(request.getParameter("aid"));
		
		System.out.println("Hello india");
		response.getWriter().print("Welcome " + name + " with id: " + id);
		
	}

}
