<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/jsp/data.jsp">rtyr</a>

<form action="${pageContext.request.contextPath}/insert.action" method="post">

<input placeholder="请输入姓名" id="name" name="name" type="text">
<input placeholder="请输入密码" id="psw" name="psw" type="text">
<button type="submit">添 加</button>
</form>


</body>
</html>