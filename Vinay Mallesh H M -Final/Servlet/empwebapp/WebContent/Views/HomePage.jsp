<%@page import="com.testyantra.empwebapp.beans.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%EmployeeInfoBean employeeInfoBean = (EmployeeInfoBean)session.getAttribute("EmployeeInfoBean") ;%>
<%-- EmployeeInfoBean employeeInfoBean = (EmployeeInfoBean)request.getAttribute("EmployeeInfoBean") ;bcz the scope of req is only for req we 
        set the attributes for session %>--%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1"> 
<title>Insert title here</title>
</head>
<body>
<h3 style="color:cyan;">Hello <%=employeeInfoBean.getEmpName() %>!</h3>
<a href="./searchEmployeeForm">Search Employee</a><br>
<a href="./addEmployeeForm">Add Employee</a><br>
<a href="./UpdateEmployeeForm">Upadte Employee</a><br>
<a href="./deleteEmployeeForm">Delete Employee</a><br>
<a href="./seeAllEmployee">See All Employee</a><br>
<a href="./Logout1">Logout</a><br>
</body>
</html>