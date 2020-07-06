<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%for(int i = 2; i<10; i++){ %>
<table border = "1">
		<%for(int j = 1; j<10; j++){ %>
		<tr>
			<td><%=i %></td>
			<td>*</td>
			<td><%=j %></td>
			<td>=</td>
			<td><%=i*j %></td>
		</tr>
		<%} %>
		
</table>
<br>
<%} %>


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