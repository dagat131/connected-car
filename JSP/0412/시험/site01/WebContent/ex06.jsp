<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style = "text-align:center;" >
	<input type = "image" src = "DYcom.png">
	<form name = form1 autocomplete ="on" action = "act01.jsp" formenctype = "multipart/form-data">
	
	아이디  <br><input type = "text" name = "아이디" value = "" size = "40" autofocus placeholder="@DYcom.com" required style = "text-align:right;"><br><br>
	비밀번호  <br><input type = "text" name = "아이디" value = "" size = "40" placeholder="비밀번호를 입력하세요" required><br><br>
	비밀번호 확인  <br><input type = "text" name = "아이디" value = "" size = "40" placeholder="비밀번호를 다시 입력하세요" required><br><br>
	<br><br>
	이름  <br><input type = "text" name = "이름" 	maxlength = "5" size = "40" placeholder = "ex)홍길동" required><br><br>
	</form>
	
	<form method = "post">
	생년월일 <br><input type = "month" name = "bdaymonth" size = "40" placeholder = "ex)1990-12-25" ><br><br>
	성별 <br><select name = "sex" ><br>
				<option value = "남자">남자</option>
				<option value = "여자">여자</option>
	</select>
	
	<div class="join_row join_mobile" id="mobDiv">
                    <h3 class="join_title"><label for="phoneNo">휴대전화</label></h3>
                    <div class="ps_box country_code">
                        <select id="nationNo" name="nationNo" class="sel" aria-label="전화번호 입력">
                                        <option value="233" >
     
                                            니카라과 +505
                                        </option>
                                        <option value="82" selected>
                                            대한민국 +82
                                        </option>
                                        <option value="45" >
                                            덴마크 +45
                                        </option>
                                        <option value="299" >
                                            덴마크령그린란드 +299
  
                                            리비아 +218
                                        </option>
                                        <option value="370" >
                                            리투아니아 +370
                                        </option>
                                        <option value="423" >
                                            리히텐슈타인 +423
                                        </option>
                                        <option value="261" >
                                            마다가스카르 +261
                                        </option>
                                        <option value="692" >
                                            마셜제도공화국 +692
                                        </option>
                                        <option value="691" >
                                            마이크로네시아연방 +691
                                        </option>
                                        <option value="853" >
                                            마카오 +853
                                        </option>
                                        <option value="389" >
                                            마케도니아공화국 +389
                                        </option>
                                        <option value="265" >
                                            말라위 +265
                                        </option>
                                        <option value="60" >
                                            말레이시아 +60
                                        </option>
                                        <option value="223" >
                                            말리 +223
                                        </option>
                                        <option value="52" >
                                            멕시코 +52
                                        </option>
                                        <option value="377" >
                                            모나코 +377
                                        </option>
                                        <option value="212" >
                                            모로코 +212
                                        </option>
                                        <option value="230" >
                                            모리셔스 +230
                                        </option>
                                        <option value="222" >
                                            모리타니아 +222
                                        </option>
                                        <option value="258" >
                                            모잠비크 +258
                                        </option>
                                        <option value="382" >
                                            몬테네그로 +382
                                        </option>
                                        <option value="373" >
                                            몰도바 +373
                                        </option>
                                        <option value="960" >
                                            몰디브 +960
                                        </option>
   
                        </select>
                        <br><br><input type = "tel" size = "40" name = "phone" pattern "[0-9]{3} - [0-9]{4} - [0-9]{4} placeholder = "ex)010-0000-0000"><br><br>
                        
                        <input type = "button" value = "가입하기">
	
	
	</form>
</body>
</html>