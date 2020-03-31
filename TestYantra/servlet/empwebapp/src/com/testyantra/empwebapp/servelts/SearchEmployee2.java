package com.testyantra.empwebapp.servelts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.testyantra.empwebapp.beans.EmployeeInfoBean;
import com.testyantra.empwebapp.dao.EmployeeDAO;
import com.testyantra.empwebapp.dao.EmployeeDAOImpl;
@WebServlet("/SearchEmployee2")
public class SearchEmployee2 extends HttpServlet{

	private EmployeeDAO dao = new EmployeeDAOImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int empIdVal =  Integer.parseInt(req.getParameter("empId"));


		EmployeeInfoBean EmployeeInfoBean = dao.searchEmployee(empIdVal);

		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");

		if (EmployeeInfoBean != null) {

			out.println("<h2> Employee ID "+empIdVal+" Found</h2>");
			out.println("Name = "+EmployeeInfoBean.getEmpName());
			out.println("<br>age = "+EmployeeInfoBean.getAge());
			out.println("<br>salary = "+EmployeeInfoBean.getSalary());
			out.println("<br>designation = "+EmployeeInfoBean.getDesignation());
			out.println("<br>mobile = "+EmployeeInfoBean.getMobile());

		}

		else {
			out.println("<h2 style='color:red;'> Employee ID "+empIdVal+" not Found</h2>");
		}
		out.println("</body>");
		out.println("</html>");

	}



}
