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
	<c:choose>
		<c:when test="${param.num eq '1'}">
			안녕하세요 천국행 열차에 탑승하신걸 환영합니다~
		</c:when>
		<c:when test="${param.num eq '2'}">
			탑승자 동운 다음역은 화성, 화성입니다.
		</c:when>
		<c:otherwise>
			동운 은하계 돌파
		</c:otherwise>
	</c:choose>
</body>
</html>