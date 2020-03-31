package com.testyantra.servletforjsp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.testyantra.empwebapp.beans.EmployeeInfoBean;
import com.testyantra.empwebapp.dao.EmployeeDAO;
import com.testyantra.empwebapp.dao.EmployeeDAOImpl;
@WebServlet("/addEmp")
public class AddEmployee extends HttpServlet{
	EmployeeDAO dao = new EmployeeDAOImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession(false);
		if(session!=null) {
			EmployeeInfoBean bean = (EmployeeInfoBean) session.getAttribute("EmployeeInfoBean");

			int empId =  Integer.parseInt(req.getParameter("empId"));

			String empName = req.getParameter("empName");

			int age =  Integer.parseInt(req.getParameter("age"));

			double salary = Double.parseDouble(req.getParameter("salary"));

			String designation = req.getParameter("designation");

			long mobile = Long.parseLong(req.getParameter("mobile"));


			EmployeeInfoBean EmployeeInfoBean = new EmployeeInfoBean();

			EmployeeInfoBean.setEmpid(empId);
			EmployeeInfoBean.setEmpName(empName);
			EmployeeInfoBean.setAge(age);
			EmployeeInfoBean.setSalary(salary);
			EmployeeInfoBean.setDesignation(designation);
			EmployeeInfoBean.setMobile(mobile);


			if(dao.addEmployee(EmployeeInfoBean)) {
				req.setAttribute("msg", "Employee Added Succesfuly");
				
			}
			else {
				req.setAttribute("msg", "Failed insert Employee");
			}
			req.getRequestDispatcher("/addEmployeeForm").forward(req, resp);
			}
			else {
				req.setAttribute("msg", "please Login frist" );
			}
		}

	}
