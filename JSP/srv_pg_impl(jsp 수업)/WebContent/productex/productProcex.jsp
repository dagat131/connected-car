<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 <% request.setCharacterEncoding("UTF-8"); %>  

<%@ page import = "DBmodel.ProductBean" %>    

<%@ page import = "DBmodel.ProductDAO" %>    

<jsp:useBean id="bean" class="DBmodel.ProductBean" scope="page">

<jsp:setProperty name="bean" property="*"/>
</jsp:useBean> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>

</head>

<body>

 <%
       ProductDAO dao = new ProductDAO();
       int result = dao.setInsert(bean);
       System.out.println("결과:" + result);

            if (result > 0){
         out.println("<script>");
         out.println("location.href='ProductListex.jsp';");
         out.println("</script>");
            } else {
         out.println("<script>");
         out.println("alert('오류발생')");
         out.println("location.href='ProductFormex.jsp';");
         out.println("</script>");
         	}

      %>

</body>

</html>

   