<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<style type="text/css">
body 
{ 
background-image: url('../skins/sky/mainframe/welcome.jpg'); 
background-repeat: no-repeat;
background-size:1000px 500px;
}
</style>
  <head>
  </head>
  
  <body>
    <h>欢迎使用本系统</h>
  </body>
</html>
