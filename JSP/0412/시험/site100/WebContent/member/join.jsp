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
<form name = "form" method ="post" action = "joinProc.jsp">
<h2>회원가입</h2>
	
	<table border="1" width="600">
		<tr>
			<td>아이디 : </td>
			<td><input type = "text" name = "id"><br></td>
		</tr>
		<tr>
			<td>비밀번호 : </td>
			<td><input type = "text" name = "passwd"><br></td>
		</tr>
		<tr>
			<td>비밀번호확인 : </td>
			<td><input type = "text" name = "passwdChk"><br></td>
		</tr>
		<tr>
			<td>이름 : </td>
			<td><input type = "text" name = "name"><br></td>
		</tr>
		<tr>
			<td>전화번호 : </td>
			<td><input type = "text" name = "phone"><br></td>
		</tr>
	</table>
	
	<input type="submit" value = "확인">

</form>
</body>
</html>