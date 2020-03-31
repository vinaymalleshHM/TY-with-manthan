package com.testyantra.empwebapp.servelts;

import java.io.IOException;
import java.io.PipedWriter;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet{


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Date date = new Date();
	//	resp.setIntHeader("Refresh", 1);


		PrintWriter out = resp.getWriter();
		out.print("<html>");
		//out.print("<head>");
		//out.print("<meta http-equiv='refresh' content='1'>");
		//out.print("</head>");
		
		out.print("<body>");
		out.print("<h1>current system Date & Time-<br>"+date+"</h1>");
		out.print("</body>");
		out.print("</html>");

	}//end of doget()



}
