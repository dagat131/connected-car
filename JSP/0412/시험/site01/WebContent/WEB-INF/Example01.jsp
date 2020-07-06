<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	String name = "Kim";
	int kor = 60;
	int eng = 70;
	int mat = 80;
	int sci = 80;
	int his = 70;
	int all = kor + eng + mat + sci + his;
	double avg = all / 5;
	

%>

<%
	String grade;
	if(avg >= 90){
		grade = "<font style = \"color:blue;\"><b>수</b></font>";
	}else if(avg >= 80){
		grade = "<font style = \"color:blue;\"><b>우</b></font>";
	}else if(avg >= 70){
		grade = "<font style = \"color:blue;\"><b>미</b></font>";
	}else if(avg >= 60){
		grade = "<font style = \"color:blue;\"><b>양</b></font>";
	}else {
		grade = "<font style = \"color:blue;\"><b>가</b></font>";
	}
%>


	<table border = "1">
	<tr>
		<td>이름</td>
		<td>국어</td>
		<td>영어</td>
		<td>수학</td>
		<td>과학</td>
		<td>역사</td>
		<td>총점</td>
		<td>평균</td>
	</tr>
	
	<tr>
		<td><%=name%></td>
		<td><%=kor%></td>
		<td><%=eng%></td>
		<td><%=mat%></td>
		<td><%=sci%></td>
		<td><%=his%></td>
		<td><%=all%></td>
		<td><%=avg%></td>
		
	</tr>
	</table>


</body>
</html>