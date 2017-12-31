<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
  <head>
    
    <title>部门未审核需求管理界面</title>
  </head>
<style type="text/css">
.result{
    border-color: #e9e6e7;
    margin: auto;
    width:710px;
    text-align: center;
}
 
.result tr:nth-child(odd){
	height: 30px;
	width: 710px;
}
.result tr:nth-child(even){
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
.div_inline{
           display: inline;
       }
        /* 设置子节点属性 */
.tree_node_child{ 
margin-left: 20px;
}

 </style>
  <body>
    <%@ include file="fenlei.jsp"%>
    <div id="rightdown" style="border:1px solid #00E3E3;float:right;padding-top:0px;padding-right: 0px;height:10000px">
  	<table  align="center" border="1" cellspacing="0" class="result">
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
  			<a href="demanInfo2.action?demand.demandid=<s:property value="demandid"/>">详情</a>
  		</td>
  	</tr>
    </s:iterator>
  	
  	</table>
  	</div>
  </body>
</html>
