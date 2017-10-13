package com.li.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter {
	
	String passUrl = "";

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		  passUrl = filterConfig.getInitParameter("passUrl");

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		 HttpServletRequest httpRequest = (HttpServletRequest) request;
	        HttpServletResponse httpResponse = (HttpServletResponse) response;
	        String[] strArray = passUrl.split(";");
	        for (String str : strArray) {
	            if (str.equals(""))
	                continue;
	            if (httpRequest.getRequestURL().indexOf(str) >= 0) {
	                chain.doFilter(request, response);
	                return;
	            }
	        }

	        HttpSession session = httpRequest.getSession();
	        if (session.getAttribute("username") != null) {
	            chain.doFilter(request, response);
	        } else {
	            httpResponse.sendRedirect(httpRequest.getContextPath() + "/login.jsp");
	        }
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
