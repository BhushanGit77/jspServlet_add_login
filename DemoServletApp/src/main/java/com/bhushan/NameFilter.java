package com.bhushan;

import java.io.IOException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class NameFilter
 */
public class NameFilter extends HttpFilter {
       
    
	public void destroy() {
		// TODO Auto-generated method stub
	}

		public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

			System.out.println("In filter Name");
			if(request.getParameter("aname").length() > 1) {
				chain.doFilter(request, response);	
			} else {
				response.getWriter().print("Invalid length....");
			}
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
