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
	//세션을 새로 생성, 할당 - 모든 속성 사라짐
	session.invalidate();
%>
	session.invalidate();

</body>
</html>