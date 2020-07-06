<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%!
	String name = "홍길동";
	int kor = 90;
	int eng = 80;
	int mat = 80;
	int sci = 80;
	int sci2 = 90;
%>	
<% 	
out.println("============================<br>");
out.println("이름&nbsp;&nbsp; 국어&nbsp;&nbsp; 영어&nbsp;&nbsp; 수학&nbsp;&nbsp; 과학&nbsp;&nbsp; 과학2<br>");
out.println("============================<br>");
out.println(name); out.println(kor); out.println(eng); out.println(mat); out.println(sci); out.println(sci2);

%>
</body>
</html>