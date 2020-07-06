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
<form name = "test" method ="post" action = "chugaProc.jsp">
<h2>선거</h2>
	
	<table border="1" width="600">
		
		<tr>
			<td>카테고리 : <input type="text" name = "cate" value=""></td>
			<td>상품명 : <input type="text" name = "pname" value=""></td>
			<td>가격 : <input type="text" name = "price" value=""></td>
			<td>제조사 : <input type="text" name = "company" value=""></td>
		</tr>		
	</table>
	
	<input type="submit" value = "확인">
</body>
</html>