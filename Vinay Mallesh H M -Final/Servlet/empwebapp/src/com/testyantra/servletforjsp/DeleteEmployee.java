package com.testyantra.servletforjsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.testyantra.empwebapp.beans.EmployeeInfoBean;
import com.testyantra.empwebapp.dao.EmployeeDAO;
import com.testyantra.empwebapp.dao.EmployeeDAOImpl;
@WebServlet("/deleEmp")
public class DeleteEmployee extends HttpServlet {
	EmployeeDAO dao = new EmployeeDAOImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int empId =  Integer.parseInt(req.getParameter("empId"));

		EmployeeInfoBean EmployeeInfoBean = new EmployeeInfoBean();
		EmployeeInfoBean.setEmpid(empId);


		HttpSession session = req.getSession(false);
		if (session != null) {
			if(dao.Delete(EmployeeInfoBean)) {
				req.setAttribute("msg", "Employee deleted Succesfuly");

			}
			else {
				req.setAttribute("msg", "Failed delete Employee");
			}
			req.getRequestDispatcher("/deleteEmployeeForm").forward(req, resp);
		}
		else {
			req.setAttribute("msg", "please Login frist" );

		}

	}
}
