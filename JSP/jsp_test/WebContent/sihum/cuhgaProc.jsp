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
String Q1 = request.getParameter("Q1");
String Q2 = request.getParameter("Q2");
String Q3 = request.getParameter("Q3");
String Q4 = request.getParameter("Q4");
String Q5 = request.getParameter("Q5");
int jumsu = 0;

String A1 = "";
String A2 = "";
String A3 = "";
String A4 = "";
String A5 = "";

String Ans[] = {"3","1","5","4","2"};

if(Q1.equals(Ans[0])){
	A1 = "O";
	jumsu += 20;
}else{
	A1 = "X";
}
if(Q2.equals(Ans[1])){
	A2 = "O";
	jumsu += 20;
}else{
	A2 = "X";
}
if(Q3.equals(Ans[2])){
	A3 = "O";
	jumsu += 20;
}else{
	A3 = "X";
}
if(Q4.equals(Ans[3])){
	A4 = "O";
	jumsu += 20;
}else{
	A4 = "X";
}
if(Q5.equals(Ans[4])){
	A5 = "O";
	jumsu += 20;
}else{
	A5 = "X";
}
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
		String sql = "insert into sihum values (?,?,?,?,?,?,?,?,?,?,?,?,now())"; //boss 테이블에 넣는다!
		pstmt = conn.prepareStatement(sql);
		pstmt.setNull(1, java.sql.Types.NULL); //자릿수를 맞추기 위해 적는다.
		pstmt.setString(2, Q1);
		pstmt.setString(3, Q2);
		pstmt.setString(4, Q3);
		pstmt.setString(5, Q4);
		pstmt.setString(6, Q5);
		pstmt.setString(7, A1);
		pstmt.setString(8, A2);
		pstmt.setString(9, A3);
		pstmt.setString(10, A4);
		pstmt.setString(11, A5);
		pstmt.setInt(12, jumsu);
		
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