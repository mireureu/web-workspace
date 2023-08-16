<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%-- URL 파라미터에서 이미지 ID 가져오기 --%>
<%
    String imageId = request.getParameter("id");
	System.out.println(imageId);
%>

</head>
<body>
	<h1><%= imageId %>의 정보</h1>
    

</body>
</html>