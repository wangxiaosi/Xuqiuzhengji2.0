<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
  <head>
    
    <title>已审核需求管理界面</title>
  </head>
<style type="text/css">
 table{
    border-color: #e9e6e7;
    background:white;
    margin: auto;
    width: 1100px;
    text-align: center;
}
 
 table tr:nth-child(odd){
    background:white;
	height: 30px;
	width: 1100px;
}
table tr:nth-child(even){
    background:white;
	height: 30px;
}
th {
	height: 30px;
	text-align: center;
}
td {
	text-align: center;
	height: 29px;
	font-size: 13px;
}
div{
    text-align: center;
}
 </style>
  <body>
  	<table align="center" border="1" cellspacing="0">
  	<tr>
  		<th>需求编号</th>
  		<th>需求名称</th>
  		<th>详情</th>
  	</tr>
  	<s:iterator value="demands">
  	<tr>
  		<td>
    	<s:property value="demandid"/>
  		</td>
  		<td>
    	<s:property value="demandname"/>
  		</td>
  		<td>
  			<a href="demanInfo.action?dinfo.demandid=<s:property value="demandid"/>">详情</a>
  		</td>
  	</tr>
    </s:iterator>
  	
  	</table>
  </body>
</html>
