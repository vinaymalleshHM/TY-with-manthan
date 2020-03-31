package com.testyantra.empwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetEmployeeServlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String empId = req.getParameter("empId");
		int empIdVal = Integer.parseInt(empId);
		
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>Employee Details for Id "+empIdVal+"</h1>");
		out.print("Name : Dimple <br>");
		out.print("Salary : 456245 <br>");
		out.print("Designation : My Wife");
		out.print("</body>");
		out.print("</html>");
		
	}
	
	

}
