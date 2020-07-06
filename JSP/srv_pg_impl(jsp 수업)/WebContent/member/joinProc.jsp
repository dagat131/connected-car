<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%request.setCharacterEncoding("UTF-8"); %>
    
    <%@ page import ="java.sql.*" %>
    <%@ page import = "DBmodel.Db" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	String id = request.getParameter("id");
	String passwd = request.getParameter("passwd");
	String name = request.getParameter("name");
	String phone = request.getParameter("phone");
	String job = request.getParameter("job");
	


	//데이터베이스 저장
	Db db = new Db();
	Connection conn = db.dbConn();
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	int result = 0;
	
	try {
		//실행내용
		String driver = "com.mysql.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3306/sihum";
		String dbUser = "sihum";
		String dbPasswd = "1234";
		
		Class.forName(driver);
		conn = DriverManager.getConnection(dbUrl, dbUser, dbPasswd);
		
		//추가..
		String sql = "insert into member values (?,?,?,?,?,now())";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, passwd);
		pstmt.setString(3, name);
		pstmt.setString(4, phone);
		pstmt.setString(5, job);
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
		out.println("location.href='joinList.jsp';");
		out.println("</script>");
	}else {
		out.println("<script>");
		out.println("alert('오류발생');");
		out.println("location.href='joinForm.jsp';");
		out.println("</script>");
	}
%>

</body>
</html>