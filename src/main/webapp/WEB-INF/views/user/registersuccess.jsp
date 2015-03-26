<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="/WEB-INF/views/taglib.jspf" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<hr>
<h1>User 등록 성공</h1>
<hr>
<a href="register">User 등록화면으로 </a>
<br>
Error : ${error }
<br>
Name : ${user.name } <br>
Age : ${user.age } <br>
birthday : <fmt:formatDate value="${user.birthday }" pattern="yyyy/MM/dd"/>
<br>


</body>
</html>