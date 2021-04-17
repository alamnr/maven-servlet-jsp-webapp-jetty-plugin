<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.error {
  color: red;
}
</style>
 <!-- <meta http-equiv="refresh" content="0; url =demo" /> -->
  <meta http-equiv="refresh" content="0; url =login/login.jsp" />  
</head>
<body>
<c:if test="${ not empty error }">
 <p class="error">${error}</p>
</c:if>

<form action="add.jsp" method="post">
 Enter 1st number: <input type="text" name="num1">
 Enter 2nd number: <input type="text" name="num2">
 <input type="submit">
</form>
</body>
</html>
