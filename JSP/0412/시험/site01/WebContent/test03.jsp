<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name = "joinform" method = "post" action = "testProc.jsp">
<table border = "1" width = "300" cellpadding = "0" cellspacing = "0">
<tr>
		<td height = "30">ID : </td>
		<td><input type = "text" name = "userid"></td>
	</tr>
	<tr>
		<td height = "30">패스워드 : </td>
		<td><input type = "password" name = "pwd"></td>
	</tr>
		<tr>
		<td height = "30">패스워드 확인 : </td>
		<td><input type = "password" name = "pwd2"></td>
	</tr>
	<tr>
		<td height = "30">이름 : </td>
		<td><input type = "name" name = "name"></td>
	</tr>
	<tr>
		<td height = "30">생년월일</td>
		 
		<td><select name = "date">
			<%for(int i = 1970; i <= 2010; i++){ %>	
			<option value = "<%=i%>"><%=i%></option> 
			<%} %>
			</select>
		<select name = "month">
			<%for(int i = 1; i <= 12; i++){ %>	
			<option value = "<%=i%>"><%=i%></option> 
			<%} %>
			</select>
		
		<select name = "day">
			<%for(int i = 1; i <= 31; i++){ %>	
			<option value = "<%=i%>"><%=i%></option> 
			<%} %>
			</select>
			</td>
			
			</select>
		
	<tr>
		<td height = "30" colspan = "2" align = "center">
			<input type = "button" value = "가입하기" onclick = "join()">
		</td>
	</tr>
	
	<tr>
		<td height = "30">성별 : </td>
		<td>
			<input type = "radio" name = "gender" value = "M">남자
			&nbsp;&nbsp;&nbsp;
			<input type = "radio" name = "gender" value = "F" checked>여자
		</td>
		
	</tr>
		
</body>
</html>

<script>
function join(){
	var frm = document.joinform;
	
	if (frm.userid.value == ""){
			alert("아이디를 입력하세요.")
			frm.userid.focus();
			return false;
	}if (frm.pwd.value == ""){
			alert("비밀번호를 입력하세요.")
			frm.pwd.focus();
			return false;
	}if (frm.pwd2.value == ""){
		alert("비밀번호를 확인하세요.")
		frm.pwd2.focus();
		return false;
	}if(frm.pwd.value != frm.pwd2.value){
		alert("비밀번호가 다릅니다.")
		frm.pwd.value = "";
		frm.pwd2.value = ""; //공백
		
		frm.pwd.select();
		return false;
	}if(confirm("가입하시겠습니까?")){
		alert('계속진행...');
		joinform.submit();
	}else{
		alert('다음 기회에...')
	}
}
</script>
