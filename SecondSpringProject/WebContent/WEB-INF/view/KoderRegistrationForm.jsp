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
		<br><br>
		Sex:
		Male<form:radiobutton path="sex" value="Male"/>
		Female<form:radiobutton path="sex" value="Female"/>
		
		<br><br>
		Languages:
		English<form:checkbox path="languages" value="English"/>
		Spanish<form:checkbox path="languages" value="Spanish"/>
		Italian<form:checkbox path="languages" value="Italian"/>
		
		<br><br><br>
		
		Optional Subject:
		<br>
		<form:select path="optionalSubject" multiple="true">
			<form:option value="Desing"/>
			<form:option value="Angular"/>
			<form:option value="NodeJS"/>
		</form:select>
		
		<br><br><br>
		
		<input type="submit" value="Submit" />
		
	</form:form>

</body>
</html>