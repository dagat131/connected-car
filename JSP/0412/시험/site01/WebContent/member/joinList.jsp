<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
                <%request.setCharacterEncoding("UTF-8"); %>
            <%@ page import ="java.sql.*" %>
            <%@ page import = "model.Db" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	//데이터베이스에 저장..

	Db db = new Db();
	Connection conn = db.dbConn();
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	int result = 0;


	
	try {
		//실행내용
		String driver = "com.mysql.jdbc.Driver";  //mysql, oracle
		String dbUrl = "jdbc:mysql://localhost:3306/sihum";  //데이터베이스 이름
		String dbUser = "sihum";								//데이터베이스사용자계정
		String dbPasswd = "1234";							//데이터베이스사용자계정비밀번호
		Class.forName(driver);
		conn = DriverManager.getConnection(dbUrl, dbUser, dbPasswd);
		
		//목록 (form뒤의 테이블명 변경해주고, 프린트문안의 칸이 값을 변경해주면 됨)
		String sql = "select * from member";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		out.println("아이디" + " / " + "비밀번호" + " / " + "이름" + " / " + "전화번호" + " / " + "직업" + " / " + "가입일" + "<br>"  );
		
		while (rs.next()) {
			out.println(rs.getString("id") + " / " + rs.getString("passwd") + " / "+ rs.getString("name") + " / "+ rs.getString("phone") + 
					" / "+ rs.getString("job") + " / "+ rs.getString("wdate") + "<br>");
			

		}

		
	}catch(Exception e){
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
	
	
%>
		
</body>
</html>