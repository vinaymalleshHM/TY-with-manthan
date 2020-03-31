package com.testyantra.empwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.testyantra.empwebapp.bean.EmployeeInfoBean;
import com.testyantra.empwebapp.dao.EmployeeDAO;
import com.testyantra.empwebapp.dao.EmployeeDAOImpl;

@WebServlet("/delete")
public class DeleteServlet  extends HttpServlet{

	EmployeeDAO dao = new EmployeeDAOImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession(false);
		if(session!=null) {

			int empId = Integer.parseInt(req.getParameter("empId"));

			EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();

			employeeInfoBean.setEmpId(empId);
			PrintWriter out = resp.getWriter();
			out.print("<html>");
			out.print("<body>");
			if (dao.deleteEmployee(employeeInfoBean)) {
				out.print("<h2>Employee Id </h2>"+empId+" <h3>is Deleted Successfully</h3>");
			}
			else {
				out.print("<h2>Employee Id </h2>"+empId+" <h3>is not Deleted </h3>");
			}
			out.print("</body>");
			out.print("</html>");
		}
	}


}
