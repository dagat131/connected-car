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
String cate = request.getParameter("cate");
String pname = request.getParameter("pname");
String temp = request.getParameter("price");
int price = Integer.parseInt(temp);
String company = request.getParameter("company");

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
		String sql = "insert into product values (?,?,?,?,?,now())"; //boss 테이블에 넣는다!
		pstmt = conn.prepareStatement(sql);
		pstmt.setNull(1, java.sql.Types.NULL); //자릿수를 맞추기 위해 적는다.
		pstmt.setString(2, cate);
		pstmt.setString(3, pname);
		pstmt.setInt(4, price);
		pstmt.setString(5, company);
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
		out.println("location.href='list.jsp';");
		out.println("</script>");
	}else {
		out.println("<script>");
		out.println("alert('오류발생');");
		out.println("location.href='chuga.jsp';");
		out.println("</script>");
	}
%>
</body>
</html>