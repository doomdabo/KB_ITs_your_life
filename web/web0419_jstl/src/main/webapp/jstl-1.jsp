<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${msg}
<c:if test = "${requestScope.msg!=''}">
Message : ${msg}
</c:if>
<c:if test = "${msg2==null}">
Message : 없음
</c:if>
<hr>
<c:forEach items = "${sa }" var = "s">
[ ${s}] <br>
</c:forEach>

<c:set var = "dan" value = "3"></c:set>
<c:forEach begin = "1" end = "9" var = "i">
${dan} * ${i } = ${dan* i } <br>
</c:forEach>

<hr>
<c:forEach items = "${dtos}" var = "dto">
MID : ${dto.mid} <br>
</c:forEach>
</body>
</html>
