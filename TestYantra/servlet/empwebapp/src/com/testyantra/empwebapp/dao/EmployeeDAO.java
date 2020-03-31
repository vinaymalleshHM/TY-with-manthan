package com.testyantra.empwebapp.dao;

import com.testyantra.empwebapp.beans.EmployeeInfoBean;

public interface EmployeeDAO {
	
	 EmployeeInfoBean searchEmployee(int empId);
	 
	 boolean addEmployee(EmployeeInfoBean EmployeeInfoBean);

}//end of DAO
