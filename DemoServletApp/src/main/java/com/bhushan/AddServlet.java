package com.bhushan;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddServlet extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		
		/* 1) Request Dispatecher
		
		req.setAttribute("k", k);
		
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		rd.forward(req, res);
		
		res.getWriter().println("Output is:" + k);*/
		
		/****************************************************************************/
		
		/* 2) URL Rewriting
		
		res.sendRedirect("sq?k=" +k); */
		
		/****************************************************************************/
		
		/* 3) Session Management
		
		
		HttpSession hs = req.getSession();
		hs.setAttribute("k", k);
		res.sendRedirect("sq"); */
		
		/****************************************************************************/

		/* 4) Cookie */
		
		Cookie ck = new Cookie("k", k+"");
		res.addCookie(ck);
		res.sendRedirect("sq");
	}
}
