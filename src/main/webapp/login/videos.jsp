<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>videos</title>
</head>
<body>
	<% if(session.getAttribute("userName")== null){
			request.setAttribute("authenticationError", "You are not authenticated");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		%>
	<iframe width="933" height="525" src="https://www.youtube.com/embed/BoyVfoiPibI" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
</body>
</html>