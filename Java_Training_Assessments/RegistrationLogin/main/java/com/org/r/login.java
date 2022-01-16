package com.org.r;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 
		  //  String driver = "com.mysql.cj.jdbc.Driver";
		  //  String url = "jdbc:mysql://localhost:3306/loginpage";
		    response.setContentType("text/html");
		    String msg = " ";
		    PrintWriter out = response.getWriter();
		    String username = request.getParameter("userName");
		    String password = request.getParameter("userPass");
		    try {
		    	Class.forName("com.mysql.cj.jdbc.Driver"); 
				//out.println("Connection Ready");
				Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/loginpage","root","root");  
				//out.println("Database Ready");
		       // Class.forName("com.mysql.jdbc.Driver");

		     //   Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","root");  

		        String strQuery = "select * from REGISTERUSER WHERE name='"
		                + username + "' and pass='" + password + "'";
		        Statement st = con.createStatement();
		        ResultSet rs = st.executeQuery(strQuery);
		        if (rs.next()) {
		            msg = "HELLO " + username + "! Your login is SUCESSFULL";

		        } else {
		            msg = "HELLO" + username + "!Your login is UNSUCESSFULL";
		        }
		        rs.close();
		        st.close();
		        out.println(msg);
		   
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
	}

}
