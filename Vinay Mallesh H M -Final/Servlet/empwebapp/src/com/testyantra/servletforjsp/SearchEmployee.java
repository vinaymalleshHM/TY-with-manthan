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
@WebServlet("/search")
public class SearchEmployee extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session =req.getSession(false);
		if(session !=null) {
			//valid session 
			int empId =  Integer.parseInt(req.getParameter("empId"));
			EmployeeDAO dao = new EmployeeDAOImpl();
			EmployeeInfoBean employeeInfoBean =dao.searchEmployee(empId);
			if(employeeInfoBean !=null) {
				req.setAttribute("searchEmployee", employeeInfoBean);
				//req.setAttribute("msg", "Employee id "+empId+" found");
			}

			else {
				req.setAttribute("msg", "Employee Id Not Found");
			}
			req.getRequestDispatcher("./searchEmployeeForm").forward(req, resp);
		}else {
			//Inavalid Session 
			req.setAttribute("msg", "plz Login First");
			req.getRequestDispatcher("./loginForm").forward(req, resp);
		}
	}//end doget
}
