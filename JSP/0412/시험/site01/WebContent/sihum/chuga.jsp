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
<form name = "test" method ="post" action = "cuhgaProc.jsp">
<h2>시험</h2>
	
	<table border="1" width="600">

		<tr>
			<td>1번 Q.</td>
			<td><input type="radio" name = "Q1" value="1">1번</td>
			<td><input type="radio" name = "Q1" value="2">2번</td>
			<td><input type="radio" name = "Q1" value="3">3번</td>
			<td><input type="radio" name = "Q1" value="4">4번</td>
			<td><input type="radio" name = "Q1" value="5">5번</td>
		</tr>
		<tr>
			<td>2번 Q.</td>
			<td><input type="radio" name = "Q2" value="1">1번</td>
			<td><input type="radio" name = "Q2" value="2">2번</td>
			<td><input type="radio" name = "Q2" value="3">3번</td>
			<td><input type="radio" name = "Q2" value="4">4번</td>
			<td><input type="radio" name = "Q2" value="5">5번</td>
		</tr>
		<tr>
			<td>3번 Q.</td>
			<td><input type="radio" name = "Q3" value="1">1번</td>
			<td><input type="radio" name = "Q3" value="2">2번</td>
			<td><input type="radio" name = "Q3" value="3">3번</td>
			<td><input type="radio" name = "Q3" value="4">4번</td>
			<td><input type="radio" name = "Q3" value="5">5번</td>
		</tr>		
		<tr>
			<td>4번 Q.</td>
			<td><input type="radio" name = "Q4" value="1">1번</td>
			<td><input type="radio" name = "Q4" value="2">2번</td>
			<td><input type="radio" name = "Q4" value="3">3번</td>
			<td><input type="radio" name = "Q4" value="4">4번</td>
			<td><input type="radio" name = "Q4" value="5">5번</td>
		</tr>		
		<tr>
			<td>5번 Q.</td>
			<td><input type="radio" name = "Q5" value="1">1번</td>
			<td><input type="radio" name = "Q5" value="2">2번</td>
			<td><input type="radio" name = "Q5" value="3">3번</td>
			<td><input type="radio" name = "Q5" value="4">4번</td>
			<td><input type="radio" name = "Q5" value="5">5번</td>
		</tr>
	
	</table>
		
		<input type="submit" value = "확인">
</form>
</body>
</html>