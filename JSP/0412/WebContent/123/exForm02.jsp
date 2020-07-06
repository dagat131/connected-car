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
<form name = "test" method ="post" action = "exForm02Proc.jsp">
<h2>선거</h2>
	
	<table border="1" width="600">
		<tr>
			<td>1반반장</td>
			<td><input type="radio" name = "chief" value="홍길동">홍길동1</td>
			<td><input type="radio" name = "chief" value="김철수">김철수1</td>
			<td><input type="radio" name = "chief" value="이영희">이영희1</td>
			<td><input type="radio" name = "chief" value="이영희">기찬호1</td>
		</tr>
		<tr>
			<td>2반반장</td>
			<td><input type="radio" name = "chief2" value="이승엽">이승엽2</td>
			<td><input type="radio" name = "chief2" value="박찬호">박찬호2</td>
			<td><input type="radio" name = "chief2" value="김병현">김병현2</td>
			<td><input type="radio" name = "chief2" value="기찬호">기찬호2</td>
		</tr>
		<tr>
			<td>3반반장</td>
			<td><input type="radio" name = "chief3" value="이승엽">이승엽3</td>
			<td><input type="radio" name = "chief3" value="박찬호">박찬호3</td>
			<td><input type="radio" name = "chief3" value="김병현">김병현3</td>
			<td><input type="radio" name = "chief3" value="이영희">기찬호3</td>
		</tr>
		<tr>
			<td>4반반장</td>
			<td><input type="radio" name = "chief4" value="이승엽">이승엽4</td>
			<td><input type="radio" name = "chief4" value="박찬호">박찬호4</td>
			<td><input type="radio" name = "chief4" value="김병현">김병현4</td>
			<td><input type="radio" name = "chief4" value="이영희">기찬호4</td>
		</tr>
		<tr>
			<td>5반반장</td>
			<td><input type="radio" name = "chief5" value="이승엽">이승엽5</td>
			<td><input type="radio" name = "chief5" value="박찬호">박찬호5</td>
			<td><input type="radio" name = "chief5" value="김병현">김병현5</td>
			<td><input type="radio" name = "chief5" value="이영희">기찬호5</td>

	</table>
	
	<input type="submit" value = "확인">
</body>
</html>