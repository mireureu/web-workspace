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

	<%
		String[] arr = {"동운아나텍", "포스코홀딩스" , "포스코엠텍", "스튜디오미르", "딥노이드"};
		request.setAttribute("arr", arr);
	%>
	
	<jsp:forward page="cForEach6_view.jsp"/>

</body>
</html>