<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%request.setCharacterEncoding("UTF-8"); %>
        <%@ page import = "model.MemberBean" %>
        <%@ page import = "model.MemberDAO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="bean" class="model.MemberBean" scope ="page">
	<jsp:setProperty name = "bean" property="*" />
	</jsp:useBean>
	
	<%
	if(bean.getPasswd().equals(bean.getPasswdChk())){
		
	}else{
		out.println("<script>");
		out.println("alert('비밀번호가 다릅니다. 다시 입력하세요');");
		out.println("location.href='productForm.jsp';");
		out.println("</script>");
	}
		
		
		MemberDAO dao = new MemberDAO();
		int result = dao.setInsert(bean);
		
		out.println(result);
		
		if (result>0){
			out.println("성공");
			
		}else {
			out.println("실패");
		}
	%>
</body>
</html>