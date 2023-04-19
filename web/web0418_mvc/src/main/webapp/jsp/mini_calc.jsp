<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> 간단 계산기 </h1>
	<form action = "mini_calc.do" method = "post">
		<input type = "number" name = "n1" value = "${param.n1}">
		<br>
		<input type = "radio" name = "opr" value="+" ${param.opr == "+"?"checked":""}>+
		<input type = "radio" name = "opr" value="-" ${param.opr == "-"?"checked":""}>-
		<input type = "radio" name = "opr" value="*" ${param.opr == "*"?"checked":""}>*
		<input type = "radio" name = "opr" value="/" ${param.opr == "/"?"checked":""}>/
		<input type = "radio" name = "opr" value="%" ${param.opr == "%"?"checked":""}>%
		<br>
		<input type = "number" name = "n2">
		<br>
		<input type = "submit" value = "계산하기">
	</form>
	<div id = "result">${ param.n1 } ${param["opr"]} ${param.n2} ${ result }</div>
</body>
</html>