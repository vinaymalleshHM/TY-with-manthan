<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%!int a = 100;

	public void setA(int a) {
		this.a = a;
	}

	public int getA() {
		return a;
	}

	String name = "Venki Test Yantra";

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getName(String name) {
		return name;
	}%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <%boolean isTrue = true; %>
	<h2>Hellow User</h2>

	a1    = <%=a%><br> 
	a2    = <%=getA()%><br>
	Name1 = <%=name%><br> 
	Name2 = <%=getName()%><br> 
	Name3 = <%=getName("ABC")%><br>

	<%
		for (int i = 0; i < 5; i++) {
	%>

	<%=getName() %><br>
	<%
		}
	%>

</body>
</html>
<%-- <jsp:forward page="Date.html"></jsp:forward>--%><%--Static Resource --%>
<%--<jsp:forward page="/myFirstServlet"></jsp:forward>--%><%--Dynamic Resource --%>
<%--<jsp:include page="Date.html"></jsp:include>--%>
<jsp:include page="/myFirstServlet"></jsp:include>
