<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% request.setCharacterEncoding("UTF-8"); %>

 

<%@ page import="java.sql.*" %>      

<%@ page import="java.util.ArrayList"%>

<%@ page import="DBmodel.ProductBean" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

public ArrayList<ProductBean> getSelectAll(){

   ArrayList<productBean> arrayList = new ArrayList<productBean>

   getConn();

   try{

       String sql = "select * from droduct";

       pstmt = conn.prepareStatement(sql);

       rs = pstmt.executeQuery();

       while (rs.next()) {

             ProductBean bean = new ProductBean();

             bean.setNo(rs.getInt("no"));

             bean.setCate(rs.getString("Cate"));

             bean.setPname(rs.getString("Pname"));

             bean.setPrice(rs.getString("Price"));
         

} 


</body>

 

</html>