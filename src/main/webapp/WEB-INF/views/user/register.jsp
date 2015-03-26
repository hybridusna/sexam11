<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/taglib.jspf" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>register.jsp</title>
</head>
<body>
<hr>
	<h1>User 등록</h1>
<hr>
<%-- <spring:message code="required"/> --%>
<form action="register" method="post">
<!-- 이름 -->
<label for="name"><spring:message code="label.user.name" text="이름 : "/></label>
<input id="name" name="name" value="${user.name }"/><br>
<!-- 나이 -->
<label for="age"><spring:message code="label.user.age" text="나이 : "/></label>
<input id="age" name="age" value="${user.age }"/><br>
<!-- 생일 -->
<label for="birthday"><spring:message code="label.user.birthday" text="생일 : "/></label>
<input id="birthday" name="birthday" value="${user.birthday}" /><br>
<!-- 등록/리셋 -->
<input type="submit" value="등록"/>
<input type="reset" value="clear"/>

</form>

</body>
</html>