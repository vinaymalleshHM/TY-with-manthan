package com.testyantra.empwebapp.servelts;

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
@WebServlet("/Login")
public class LoginServlet extends HttpServlet{
		EmployeeDAO dao = new EmployeeDAOImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int empIdVal = Integer.parseInt(req.getParameter("empId"));
		String password = req.getParameter("password");
		
		EmployeeInfoBean EmployeeInfoBean = dao.authenticate(empIdVal, password);
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		if (EmployeeInfoBean != null) {
			
			HttpSession session = req.getSession(true);
			session.setAttribute("EmployeeInfoBean", EmployeeInfoBean);
			
			//session.setMaxInactiveInterval(30);
			
			out.println("<h2> Welcome"+EmployeeInfoBean.getEmpName()+"<h2>");
			out.println("<a href='./addEmployee.html'>Add Employee</a><br>");
			out.println("<a href='./SearchEmployee.html'>Search Employee</a><br>");
			out.println("<a href='./UpdateM.html'>Update Employee</a><br>");
			out.println("<a href='./Delete.html'>Delete Employee</a><br>");
			out.println("<a href='./Logout'>Logout</a><br>");
			
		}
		else {
			out.println("Invalid Credential!!!!<br>");
			req.getRequestDispatcher("./LoginForm.html").include(req, resp);
		}
		
		
		out.print("</body>");
		out.print("</html>");
		
	
	}
	
	

}
