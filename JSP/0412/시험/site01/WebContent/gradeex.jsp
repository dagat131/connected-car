<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>

<%
String name = request.getParameter("Exname");
String kor = request.getParameter("kor");
String eng = request.getParameter("eng");
String mat = request.getParameter("mat");
String sci = request.getParameter("sci");
String his = request.getParameter("his");
String gender = request.getParameter("gender");
String[] hobby = request.getParameterValues("hobby");


int all = Integer.parseInt(kor) + Integer.parseInt(eng) + Integer.parseInt(mat) + Integer.parseInt(sci)
 + Integer.parseInt(his);
double avg = all / 5;
%>

학생의 이름은 <%=name %> 입니다.<br>
학생의 국어성적은 <%=kor %> 입니다.<br>
학생의 영어성적은 <%=eng %> 입니다.<br>
학생의 수학성적은 <%=mat %> 입니다.<br>
학생의 과학성적은 <%=sci %> 입니다.<br>
학생의 역사성적은 <%=his %> 입니다.<br>
학생의 총점은 <%=all %> 입니다.<br>
학생의 평균은 <%=avg %> 입니다.<br>
학생의 성별은 <%=gender %> 입니다.<br>
학생의 취미는 
<%for(int i = 0; i <hobby.length; i++) {
			out.println(hobby[i]);
}%>
 입니다.
 <br>

