<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Koder Registration Form</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="koder">
		
		First Name: <form:input path="firstName"/>
		<br>
		Last Name: <form:input path="lastName"/>
		
		<br><br><br>
		
		<input type="submit" value="Submit" />
		
	</form:form>

</body>
</html>