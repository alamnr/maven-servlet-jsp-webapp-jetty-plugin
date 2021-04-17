<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<h1>Welcome ${students[0].name}</h1>
	<br>
	<c:forEach items="${students}" var="st">
	<%-- ${st.name} :   ${st.rollno } <br> --%>
	${st }<br>
	</c:forEach>
	<%-- Welcome <c:out value="${st.name}"></c:out> --%>
	<%-- <c:import url="https://www.udemy.com"></c:import> --%>
</body>
</html>