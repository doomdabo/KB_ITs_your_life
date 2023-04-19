<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Object o = session.getAttribute("mid");
	out.println("mid = " + o);
%>
<hr>
mid = ${sessionScope.mid}<br>
pwd = ${sessionScope.pwd}
</body>
</html>