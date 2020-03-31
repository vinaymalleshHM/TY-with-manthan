package com.testyantra.empwebapp.servelts;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/SearchEmployee")
public class SearchEmployee extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//get the form data 
		String empIdval=req.getParameter("empId");
		int empId= Integer.parseInt(empIdval);
		//to interact with database
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet  rs = null;
		PrintWriter out = resp.getWriter(); 

		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_info","root","root");
			String query="select * from employee_info where emp_id=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, empId);
			rs = pstmt.executeQuery();


			
			//bcz browser understand only html
			out.println("<html>");
			out.println("<body>");
			if (rs.next()) {

				out.println("<h2> Employee ID "+empId+" Found</h2>");
				out.println("Name = "+rs.getString("emp_name"));
				out.println("<br>age = "+rs.getInt("age"));
				out.println("<br>salary = "+rs.getDouble("salary"));
				out.println("<br>designation = "+rs.getString("designation"));
				out.println("<br>moblie = "+rs.getLong("moblie"));


			}
			out.println("</body>");
			out.println("</html>");


		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}

		finally {
			
			out.close();
			if (rs != null) {

				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}

			if (pstmt != null) {

				try {
					pstmt.close();
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
