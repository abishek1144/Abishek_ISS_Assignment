package com.login;

import jakarta.servlet.ServletException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.io.PrintWriter;
public class login_action extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public login_action() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
//			PrintWriter out=response.getWriter();
//			out.println("<font color=red size=18>Login Failed!!<br>");
//			out.println("<a href=login_page.jsp>TRY AGAIN!!");
			try {
				
				PrintWriter out=response.getWriter();
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","abishek12345");
				String s = request.getParameter("username");
				String p = request.getParameter("password");
				PreparedStatement ps = con.prepareStatement("select username from users where username=? and password=?");
				ps.setString(1,s);
				ps.setString(2, p);
				ResultSet rs=ps.executeQuery();
				if(rs.next())
				{
					RequestDispatcher rd=request.getRequestDispatcher("welcome_page.jsp");
					rd.forward(request, response);
				}
				else {
						out.println("<font color=red size=18>Login Failed!!<br>");
						out.println("<a href=login_page.jsp>TRY AGAIN!!");
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
