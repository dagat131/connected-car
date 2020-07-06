<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body >
<form name = "grade" method = "post" action = "gradeex.jsp">
<table align="center"  border = "1" width = "400" cellpadding = "0" cellspacing = "0">
<tr>
	<td height = "30" >이름 : </td>
	<td><input type = "text" name = "Exname" ></td>
	</tr>
	<tr>
		<td height = "30">국어 : </td>
		<td><input type = "text" name = "kor"></td>
	</tr>
	<tr>
		<td height = "30">영어 : </td>
		<td><input type = "text" name = "eng"></td>
	</tr>
	<tr>
		<td height = "30">수학 : </td>
		<td><input type = "text" name = "mat"></td>
	</tr>
	<tr>
		<td height = "30">과학 : </td>
		<td><input type = "text" name = "sci"></td>
	</tr>
	<tr>
		<td height = "30">역사 : </td>
		<td><input type = "text" name = "his"></td>
	</tr>
	
	<tr>
		<td height = "30" colspan = "2" align = "center">
			<input type = "button" value = "성적산출" onclick = "join()">
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
	
	 <tr>
	 	<td height = "30">취미 : </td>
        <td><input type = "checkbox" name = "hobby" value = "낚시">낚시&nbsp;
        <input type = "checkbox" name = "hobby" value = "등산">등산&nbsp;
        <input type = "checkbox" name = "hobby" value = "바둑">바둑&nbsp;
        <input type = "checkbox" name = "hobby" value = "골프">골프&nbsp;
        <input type = "checkbox" name = "hobby" value = "독서">독서&nbsp;
        <input type = "checkbox" name = "hobby" value = "운동">운동&nbsp;
        <input type = "checkbox" name = "hobby" value = "영화감상">영화감상&nbsp;</td>
	</tr>

</table>
</form>
</body>
</html>

<script>
function join(){
	var frm = document.grade;
	
	if (frm.Exname.value == ""){
			alert("이름를 입력하세요.")
			frm.Exname.focus();
			return false;
	}if (frm.kor.value == ""){
			alert("국어성적을 입력하세요.")
			frm.kor.focus();
			return false;
	}if (frm.eng.value == ""){
		alert("영어성적을 입력하세요.")
		frm.eng.focus();
		return false;
	}if (frm.mat.value == ""){
		alert("수학성적을 입력하세요.")
		frm.mat.focus();
		return false;
	}if (frm.sci.value == ""){
		alert("과학성적을 입력하세요.")
		frm.sci.focus();
		return false;
	}if (frm.his.value == ""){
		alert("역사성적을 입력하세요.")
		frm.his.focus();
		return false;
	}if(confirm("성적입력을 완료하셨습니까?")){
		alert('잠시 기다려주세요');
		grade.submit();
	}
		
		
	
}
</script>