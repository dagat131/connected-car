<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%request.setCharacterEncoding("UTF-8"); %>
    
    <%@ page import ="java.sql.*" %>
    <%@ page import = "DBmodel.Db" %>
    <%@ page import="DBmodel.ProductBean" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	String cate = request.getParameter("cate");
	String pname = request.getParameter("pname");
	String pr = request.getParameter("price");
	int price = Integer.parseInt(pr);


	//데이터베이스 저장
	Db db = new Db();
	Connection conn = db.dbConn();
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	int result = 0;
	
	try {

		
		//추가..
		String sql = "insert into product values (?,?,?,?,now())";
		pstmt = conn.prepareStatement(sql);
		pstmt.setNull(1, java.sql.Types.NULL);
		pstmt.setString(2, cate);
		pstmt.setString(3, pname);
		pstmt.setInt(4, price);
		result = pstmt.executeUpdate();
		
		//목록
		
		//수정
		
		//삭제
		
	} catch(Exception e){
		e.printStackTrace();
	} finally {
		try {
			if (rs != null) { rs.close(); }
			if (pstmt != null) { pstmt.close(); }
			if (conn != null) { conn.close(); }
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
	if (result > 0) {
		out.println("<script>");
		out.println("location.href='productList.jsp';");
		out.println("</script>");
	}else {
		out.println("<script>");
		out.println("alert('오류발생');");
		out.println("location.href='productForm.jsp';");
		out.println("</script>");
	}
%>

</body>
</html>