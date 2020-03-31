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
@WebServlet("/Update")
public class UpdateServlet extends HttpServlet  {
	EmployeeDAO dao = new EmployeeDAOImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		HttpSession session = req.getSession(false);
		if (session != null) {
			
			long mobile = Long.parseLong(req.getParameter("mobile1"));
			
			int empId =  Integer.parseInt(req.getParameter("empId"));

			EmployeeInfoBean EmployeeInfoBean = new EmployeeInfoBean();

			EmployeeInfoBean.setMobile(mobile);
			EmployeeInfoBean.setEmpid(empId);
			
			
			if(dao.update(EmployeeInfoBean)) {
				out.println("<h2> Record update succesfully....<h2>");
				
			}
			else {
				out.println("<h2> unable to update Record....<h2>");
			}
		}
		else {
			out.println("<h2>please login First<h2>");
			req.getRequestDispatcher("./UpdateM.html").include(req, resp);
			
		}
	
		
		out.println("</body>");
		out.println("</html>");


	}}
