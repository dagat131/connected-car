<%@page import="javafx.scene.layout.Border"%>
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
	int kor = 10;
	int eng = 10;
	int mat = 10;
	int sci = 10;
	int sci2 = 10;
	
	int all = kor + eng + mat + sci + sci2;
	double avg = all/5; 

	
%>	
	
	<% 	
	String grade;
	if(avg>=90){
		 grade = "<font style='color:blue;'><b>수</b></font>"; 
	}else if(avg>=80){
		 grade = "<font style='color:blue;'><b>우</b></font>"; 
	}else if(avg>=70){
		 grade = "<font style= <b>미</b></font>"; 
	}else if(avg>=60){
		 grade = "<font style= <b>양</b></font>"; 
	}else {
		 grade = "<font style='color:red;'><b>가</b></font>"; 
	}
	
	%>
	<table border = "1">
	<tr>
		<td>이름</td>
		<td>국어</td>
		<td>영어</td>
		<td>수학</td>
		<td>과학</td>
		<td>과학2</td>
		<td>총점</td>
		<td>평균</td>
		<td>등급</td>
	</tr>
	
	<tr>
		<td><%out.println(name);%></td>
		<td><%out.println(kor);%></td>
		<td><%=eng %></td>
		<td><%=mat %></td>
		<td><%=sci %></td>
		<td><%=sci2 %></td>
		<td><%=all %></td>
		<td><%=avg %></td>
		<td><%=grade %></td>
	</tr>
	</table>


</body>
</html>