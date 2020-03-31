package com.testyantra.empwebapp.servelts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetEmployeeServlet2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String empIdval=req.getParameter("empId");
		
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>Employee Details for emp Id"+empIdval+"-</h2>");
		out.println("name= venki  <br>");
		out.println("salary=456789 <br>");
		out.println("designation=sd <br>");
		out.println("</body>");
		out.println("</html>");
		
	}
	
	

}
