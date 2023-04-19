<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="mydto" class="web0418.dto.SimpleDto" scope = "page"></jsp:useBean>
<jsp:setProperty property = "*" name = "mydto"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	mid : ${mydto.mid}
	<br>
	singer : ${ mydto.singer[0] }

</body>
</html>