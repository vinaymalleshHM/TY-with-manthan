package com.testyantra.employeemangement;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Connection;

import com.mysql.jdbc.Statement;

public class SearchEmployee {
	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement  pstmt = null;
		ResultSet rs = null;
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter employee id: " );
		int empId =sc.nextInt();
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String durl="jdbc:mysql://localhost:3306/elf_employee_info";
			con = DriverManager.getConnection(durl,"root","root");
			
			
			
			String query ="select * from employee_info where emp_id=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, empId);
			
			rs=pstmt.executeQuery();
			
			
			if(rs.next()) {
				System.out.println("Employee id found...");
				System.out.println("name= "+ rs.getString("emp_name"));
				System.out.println("salary= "+rs.getDouble("salary"));
			}
			else {
				System.out.println("Employee id is not found...");
			}
			
		} 
		catch (ClassNotFoundException | SQLException e) {
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
			if(pstmt !=null)
			{
				try {
					pstmt.close();
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
		
				
		
	}// End of main()

}// End of class 
