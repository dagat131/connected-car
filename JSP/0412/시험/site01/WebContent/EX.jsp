<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%for(int a = 2; a <= 9; a++){ %>
<table border = "1">
	<% for(int b = 1; b <= 9; b++){ %>
	<tr>
		<td><%=a %></td>
		<td>*</td>
		<td><%=b %></td>
		<td>=</td>
		<td><%=a*b %></td>
	</tr>
	<%} %>
</table>
<%} %>
</body>
</html>