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
		String sql = "select * from product";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		out.println("순번" + " / " + "카테고리" + " / " + "상품명" + " / " + "가격" + " / " + "등록일" + "<br>"  );
		
		while (rs.next()) {
			out.println(rs.getString("no") + " / " + rs.getString("cate") + " / "+ rs.getString("pname") + " / "+ rs.getString("price") + 
					 " / "+ rs.getString("wdate") + "<br>");
			

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