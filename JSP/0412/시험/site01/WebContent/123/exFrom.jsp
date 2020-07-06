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
<form name = "test" method ="post" action = "exFormProc.jsp">
<h2>선거</h2>
	
	<table border="1" width="600">
		<tr>
			<td>반장</td>
			<td><input type="radio" name = chief value="홍길동">홍길동</td>
			<td><input type="radio" name = chief value="김철수">김철수</td>
			<td><input type="radio" name = chief value="이영희">이영희</td>
		</tr>
		<tr>
			<td>부반장</td>
			<td><input type="radio" name = chief2 value="이승엽">이승엽</td>
			<td><input type="radio" name = chief2 value="박찬호">박찬호</td>
			<td><input type="radio" name = chief2 value="김병현">김병현</td>
		</tr>
		<tr>
			<td>회장</td>
			<td><input type="radio" name = chief3 value="이문세">이문세</td>
			<td><input type="radio" name = chief3 value="안성기">안성기</td>
			<td><input type="radio" name = chief3 value="이연복">이연복</td>
		</tr>
	</table>
	
	<input type="submit" value = "확인">

</body>
</html>