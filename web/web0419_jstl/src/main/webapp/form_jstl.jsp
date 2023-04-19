<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test=  "${param.id!=null }"><!-- 어떤 값이 저장되어있다 -->
<b>${param.id }</b>
</c:if>
<c:if test=  "${param.id=='' }"><!-- 어떤 값이 저장되어있다 -->
<b>${param.id }</b>
</c:if>
<c:choose>
	<c:when test = "${param.color == 'blue'}">
	Color:blue
	</c:when>
	
	<c:when test = "${param.color == 'yellow'}">
	Color:yellow
	</c:when>
	
	<c:when test = "${param.color == 'orange'}">
	Color:orange
	</c:when>
	
	<c:when test = "${param.color == 'pink'}">
	Color:pink
	</c:when>
	<c:otherwise>
	Color: 알수없음
	</c:otherwise>
	
</c:choose>
</body>
</html>