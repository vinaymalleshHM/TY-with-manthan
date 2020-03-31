package com.testyantra.empwebapp.dao;

import com.testyantra.empwebapp.bean.EmployeeInfoBean;

public interface EmployeeDAO {

	boolean addEmployee(EmployeeInfoBean employeeInfoBean) ;
	EmployeeInfoBean searchEmployee(int empId);
	EmployeeInfoBean auathenticate(int empId,String password);
	boolean upadateEmployee(EmployeeInfoBean employeeInfoBean);
	boolean deleteEmployee(EmployeeInfoBean employeeInfoBean); 
	
}
