<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("UTF-8"); %>
        
<%@ page import ="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String chief = request.getParameter("chief");
String chief2 = request.getParameter("chief2");
String chief3 = request.getParameter("chief3");
String chief4 = request.getParameter("chief4");
String chief5 = request.getParameter("chief5");

//데이터베이스에 저장..

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	int result = 0;
	
	try {
		//실행내용
		String driver = "com.mysql.jdbc.Driver";  //mysql, oracle
		String dbUrl = "jdbc:mysql://localhost:3306/exam";  //데이터베이스 이름
		String dbUser = "exam";								//데이터베이스사용자계정
		String dbPasswd = "1234";							//데이터베이스사용자계정비밀번호
		
		Class.forName(driver);
		conn = DriverManager.getConnection(dbUrl, dbUser, dbPasswd);
		
		//추가..
		String sql = "insert into boss_sub2 values (?,?,?,?,?,?)"; //boss 테이블에 넣는다!
		pstmt = conn.prepareStatement(sql);
		pstmt.setNull(1, java.sql.Types.NULL); //자릿수를 맞추기 위해 적는다.
		pstmt.setString(2, chief);
		pstmt.setString(3, chief2);
		pstmt.setString(4, chief3);
		pstmt.setString(5, chief4);
		pstmt.setString(6, chief5);
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
		out.println("location.href='exForm02List.jsp';");
		out.println("</script>");
	}else {
		out.println("<script>");
		out.println("alert('오류발생');");
		out.println("location.href='exForm02.jsp';");
		out.println("</script>");
	}
%>

</body>
</html>