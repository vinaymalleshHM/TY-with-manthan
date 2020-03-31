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
@WebServlet("/upEmp")
public class UpdateEmployee extends HttpServlet{
	EmployeeDAO dao = new EmployeeDAOImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession(false);
		if (session != null) {
			
			long mobile = Long.parseLong(req.getParameter("mobile1"));
			
			int empId =  Integer.parseInt(req.getParameter("empId"));

			EmployeeInfoBean EmployeeInfoBean = new EmployeeInfoBean();

			EmployeeInfoBean.setMobile(mobile);
			EmployeeInfoBean.setEmpid(empId);
			
			
			if(dao.update(EmployeeInfoBean)) {
				req.setAttribute("msg", "Employee Update Succesfuly");
			}
			else {
				req.setAttribute("msg", "Failed delete Employee");
			}
			req.getRequestDispatcher("/UpdateEmployeeForm").forward(req, resp);
		}
		else {
			
			req.setAttribute("msg", "please Login frist" );
		}
	
		
		


	}

}
