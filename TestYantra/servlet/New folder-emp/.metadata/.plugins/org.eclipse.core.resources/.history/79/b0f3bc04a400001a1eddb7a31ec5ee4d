package com.testyantra.empwebapp.servlet;

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

@WebServlet("/searchEmployee")
public class SearchEmployee extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//to get Form Data
		String empIdVal = req.getParameter("empId"); 
		int empId = Integer.parseInt(empIdVal);

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<body>");

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_info","root","root");
			String query ="select * from employee_info where emp_id=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, empId);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				int id = rs.getInt("emp_id");
				String name = rs.getString("emp_name");
				int age = rs.getInt("age");
				double salary = rs.getDouble("salary");
				String designation = rs.getString("designation");
				Long mobile = rs.getLong("mobile");

				System.out.println("Employee Id :"+id);
				System.out.println("Employee Name :"+name);
				System.out.println("Employee Age :"+age);
				System.out.println("Employee Salary :"+salary);
				System.out.println("Employee Designation :"+designation);
				System.out.println("Employee Mobile :"+mobile);

				out.print("<h2> Employee "+id+" is found</h2>");
				out.print("Employee Id :"+id);
				out.print("<br>Employee Name :"+name);
				out.print("<br>Employee Age :"+age);
				out.print("<br>Employee Salary :"+salary);
				out.print("<br>Employee Designation :"+designation);
				out.print("<br>Employee Mobile :"+mobile);


			}
			else {
				out.print("<h2> Employee "+empId+" is  Not found</h2>");
			}

			out.print("</body>");
			out.print("</html>");

		} 
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		finally {
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
