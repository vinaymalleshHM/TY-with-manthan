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
@WebServlet("/Delete")
public class DeleteServlet extends HttpServlet{
	EmployeeDAO dao = new EmployeeDAOImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int empId =  Integer.parseInt(req.getParameter("empId"));
		
		EmployeeInfoBean EmployeeInfoBean = new EmployeeInfoBean();
		EmployeeInfoBean.setEmpid(empId);
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		
		HttpSession session = req.getSession(false);
		if (session != null) {
			if(dao.Delete(EmployeeInfoBean)) {
				out.println("<h2> Record Deleted succesfully....<h2>");

			}
			else {
				out.println("<h2> unable to Delete Record....<h2>");
			}
		}
		else {
			out.println("<h2>please login First<h2>");
			req.getRequestDispatcher("./Delete.html").include(req, resp);

		}


		out.println("</body>");
		out.println("</html>");

	}



}
