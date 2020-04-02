<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration Confirmation</title>
</head>
<body>

	Thanks for registering, ${koder.firstName}. Welcome to the KodePrestige family.
	You will no longer be called ${koder.firstName} ${koder.lastName}, now we will call you ${koder.firstName} KodePrestige.
	
	<br><br><br>
	Age: ${koder.age}
	<br><br><br>
	Sex: ${koder.sex}
	<br><br><br>
	Languages: ${koder.languages}
	<br><br>
	
	Today you start with your ${koder.optionalSubject } course.

</body>
</html>