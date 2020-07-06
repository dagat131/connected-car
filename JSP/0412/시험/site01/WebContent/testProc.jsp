<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>


<%
	String userid = request.getParameter("userid");
	String name = request.getParameter("name");
	String date = request.getParameter("date");
	String month = request.getParameter("month");
	String day = request.getParameter("day");
	String gender = request.getParameter("gender");
	
	//out.println("id 박스에서 넘어온 값은"  + userid +  "입니다.");
%>

<br>
아이디 박스에서 넘어온 값은   <%=userid%>  입니다.<br>
이름 박스에서 넘어온 값은  <%=name%>  입니다.<br>
생년월일 박스에서 넘어온 값은  <%=date%>/ <%=month%>/ <%=day %> 입니다.<br>
성별은 
<%
if(gender.equals("M")){
	out.println("남자입니다.");
} else if(gender.equals("F")){
	out.println("여자입니다.");
}
%>입니다. 
	<br>
