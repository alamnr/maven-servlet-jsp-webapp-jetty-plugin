<%@page import="java.util.Scanner, java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" errorPage="error.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="fn"  uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jsp page</title>
</head>
<body>

	<%@ include file="/header.jsp" %>
	
	<%--
	<%! int coef = 3;
		Scanner scanner;
	%>
	<h1>Hello World!</h1>
	<% out.println(7+5); int k = 9;%>
	My favourite number is: <%= coef %> <br>
	
	 <%
		//String url = "jdbc:h2:~/h23/test";
		String url = "jdbc:h2:tcp://localhost/C:\Users\DELL\h23\test";
		String user = "sa";
		String password = "sa";
		String sql = "select * from account  where accountid = '3'";
		Class.forName("org.h2.Driver");
		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		rs.next();	
	%>
	
	Account name: <%= rs.getString("accountname") %> <br>
	Created by: <%=rs.getString("createdby") %> <br>
	Initial balance: <%=rs.getString(8) %> <br>
	Open date : <%=rs.getString(11) %><br>
	
	<% 
		request.setAttribute("label", "Chudna");
		RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
		rd.forward(request, response);
	%>
	 --%>
	<%-- <sql:setDataSource var="ds" driver="org.h2.Driver" url="jdbc:h2:tcp://localhost/C:\Users\DELL\h23\test" user="sa" password="sa"/>
	<sql:query var="rs" dataSource="${ds}" sql="select * from bank"></sql:query>
	
	<c:forEach items="${rs.rows}" var="bank">
	  <c:out value="${bank.bankid }"></c:out> : <c:out value="${bank.name }"></c:out> <br>
	
	</c:forEach> --%>
	
	<c:set var="str" value="Lorel ipsum dolor imit fuck and suck your ass"></c:set>
	
	Length: ${fn:length(str) } <br>
	
	index of : ${fn:indexOf(str,"fuck") } <br>
	
	is der : ${fn:contains(str,"suck") } <br>
	
	<c:if test="${fn:contains(str,'suck') }">
		suck is der
	</c:if>
	<br>
	 <c:choose>
	  <c:when  test="${fn:contains(str,'suckf') }">
		suck is der
	  </c:when>
	  <c:otherwise >
		fuck is der
	  </c:otherwise>
	</c:choose>
	
	
	<c:forEach items="${fn:split(str, ' ') }" var="s">
		<br><c:out value="${s }"></c:out>
	</c:forEach>
	
	<br>
	
	lower: ${fn:toLowerCase(str) }
	
	<br>
	
	upper: ${fn:toUpperCase(str) }
	
	
</body>
</html>