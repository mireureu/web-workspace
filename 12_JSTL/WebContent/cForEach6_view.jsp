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

	오늘 선택할 수 있는 떡상 목록들입니다.<br>
	
	<ul>
		<c:forEach items="${arr}" var="dish">
			<li>${dish}</li>
		</c:forEach>
	</ul>

</body>
</html>