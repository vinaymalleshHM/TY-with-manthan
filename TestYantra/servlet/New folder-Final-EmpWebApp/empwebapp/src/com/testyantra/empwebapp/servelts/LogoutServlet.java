package com.testyantra.empwebapp.servelts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Logout")
public class LogoutServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	HttpSession session = req.getSession();
	if (session != null) {
		session.invalidate();
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("you are successfully loged out");
		req.getRequestDispatcher("./LoginForm.html").include(req, resp);
		out.println("</body>");
		out.println("</html>");
		
		
		
	}
	else {
		req.getRequestDispatcher("./LoginForm.html").include(req, resp);
	}
	
	}
	
	

}
