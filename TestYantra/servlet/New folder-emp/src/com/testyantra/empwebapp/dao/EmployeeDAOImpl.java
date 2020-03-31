package com.testyantra.empwebapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.testyantra.empwebapp.bean.EmployeeInfoBean;

public class EmployeeDAOImpl implements EmployeeDAO{

	@Override
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean) {

		Connection con = null;
		PreparedStatement pstmt = null;
		boolean isadded = false;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_info","root","root");
			String query = "insert into employee_info values(?,?,?,?,?,?,?)";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, employeeInfoBean.getEmpId());
			pstmt.setString(2, employeeInfoBean.getEmpName());
			pstmt.setInt(3, employeeInfoBean.getAge());
			pstmt.setDouble(4, employeeInfoBean.getSalary());
			pstmt.setString(5, employeeInfoBean.getDesignation());
			pstmt.setLong(6, employeeInfoBean.getMobile());
			pstmt.setString(7, employeeInfoBean.getPassword());
			int n = pstmt.executeUpdate();
			if (n>0) {
				isadded = true;
				return isadded;

			}
		} 
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		finally {
			if (pstmt!=null) {
				try 
				{
					pstmt.close();
				} 
				catch (SQLException e)
				{
					e.printStackTrace();
				}
			}

			if (con!=null) {
				try {
					con.close();
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
		}

		return false;

	}

	@Override
	public EmployeeInfoBean searchEmployee(int empId) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmployeeInfoBean employeeInfoBean = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_info","root","root");
			String query = "select * from employee_info where emp_id=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, empId);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				employeeInfoBean = new EmployeeInfoBean();
				employeeInfoBean.setEmpId(rs.getInt("emp_id"));
				employeeInfoBean.setEmpName(rs.getString("emp_name"));
				employeeInfoBean.setAge(rs.getInt("age"));
				employeeInfoBean.setSalary(rs.getDouble("salary"));
				employeeInfoBean.setDesignation(rs.getString("designation"));
				employeeInfoBean.setMobile(rs.getLong("mobile"));
			}
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		finally {

			if (rs!=null) {
				try 
				{
					rs.close();
				} 
				catch (SQLException e)
				{
					e.printStackTrace();
				}
			}

			if (pstmt!=null) {
				try 
				{
					pstmt.close();
				} 
				catch (SQLException e)
				{
					e.printStackTrace();
				}
			}

			if (con!=null) {
				try {
					con.close();
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}

		}
		return employeeInfoBean;
	}

	@Override
	public EmployeeInfoBean auathenticate(int empId, String password) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		EmployeeInfoBean employeeInfoBean = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_info","root","root");
			String query = "select * from employee_info where emp_id=? and password=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, empId);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				employeeInfoBean = new EmployeeInfoBean();
				employeeInfoBean.setEmpId(rs.getInt("emp_id"));
				employeeInfoBean.setEmpName(rs.getString("emp_name"));
				employeeInfoBean.setAge(rs.getInt("age"));
				employeeInfoBean.setSalary(rs.getDouble("salary"));
				employeeInfoBean.setDesignation(rs.getString("designation"));
				employeeInfoBean.setMobile(rs.getLong("mobile"));
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return employeeInfoBean;


	}

	@Override
	public boolean upadateEmployee(EmployeeInfoBean employeeInfoBean) {

		Connection con = null;
		PreparedStatement pstmt = null;
		boolean isUpdate = false;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_info","root","root");
			String query = "update employee_info set password =? where emp_id=?";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, employeeInfoBean.getPassword());
			pstmt.setInt(2, employeeInfoBean.getEmpId());
			int n = pstmt.executeUpdate();

			if (n>0) {
				isUpdate = true;
				return  isUpdate;
			}

		} 
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}


		finally {
			if (pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
			if (con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
		}

		return isUpdate;
	}

	@Override
	public boolean deleteEmployee(EmployeeInfoBean employeeInfoBean) {

		Connection con = null;
		PreparedStatement pstmt = null;
		boolean isDelete = false;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_info","root","root");
			String query = "delete from employee_info where emp_id=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, employeeInfoBean.getEmpId());
			int n = pstmt.executeUpdate();
			if (n>0) {
				isDelete = true;
				return isDelete;
			}

		} 
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (pstmt!=null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		if (con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return isDelete;
	}

}
