package com.org.a;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cookie1
 */
@WebServlet("/Cookie1")
public class Cookie1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String name = request.getParameter("val1");
		String id = request.getParameter("val2");
		String pass = request.getParameter("val3");
		
		if(pass.equals("1234")) {
			Cookie ck = new Cookie("Username", name);
			response.addCookie(ck);
			response.sendRedirect("First");
		}else {
			PrintWriter pw = response.getWriter();
			pw.println("Incorrect userid or password");
			RequestDispatcher Rd = request.getRequestDispatcher("/CookiesTest1.html");
			Rd.include(request, response);
		}
	}

}
