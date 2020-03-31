<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">

</head>

<body>

	Hello ${param.koderName}. Welcome to Spring	course.

	<p><br>
		<h2>Attention everyone!!</h2>
		${name}
	
	</p>
	
	<img alt="profile picture" src="${pageContext.request.contextPath}/resources/images/hello_koder.png">

</body>
</html>