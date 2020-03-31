package com.testyantra.empwebapp.servelts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/CreateCookie")
public class CreateCookie extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie cookie = new Cookie("empName", "Venki_test_yantra");
		resp.addCookie(cookie);
		
		PrintWriter out =resp.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print("cokie added successfully...");
		out.print("</body>");
		out.print("</html>");
		
	
	}

	
}
