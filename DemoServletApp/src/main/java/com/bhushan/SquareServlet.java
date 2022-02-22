package com.bhushan;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/sq")
public class SquareServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		/* 1) Request Dispatecher
		
		int k = (int) req.getAttribute("k"); */
		
		/************************************************************************/
		
		/* 2) URL Rewriting 
		int k = Integer.parseInt(req.getParameter("k")); */
		
		/************************************************************************/
		
		/* 3) Session Management 
		
		HttpSession hs = req.getSession();
		int k = (int) hs.getAttribute("k"); */
		
		/************************************************************************/
		
		/* 4) Cookie */
		
		int k = 0;
		Cookie ck[] = req.getCookies();
		
		for(Cookie c : ck) {
			
			if(c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
				break;
			}
		}
		
		k = k*k;
		
		/************************************************************************/
		res.getWriter().println("Square value is: " + k);
	}
}
