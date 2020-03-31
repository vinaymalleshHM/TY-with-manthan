package com.testyantra.empwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;

import com.testyantra.empwebapp.bean.EmployeeInfoBean;
import com.testyantra.empwebapp.dao.EmployeeDAO;
import com.testyantra.empwebapp.dao.EmployeeDAOImpl;
@WebServlet("/addEmployee")
public class AddEmployee extends HttpServlet {

	EmployeeDAO dao = new EmployeeDAOImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession  session = req.getSession(false);

		if(session!=null) {
			
			//EmployeeInfoBean bean = (EmployeeInfoBean) session.getAttribute("Employee");


			PrintWriter out = resp.getWriter();
			int empId = Integer.parseInt(req.getParameter("empId"));
			String empName = req.getParameter("empName");
			int age = Integer.parseInt(req.getParameter("age"));
			double salary = Double.parseDouble(req.getParameter("salary"));
			String designation = req.getParameter("designation");
			long mobile = Long.parseLong(req.getParameter("mobile"));
			String password = req.getParameter("password");

			EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();
			employeeInfoBean.setEmpId(empId);
			employeeInfoBean.setEmpName(empName);
			employeeInfoBean.setAge(age);
			employeeInfoBean.setSalary(salary);
			employeeInfoBean.setDesignation(designation);
			employeeInfoBean.setMobile(mobile);
			employeeInfoBean.setPassword(password);

			out.print("<html>");
			out.print("<body>");
			if(dao.addEmployee(employeeInfoBean)) {
				out.print("<h1>Employee Added Succussfuly</h1>");

			}
			else {
				out.print("<h1>Employee  Not Added</h1>");
			}
			out.print("</body>");
			out.print("</html>");

		}
	}


}
