package com.testyantra.employeemangement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AddEmployee {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement  pstmt = null;


		Scanner sc = new Scanner(System.in);


		System.out.println("enter employee id: " );
		int emp_id =sc.nextInt();
		//sc.nextLine();

		System.out.println("enter employee name: " );
		String name =sc.next();

		/*	System.out.println("enter employee age: " );
		int age =sc.nextInt();

		System.out.println("enter employee salary: " );
		double salary =sc.nextDouble();
		//sc.hasNextLine();

		System.out.println("enter employee designation: " );
		String designation =sc.next();

		System.out.println("enter employee mobile: " );
		Long mobile =sc.nextLong();*/


		try {
			Class.forName("com.mysql.jdbc.Driver");
			String durl="jdbc:mysql://localhost:3306/elf_employee_info";
			con = DriverManager.getConnection(durl,"root","root");


			//String query ="insert into employee_info values(?,?,?,?,?,?)";
			//String query ="delete from employee_info where emp_id=?";
			String query ="update  employee_info set emp_name=? where emp_id=?";
			pstmt=con.prepareStatement(query);
			pstmt.setString(1,name );
			pstmt.setInt(2, emp_id);
			
			/*pstmt.setInt(3,age );
			pstmt.setDouble(4,salary );
			pstmt.setString(5,designation );
			pstmt.setLong(6,mobile );*/


			int n =pstmt.executeUpdate();

			if (n>0)
			{
				System.out.println("Record updated");
			} 
			else
			{
				System.out.println("Record not updated");
			}


		} 
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}


		finally {

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
