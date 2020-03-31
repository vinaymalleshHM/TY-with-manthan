package com.testyantra.empwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.testyantra.empwebapp.bean.EmployeeInfoBean;
import com.testyantra.empwebapp.dao.EmployeeDAO;
import com.testyantra.empwebapp.dao.EmployeeDAOImpl;
@WebServlet("/loginServlet")
public class LoginServlet  extends HttpServlet{

	EmployeeDAO dao = new EmployeeDAOImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int empId = Integer.parseInt(req.getParameter("empId"));
		String password = req.getParameter("password");
		
		EmployeeInfoBean employeeInfoBean = dao.auathenticate(empId, password);
		
		PrintWriter out = resp.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		
		
		if (employeeInfoBean != null) {
		
		HttpSession session = req.getSession();
		session.setAttribute("EmployeeInfoBean", employeeInfoBean);
		//session.setMaxInactiveInterval(30);
		
			
		out.print("<h2>Welcome "+employeeInfoBean.getEmpName()+"</h2><br>");
		out.print("<a href='./AddEmployee.html'>Add Employee</a><br>");
		out.print("<a href='./SearchEmployee2.html'>Search Employee</a><br>");
		out.print("<a href='./Update.html'>Update</a><br>");
		out.print("<a href='./Delete.html'>Delete</a><br>");
		out.print("<a href='./logout'>Logout</a><br>");
		}
		
		else {
			out.print("<h1>Please enter valid user/password<h1>");
			req.getRequestDispatcher("./Login.html").include(req, resp);
		}
		out.print("</body>");
		out.print("</html>");
		
	}

	
}
