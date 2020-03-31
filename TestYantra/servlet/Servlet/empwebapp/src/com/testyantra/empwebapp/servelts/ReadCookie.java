package com.testyantra.empwebapp.servelts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ReadCookie")
public class ReadCookie extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie [] Cookies = req.getCookies();
		
		PrintWriter out = resp.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		for (Cookie cookie : Cookies) {
			out.print("Cookie Name = "+cookie.getName());
			out.print("<br>Cookie Value = "+cookie.getValue());
		}
		out.print("</body>");
		out.print("</html>");
	
	}
	
	

}
