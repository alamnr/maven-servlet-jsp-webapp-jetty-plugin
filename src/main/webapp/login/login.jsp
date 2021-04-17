<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
<style type="text/css">
.error {
 color: red;
}
</style>
</head>
<body>
<c:if test="${ not empty error }">
 <p class="error">${error}</p>
</c:if>

 <c:if test="${not empty authenticationError}">
 <p class="error">${authenticationError}</p>
</c:if> 
	<form action="login" method="post">
		User Name: <input type="text" name="userName">
		Password : <input type="password" name="password">
		<input type="submit" value="login">
	</form>
</body>
</html>