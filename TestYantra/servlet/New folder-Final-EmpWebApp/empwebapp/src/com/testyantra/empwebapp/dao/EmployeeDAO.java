package com.testyantra.empwebapp.dao;

import com.testyantra.empwebapp.beans.EmployeeInfoBean;

public interface EmployeeDAO {
	
	 EmployeeInfoBean searchEmployee(int empId);
	 
	 boolean addEmployee(EmployeeInfoBean EmployeeInfoBean);
	 
	 EmployeeInfoBean authenticate(int empId, String password);

	boolean update(EmployeeInfoBean employeeInfoBean);
	
	boolean Delete(EmployeeInfoBean employeeInfoBean);
	  
	 

}//end of DAO
