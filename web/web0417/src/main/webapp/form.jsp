<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="mydto" class="web0417.dto.SimpleDto" scope = "page"></jsp:useBean>
<jsp:setProperty property = "*" name = "mydto"/>

<jsp:forward page="print_form.jsp"></jsp:forward>
