package com.testyantra.empwebapp.servelts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Include")
public class IncludeServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h2>Hello user</h2>");
		
		
		
RequestDispatcher dispatcher = req.getRequestDispatcher("./myFirstServlet");// only we inrenal servlet can pass
		
		dispatcher.include(req, resp);
		
		out.print("<h2>thank you</h2>");
		out.print("</body>");
		out.print("</html>");
	
	}

	
	
}
