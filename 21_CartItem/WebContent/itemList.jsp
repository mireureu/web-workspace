<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	h1{
		margin-left: 300px;
	}
	img{
		width: 300px;
		height: 250px;
	}
	/* table{
		border: solid 1px rgb(161, 161, 161);
		border-top: none;
		border-left: none;
		border-right: none;
	} */
</style>
<body>
	<h1>Fruit Total List</h1>
	<table>
	<thead>
		<tr>
			<td>
				<a href="itemView.jsp?id=딸기">
				<img src="img/berry.jpg" >
				</a>
				<p>상품명 : 딸 기</p>
				<p>가 격 : 4500원</p>
			</td>
			<td>
				<a href="itemView.jsp?id=포도">
				<img src="img/grape.jpg">
				</a>
				<p>상품명 : 포 도</p>
				<p>가 격 : 5000원</p>
			</td>
			<td>
				<a href="itemView.jsp?id=규울">
				<img src="img/gual.jpg">
				</a>
				<p>상품명 : 규 울</p>
				<p>가 격 : 4000원</p>
			</td>
			<td>
				<a href="">
				<img src="img/kiwi.jpg">
				</a>
				<p>상품명 : 키 위</p>
				<p>가 격 : 8000원</p>
			</td>
			<td>
				<a href="">
				<img src="img/lemon.jpg">
				</a>
				<p>상품명 : 레 몬</p>
				<p>가 격 : 3000원</p>
			</td>
		</tr>
		
	</thead>
	</table>
	<table>
		<hr></hr>
	</table>
</body>
</html>