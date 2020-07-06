<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border = "1" width = "500">
	<tr>
		<td bgcolor = "yellow">aaa</td>
		<td bgcolor = "red">bbb</td>
	</tr>
	</table>
	
	<%for(int a = 2; a < 10; a = a++){%>
			<table border = "1">
		
		<%for (int b = 1; b < 10; b++){%>
			<tr <%if(a%2 == 1){%>
			bgcolor = "yellow"<%}%>>
				<td><%=a %></td>
				<td>x</td>
				<td><%=b %></td>
				<td>=</td>
				<td><%=a*b %></td>
				<%} %><br>
			</tr>
			<%} %>
			
</body>
</html>