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
	<td>Q1</td>
	<td>Q2</td>
	<td>Q3</td>
	<td>Q4</td>
	<td>Q5</td>
	<td>A1</td>
	<td>A2</td>
	<td>A3</td>
	<td>A4</td>
	<td>A5</td>
	<td>점수</td>
	<td>시간</td>
</tr>

<%
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
		
		//목록 (form뒤의 테이블명 변경해주고, 프린트문안의 칸이 값을 변경해주면 됨)
		String sql = "select * from sihum";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
			
			
/*
		while (rs.next()) { 
			out.println(rs.getInt("no") + " / " + rs.getString("Q1") + " / "+ rs.getString("Q2") + " / "+ rs.getString("Q3") + 
					" / "+ rs.getString("Q4") + " / "+ rs.getString("Q5") + " / " +  rs.getString("A1")+ " / "
					+  rs.getString("A2")+ " / "+  rs.getString("A3")+ " / "+  rs.getString("A4")+ " / "+  rs.getString("A5") + " / "
					+ rs.getString("wdate") + "<br>");
			*/
			

			
			/* 출력문 누적으로 하는법
			msg += rs.getInt("no");
			msg += " / ";
			msg += rs.getString("Q1");
			msg += " / ";
			msg += rs.getString("Q2");
			msg += " / ";
			msg += rs.getString("Q3");
			msg += " / ";
			msg += rs.getString("Q4");
			msg += " / ";
			msg += rs.getString("Q5");
			msg += " / ";
			msg += rs.getString("A1");
			msg += " / ";
			
			
			
			msg += rs.getInt("Jumsu");
			msg += " / ";
			
			msg += rs.getString("wdate");
			msg += "<br>"; //<br> 태그는 줄바꿈..
			
		}
		*/
		//out.println(msg);
		%>
		<% while(rs.next()) { %>
			<tr>
				<td><%=rs.getInt("no")%></td>
				<td><%=rs.getString("Q1")%></td>
				<td><%=rs.getString("Q2")%></td>
				<td><%=rs.getString("Q3")%></td>
				<td><%=rs.getString("Q4")%></td>
				<td><%=rs.getString("Q5")%></td>
				<td><%=rs.getString("A1")%></td>
				<td><%=rs.getString("A2")%></td>
				<td><%=rs.getString("A3")%></td>
				<td><%=rs.getString("A4")%></td>
				<td><%=rs.getString("A5")%></td>
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

		</table>
</body>
</html>