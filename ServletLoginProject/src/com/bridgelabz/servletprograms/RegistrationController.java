package com.bridgelabz.servletprograms;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		PrintWriter out = response.getWriter();
		try {
			Class.forName("com.mysql.jdbc.Driver");

			System.out.println("Driver class is loaded and registered");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registrationdetails", "root", "admin");

			System.out.println("Connection established with the Data server");
			stmt = con.prepareStatement("insert into userdata values(?,?,?,?)");

			stmt.setString(1, request.getParameter("Name"));
			stmt.setInt(2, Integer.valueOf(request.getParameter("phone")));
			stmt.setString(3, request.getParameter("email"));
			stmt.setString(4, request.getParameter("pass"));
			System.out.println("Platform created");

			int i = stmt.executeUpdate();

			if (i > 0) {
				System.out.println("Welcome");
				out.println(i + " row added");
			} else
				System.out.println("data Inserted");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {

			if (stmt != null) {

				try {

					stmt.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}

			if (con != null) {

				try {

					con.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
		}
	}


	}


