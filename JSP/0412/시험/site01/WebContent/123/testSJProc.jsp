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
	String name = request.getParameter("name");
	
	String temp;
	String tempavg;

	temp = request.getParameter("kor");
	int kor = Integer.parseInt(temp);

	temp = request.getParameter("eng");
	int eng = Integer.parseInt(temp);
	
	temp = request.getParameter("mat");
	int mat = Integer.parseInt(temp);
	

	
	//데이터베이스 저장
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	int result = 0;
	
	try {
		//실행내용
		String driver = "com.mysql.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3306/exam";
		String dbUser = "exam";
		String dbPasswd = "1234";
		
		Class.forName(driver);
		conn = DriverManager.getConnection(dbUrl, dbUser, dbPasswd);
		
		//추가..
		String sql = "insert into sungjuk values (?,?,?,?,?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setNull(1, java.sql.Types.INTEGER); //자릿수를 맞추기 위해 적는다.
		pstmt.setString(2, name);
		pstmt.setInt(3, kor);
		pstmt.setInt(4, eng);
		pstmt.setInt(5, mat);
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
		out.println("location.href='testSJList.jsp';");
		out.println("</script>");
	}else {
		out.println("<script>");
		out.println("alert('오류발생');");
		out.println("location.href='testSJ.jsp';");
		out.println("</script>");
	}
%>
</body>
</html>