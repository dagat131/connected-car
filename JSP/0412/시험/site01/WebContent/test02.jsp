<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<select name = "aa">
				<% String a = "2020-01-01 11:11:11".substring(0,4);		
				int b = Integer.parseInt(a);
				String imsi = "";
				for(int i = 1970; i <= 2020; i++){ %>	
					if(a==b){
						imsi = "selected";
					}else{
						imsi = "";
					}
				%>
				<option value = "<%=i%>"><%=i%></option> 
				  <%} %> 
				 
				 <%@page import = "java.util.Date" %>
				 <%@page import = "java.text.SimpleDateFormat" %>
				 <%
				 Date now = new Date();
				 SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				 String today = sf.format(now);
				 out.print(now + "<br" + today);
				 %>
				 
				==================================================================================================			
				 
				 <%@page import = "java.time.LocalDateTime"%>
				 <%@page import = "java.time.format.DateTimeFormatter" %>
				 
				 <%
				 LocalDateTime myDateObj = LocalDateTime.now();
				 System.out.println("Befor formatting : " + myDateObj);
				 DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
				 String formattedDate = myDateObj.format(myFormatObj);
				 out.println(formattedDate);
				 %>
				 
				 =================================================================================================
				 
				 
				
	</select>
</body>
</html>