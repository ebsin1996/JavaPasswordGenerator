<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String user=request.getParameter("username");

if(user==null){
out.println("Hello user");
}
else{
	out.println("Hello "+ user);
}
 int lenght=5;
 String letters="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
 out.println("Authentication key:\r");
 int i;
 for(i=0;i<6;i++){
	 Random random=new Random();
	 int index=random.nextInt(letters.length());
	 char sb=letters.charAt(index);
	 
	 out.println(sb);
 }
	 
	 
 
  



// out.println("autogenerated key"+x);
%>
</body>
</html>