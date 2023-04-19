<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String mid = request.getParameter("mid");
	String pwd = request.getParameter("pwd");
%>
<%
	if(mid.equals("xyz")){
		
	
%>
<jsp:forward page="hello.jsp"></jsp:forward>

<%
	}else{
		response.sendRedirect("form.jsp");
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>

</body>
</html>