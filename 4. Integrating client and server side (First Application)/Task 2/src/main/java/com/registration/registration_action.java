package com.registration;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Servlet implementation class registration_action
 */
public class registration_action extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registration_action() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				
				PrintWriter out=response.getWriter();
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","abishek12345");
				String s = request.getParameter("username");
				String p = request.getParameter("password");
				String confirm_pass = request.getParameter("cpassword");
				String fn = request.getParameter("firstname");
				String ln = request.getParameter("lastname");
				String age = request.getParameter("age");
				String address = request.getParameter("address");
				if(p.equals(confirm_pass))	
				{
		
				String str="INSERT INTO users (First_Name, Last_Name, username, password, AGE, ADDRESS)\r\n"
						+ "VALUES (?,?,?,?,?,?);";
				PreparedStatement ps=con.prepareStatement(str);
				ps.setString(1, fn);
				ps.setString(2, ln);
				ps.setString(3,s);
				ps.setString(4,p);
				ps.setString(5, age);
				ps.setString(6, address);
				
				ps.executeUpdate();
				
				out.println("<script type=\"text/javascript\">");  
				out.println("alert('Sign Up Successful');");  
				out.println("</script>");
				
				RequestDispatcher rd = request.getRequestDispatcher("login_page.jsp");
				rd.forward(request, response);
				
				}
				
				else
				{	

					out.println("<script type=\"text/javascript\">");  
					out.println("alert('Password dooesn't match');");  
					out.println("</script>");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
