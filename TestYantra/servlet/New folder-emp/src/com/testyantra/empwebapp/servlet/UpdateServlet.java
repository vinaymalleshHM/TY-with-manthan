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

@WebServlet("/updateServlet")
public class UpdateServlet extends HttpServlet {

	EmployeeDAO dao = new  EmployeeDAOImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session  = req.getSession(false);
		if(session!=null) {


			int empId = Integer.parseInt(req.getParameter("empId"));
			String password = req.getParameter("password");

			EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();


			employeeInfoBean.setEmpId(empId);
			employeeInfoBean.setPassword(password);

			PrintWriter out = resp.getWriter();
			out.print("<html>");
			out.print("<body>");

			if (dao.upadateEmployee(employeeInfoBean)) {

				out.print("<h2>Employee ID </h2>"+empId+" <h2>Upadated Successfully</h2>");

			}
			else {
				out.print("<h2>Employee ID  </h2>"+empId+" <h2>not Upadated</h2>");
			}
			out.print("</body>");
			out.print("</html>");


		}
	}

}
