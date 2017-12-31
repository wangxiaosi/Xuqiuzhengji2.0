<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@page import="java.sql.*" %>   
<%@page import="java.util.*" %> 
<%@page import="java.text.*" %> 
<%@page import="java.util.Date"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="text/javascript" src="sanji/sanji2.js"></script>
<script type="text/javascript" src="sanji/sanji1.js"></script>
<script type="text/javascript" src="js/jquery-1.4.js"></script>
<style type="text/css">
 table{
border-color: #e9e6e7;
background:white;
margin: 0 auto;
}
 
 table tr:nth-child(odd){
background:white;
	height: 30px;
}
table tr:nth-child(even){
background:white;
	height: 30px;
}
th {
	height: 30px;
}
div{
      text-align: center;
}
 </style>
<title>个人信息</title>
</head>
<body>
<table width="981" height="507" border="1">
<s:iterator value="institution">
  <tr>
  <td>机构编号</td>
  <td colspan="3">
  <s:property value="institutionid"/>
  </td>
  </tr>
  <tr>
    <td>机构全称</td>
    <td>
    <s:property value="institutionname"/>
    </td>
    <td width="173">归口管理部门</td>
    <td colspan="2">
    <s:property value="guikouguanlibumen"/>
    </td>
  </tr>
  <tr>
    <td width="109">通讯地址</td>
    <td width="176">
   	<s:property value="address"/>
    </td>
    <td>所在地域</td>
    <td colspan="2">
    <s:property value="suozaidiyu"/>
    </td>
  </tr>
  <tr>
    <td>网址</td>
    <td>
   	<s:property value="URL"/>
    </td>
    <td>电子信箱</td>
    <td colspan="2">
	<s:property value="email"/>				
    </td>
  </tr>
  <tr>
    <td>法人代表</td>
    <td>
   	<s:property value="farendaibiao"/>
   	</td>
    <td>邮政编码</td>
    <td colspan="2">
   	<s:property value="postcode"/>
    </td>
  </tr>
  <tr>
    <td>联系人</td>
    <td>
	<s:property value="contact"/>
    </td>
    
    <td>固定电话</td>
    <td colspan="2">
    <s:property value="contactnumber"/> 
    </td>
  </tr>
  <tr>
    <td width="242">手机</td>
     <td>
	 <s:property value="contactnumber2"/>
     </td>
    <td>传真</td>
    <td colspan="2">
   	<s:property value="contactchuanzhen"/>
    </td>
  </tr>
  <tr>
    <td>机构属性</td>
    <td colspan="4" nowrap="nowrap">
    <s:property value="jigoushuxing"/>       
    </td>
  </tr>
  <tr>
    <td height="30" colspan="5">机构简介</td>
  </tr>
  <tr>
    <td height="70" width="1060" colspan="5">
    <s:property value="jigoujianjie"/> 
    </td>
  </tr>
</s:iterator>
</table>
</body>
</html>