package com.testyantra.empwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.testyantra.empwebapp.bean.EmployeeInfoBean;
import com.testyantra.empwebapp.dao.EmployeeDAO;
import com.testyantra.empwebapp.dao.EmployeeDAOImpl;
@WebServlet("/searchEmployee2")
public class SearchEmployee2 extends HttpServlet{
	
	private EmployeeDAO dao = new EmployeeDAOImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int empId = Integer.parseInt(req.getParameter("empId"));
		
		EmployeeInfoBean employeeInfoBean = dao.searchEmployee(empId);
		
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		if (employeeInfoBean!=null) {
			out.print("<h1>Employee Id:</h1>"+employeeInfoBean.getEmpId());
			out.print("<h1>Employee Name:</h1>"+employeeInfoBean.getEmpName());
			out.print("<h1>Employee Age:</h1>"+employeeInfoBean.getAge());
			out.print("<h1>Employee Salary:</h1>"+employeeInfoBean.getSalary());
			out.print("<h1>Employee Designation:</h1>"+employeeInfoBean.getDesignation());
			out.print("<h1>Employee Mobile:</h1>"+employeeInfoBean.getMobile());
			
		}
		else {
			 out.print("<h2 style='color:red'>Employee</h2>"+empId+"<h2 style='color:red'>Id is not Found</h2>");
		}
		out.print("</body>");
		out.print("</html>");
	}

}
