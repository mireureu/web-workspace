<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<title>Insert title here</title>
</head>
<body>
	
 	<c:forEach var="cnt" begin="1" end="6" step="1">
		<h${cnt}>Hello~~ JSTL!!</h${cnt}>
	</c:forEach>  
</body>
</html>