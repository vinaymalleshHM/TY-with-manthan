package com.testyantra.empwebapp.util;

import com.testyantra.empwebapp.dao.EmployeeDAO;
import com.testyantra.empwebapp.dao.EmployeeDAOImpl;

public class EmployeeDAOImplManger {

	private EmployeeDAOImplManger() {

	}

	public static EmployeeDAO getDAOInstance() {
		return new EmployeeDAOImpl() ;

	}

}
