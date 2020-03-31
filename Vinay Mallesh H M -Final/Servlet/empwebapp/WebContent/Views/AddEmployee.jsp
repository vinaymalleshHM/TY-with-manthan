<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%String msg =(String)request.getAttribute("msg") ;%>
    <<jsp:include page="/home"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%if(msg!=null && !msg.isEmpty()){ %>
<h3><%=msg %></h3>
<%} %>
<form action="./addEmp" method="post">
		<table>

			<tr>


				<td>Employee Id</td>
				<td>:</td>
				<td><input type="number" name="empId" reuired></td>

			</tr>


			<tr>


				<td>Employee Name</td>
				<td>:</td>
				<td><input type="text" name="empName" reuired></td>

			</tr>

			<tr>


				<td>Age</td>
				<td>:</td>
				<td><input type="number" name="age" reuired></td>

			</tr>

			<tr>


				<td>Employee Salary</td>
				<td>:</td>
				<td><input type="number" name="salary" reuired></td>

			</tr>


			<tr>


				<td>Designation</td>
				<td>:</td>
				<td><input type="text" name="designation" reuired></td>

			</tr>


			<tr>


				<td>Mobile Number</td>
				<td>:</td>
				<td><input type="text" name="mobile" reuired></td>

			</tr>

			<tr>



				<td colspan="3" align="center"><input type="submit"></td>

			</tr>


		</table>


	</form>
</body>
</html>