<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome ${userName}</title>
<style type="text/css">

.error {
 color: red;
}

.success {
color: green;
}

</style>
</head>
<body>
<c:if test="${ not empty success }">
 <p class="success">${success}</p>
</c:if>
<c:if test="${ not empty fileExist }">
 <p class="error">${fileExist}</p>
</c:if>
		<% 
			response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // http 1.1
			response.setHeader("Pragma", "no-cache"); // http 1.0
			response.setHeader("Expires", "0");
			
			if(session.getAttribute("userName")== null){
				request.setAttribute("authenticationError", "You are not authenticated");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		%>
		
		Welcome ${userName}   &nbsp;&nbsp; <a href="videos.jsp">videos</a> <br>
		
		<form action="upload" method="post" enctype="multipart/form-data">
			<input type="file" name="file">
			<input type="submit">
		
		</form>
		<br><br>
		<form action="logout" method="post">
			<input type="submit" value="Logout">		
		</form>
		
</body>
</html>