<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration Confirmation</title>
</head>
<body>

	Thanks for registering, <strong>${koder.firstName}</strong>. Welcome to the <strong>KodePrestige family</strong>.
	You will no longer be called <strong>${koder.firstName} ${koder.lastName}</strong>, now we will call you <strong>${koder.firstName} KodePrestige</strong>.
	
	<br><br><br>
	<strong>Age:</strong> ${koder.age}
	<br><br><br>
	<strong>Email:</strong> ${koder.email}
	<br><br><br>
	<strong>ZIP Kode:</strong> ${koder.zipKode}
	<br><br><br>
	<strong>Sex:</strong> ${koder.sex}
	<br><br><br>
	<strong>Languages:</strong> ${koder.languages}
	<br><br>
	
	Today you start with your <strong>${koder.optionalSubject }</strong> course.

</body>
</html>