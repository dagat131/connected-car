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
<form name = "form" method ="post" action = "productProc.jsp">
<h2>상품등록</h2>
	
	<table border="1" width="600">
		<tr>
			<td>상품카테고리</td>
			<td><input type="radio" name = "cate" value="가구">가구 &nbsp;
			<input type="radio" name = "cate" value="의류">의류 &nbsp;
			<input type="radio" name = "cate" value="컴퓨터">컴퓨터 &nbsp;
			<input type="radio" name = "cate" value="가전">가전</td>
		</tr>
		<tr>
			<td>상품명</td>
			<td><input type = "text" name = "pname"></td>
		</tr>
		<tr>
			<td>가격</td>
			<td><input type = "text" name = "price"></td>
		</tr>
	</table>
	
	<input type="submit" value = "확인">

</form>
</body>
</html>