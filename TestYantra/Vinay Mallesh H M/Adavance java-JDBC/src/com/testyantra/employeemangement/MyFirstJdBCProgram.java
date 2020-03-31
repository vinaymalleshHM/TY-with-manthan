package com.testyantra.employeemangement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;


public class MyFirstJdBCProgram {

	public static void main(String[] args)  {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;


		try 
		{
			/*Driver driver = new Driver();
			DriverManager.registerDriver(driver);*/
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_info?user=root&password=root");

			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from employee_info");


			while (rs.next()) {
				int empId = rs.getInt("emp_id");
				String name = rs.getString("emp_name");
				int age = rs.getInt("age");
				double salary = rs.getDouble("salary");
				String designation = rs.getString("designation");
				long mobile = rs.getLong("moblie");

				System.out.println("id "+empId);
				System.out.println("name "+name);
				System.out.println("age "+age);
				System.out.println("salary "+salary);
				System.out.println("designation "+designation);
				System.out.println("mobile "+mobile);
				System.out.println("*******************************");

			}

		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}


		finally {
			if(rs !=null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(stmt !=null)
			{
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if(con !=null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
		}

	}

}
