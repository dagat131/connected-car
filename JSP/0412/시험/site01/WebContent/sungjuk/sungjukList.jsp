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
<table border="1" width="800">

<tr>

<style> 
  table {
    width: 100%;
    border-top: 1px solid #444444;
    border-collapse: collapse;
  }
  th, td {
    border-bottom: 1px solid #444444;
    padding: 10px;
    text-align: center;
  }
  thead tr {
    background-color: #0d47a1;
    color: #ffffff;
  }
  tbody tr:nth-child(2n) {
    background-color: #bbdefb;
  }
  tbody tr:nth-child(2n+1) {
    background-color: #e3f2fd;
  }
</style>

	<td>no</td>
	<td>이름</td>
	<td>시험</td>
	<td>Q1</td>
	<td>Q2</td>
	<td>Q3</td>
	<td>Q4</td>
	<td>Q5</td>
	<td>점수</td>
	<td>시간</td>
</tr>

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
		String sql = "select * from sungjuk";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		%>
		<% while(rs.next()) { %>
		<tr>
			<td><%=rs.getInt("no")%></td>
			<td><%=rs.getString("name")%></td>
			<td><%=rs.getString("sname")%></td>
			<td><%=rs.getString("mun_1")%></td>
			<td><%=rs.getString("mun_2")%></td>
			<td><%=rs.getString("mun_3")%></td>
			<td><%=rs.getString("mun_4")%></td>
			<td><%=rs.getString("mun_5")%></td>
			<td><%=rs.getString("jumsu")%></td>
			<td><%=rs.getString("wdate")%></td>
			<br>
		</tr>
	<%} %>
	
	<%
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