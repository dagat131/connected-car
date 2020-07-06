<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("UTF-8"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 주석처리
	<h2>회원가입</h2>
	
	<table border="1" width="600">
		<tr>
			<td>아이디</td>
			<td><input type="text" name="id"></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type = "text" name = "password"></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input type = "text" name = "name"></td>
		</tr>
		<tr>
			<td>주소</td>
			<td><input type = "text" name = "adress"></td>
		</tr>
		<tr>
			<td>전화번호</td>
			<td><input type = "text" name = "tel"></td>
		</tr>
	</table>

	<h2>게시판</h2>
	
	<table border="1" width="600">
		<tr>
			<td>제목</td>
			<td><input type="text" name="subject"></td>
		</tr>
		<tr>
			<td>내용</td>
			<td><input type="text" name="content"></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type = "text" name = "password"></td>
		</tr>
-->

<form name = "form" method ="post" action = "layoutProc.jsp">
<h2>회원가입</h2>
	
	<table border="1" width="600">
		<tr>
			<td>아이디</td>
			<td><input type="text" name="id"></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type = "text" name = "password"></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input type = "text" name = "name"></td>
		</tr>

		<tr>
			<td>이메일</td>
			<td><input type = "text" name = "email"></td>
		</tr>
		<tr>
			<td>전화번호</td>
			<td><input type = "text" name = "phone"></td>
		</tr>
	</table>
	
	<input type="submit" value = "확인">

	
</form>	
</body>
</html>