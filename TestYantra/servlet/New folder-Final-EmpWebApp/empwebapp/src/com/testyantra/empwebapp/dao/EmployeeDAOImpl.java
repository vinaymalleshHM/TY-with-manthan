package com.testyantra.empwebapp.dao;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import com.testyantra.empwebapp.beans.EmployeeInfoBean;

public class EmployeeDAOImpl implements EmployeeDAO {



	@Override
	public EmployeeInfoBean searchEmployee(int empId) {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet  rs = null;

		EmployeeInfoBean EmployeeInfoBean=null;

		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_info","root","root");
			String query="select * from employee_info where emp_id=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, empId);
			rs = pstmt.executeQuery();


			if (rs.next()) {

				EmployeeInfoBean = new EmployeeInfoBean();
				EmployeeInfoBean.setEmpid(rs.getInt("emp_id"));
				EmployeeInfoBean.setEmpName(rs.getString("emp_name"));
				EmployeeInfoBean.setAge(rs.getInt("age"));
				EmployeeInfoBean.setSalary(rs.getDouble("salary"));
				EmployeeInfoBean.setDesignation(rs.getString("designation"));
				EmployeeInfoBean.setMobile(rs.getLong("mobile"));

			}

		}

		catch (Exception e) {

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
		return EmployeeInfoBean;

	}




	@Override
	public boolean addEmployee(EmployeeInfoBean EmployeeInfoBean) {


		Connection con = null;
		PreparedStatement pstmt = null;
		boolean isAdded= false;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_info","root","root");

			String query="insert into employee_info values(?,?,?,?,?,?,?)";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, EmployeeInfoBean.getEmpid());
			pstmt.setString(2,EmployeeInfoBean.getEmpName() );
			pstmt.setInt(3,EmployeeInfoBean.getAge() );
			pstmt.setDouble(4,EmployeeInfoBean.getSalary() );
			pstmt.setString(5,EmployeeInfoBean.getDesignation() );
			pstmt.setLong(6,EmployeeInfoBean.getMobile() );
			pstmt.setString(7,"kkkk");
			int n =pstmt.executeUpdate();

			if(n>0) {
				isAdded= true;

			}


		} 
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {


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
		return isAdded;

	}




	@Override
	public EmployeeInfoBean authenticate(int empId, String password) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		EmployeeInfoBean EmployeeInfoBean = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_info","root","root");

			String query="select * from employee_info where emp_id=? and password=? ";
			pstmt = con.prepareStatement(query);

			pstmt.setInt(1, empId);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();


			if (rs.next()) {

				EmployeeInfoBean = new EmployeeInfoBean();
				EmployeeInfoBean.setEmpid(rs.getInt("emp_id"));
				EmployeeInfoBean.setEmpName(rs.getString("emp_name"));
				EmployeeInfoBean.setAge(rs.getInt("age"));
				EmployeeInfoBean.setSalary(rs.getDouble("salary"));
				EmployeeInfoBean.setDesignation(rs.getString("designation"));
				EmployeeInfoBean.setMobile(rs.getLong("mobile"));



			}
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


			return EmployeeInfoBean;
		}
	}


	public boolean update(EmployeeInfoBean EmployeeInfoBean) {

		Connection con = null;
		PreparedStatement pstmt = null;
		//ResultSet rs = null;
		boolean  isadde=false;

		//EmployeeInfoBean EmployeeInfoBean1 = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_info","root","root");

			String query="update employee_info set mobile=? where emp_id=? ";
			pstmt = con.prepareStatement(query);

			pstmt.setLong(1,EmployeeInfoBean.getMobile());
			pstmt.setInt(2,EmployeeInfoBean.getEmpid());
			int n = pstmt.executeUpdate();

			if(n>0) {
				isadde=true;
			}




		} 
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {

			/*if (rs != null) {

				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}*/

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


			return isadde;
		}
	}




	@Override
	public boolean Delete(EmployeeInfoBean employeeInfoBean) {

		Connection con = null;
		PreparedStatement pstmt = null;
		boolean  isadde=false;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_info","root","root");
			String query="delete from employee_info where emp_id=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1,employeeInfoBean.getEmpid());
			int n = pstmt.executeUpdate();

			if(n>0) {
				isadde=true;
			}


		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}



		return isadde;
	}

}
