package com.testyantra.empwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.IOP.ServiceContext;

public class MyFirstServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Date date = new Date();
		//resp.setIntHeader("Refresh", 2);

		ServletContext context = req.getServletContext();
		String msg1 = context.getInitParameter("Country Code");

		ServletConfig config = getServletConfig();
		String msg = config.getInitParameter("Message");

		PrintWriter out = resp.getWriter();
		out.println("<html>");
		/*out.println("<head>");
		out.println("<meta Http-equiv='Refresh' content='1'>");
		out.println("</head>");*/
		out.println("<body>");
		out.println("<h2>Current System Date is "+date+"</h2>");
		out.print(msg);
		out.print("<br>Country Code:"+msg1);
		out.println("</body>");
		out.println("</html>");


	}


}
