<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
  <head>
    <title>需求管理界面</title>
  </head>
<!-- paste this code into your webpage -->
<link href="tablecloth/tablecloth.css" rel="stylesheet" type="text/css" media="screen" />
<script type="text/javascript" src="tablecloth/tablecloth.js"></script>
<!-- end -->
<style>
table{  
    border-bottom:1px solid silver;  
    border-right:1px solid silver;  
    width:100%;  
}  
  
.bordered {  
    border: solid #ccc 1px;  
    -moz-border-radius: 6px;  
    -webkit-border-radius: 6px;  
    border-radius: 6px;  
    -webkit-box-shadow: 0 1px 1px #ccc;   
    -moz-box-shadow: 0 1px 1px #ccc;   
    box-shadow: 0 1px 1px #ccc;           
}  
  
.bordered tr:hover {  
    background: #fbf8e9;  
    -o-transition: all 0.1s ease-in-out;  
    -webkit-transition: all 0.1s ease-in-out;  
    -moz-transition: all 0.1s ease-in-out;  
    -ms-transition: all 0.1s ease-in-out;  
    transition: all 0.1s ease-in-out;       
}      
      
.bordered td, .bordered th {  
    border-left: 1px solid #ccc;  
    border-top: 1px solid #ccc;  
    font-size:20px;  
}  
  
.bordered th {  
    background-color: #dce9f9;  
    background-image: -webkit-gradient(linear, left top, left bottom, from(#ebf3fc), to(#dce9f9));  
    background-image: -webkit-linear-gradient(top, #ebf3fc, #dce9f9);  
    background-image:    -moz-linear-gradient(top, #ebf3fc, #dce9f9);  
    background-image:     -ms-linear-gradient(top, #ebf3fc, #dce9f9);  
    background-image:      -o-linear-gradient(top, #ebf3fc, #dce9f9);  
    background-image:         linear-gradient(top, #ebf3fc, #dce9f9);  
    -webkit-box-shadow: 0 1px 0 rgba(255,255,255,.8) inset;   
    -moz-box-shadow:0 1px 0 rgba(255,255,255,.8) inset;    
    box-shadow: 0 1px 0 rgba(255,255,255,.8) inset;          
    border-top: none;  
    text-shadow: 0 1px 0 rgba(255,255,255,.5);   
}  
  
.bordered td:first-child, .bordered th:first-child {  
    border-left: none;  
}  
  
.bordered th:first-child {  
    -moz-border-radius: 6px 0 0 0;  
    -webkit-border-radius: 6px 0 0 0;  
    border-radius: 6px 0 0 0;  
}  
  
.bordered th:last-child {  
    -moz-border-radius: 0 6px 0 0;  
    -webkit-border-radius: 0 6px 0 0;  
    border-radius: 0 6px 0 0;  
}  
  
.bordered th:only-child{  
    -moz-border-radius: 6px 6px 0 0;  
    -webkit-border-radius: 6px 6px 0 0;  
    border-radius: 6px 6px 0 0;  
}  
  
.bordered tr:last-child td:first-child {  
    -moz-border-radius: 0 0 0 6px;  
    -webkit-border-radius: 0 0 0 6px;  
    border-radius: 0 0 0 6px;  
}  
  
.bordered tr:last-child td:last-child {  
    -moz-border-radius: 0 0 6px 0;  
    -webkit-border-radius: 0 0 6px 0;  
    border-radius: 0 0 6px 0;  
}  
.bordered td{  
    text-align:center;  
    padding-left:5px;  
}  
.td_right{  
    text-align:right;  
    padding-right:5px;  
} 
</style>
  <body>
  <div id="container">
  	<table class="bordered" cellspacing="0" border="0">
  	<thead> 
  	<tr>
  		<th>需求编号</th>
  		<th>需求名称</th>
  		<th>删除</th>
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
  		<td >
  			<a href="demandDelete.action?dinfo.demandid=<s:property value="demandid"/>">删除</a>
  		</td>
  		<td >
  			<a href="demandUpdate.action?dinfo.demandid=<s:property value="demandid"/>">详情</a>
  		</td>
  	</tr>
    </s:iterator>
  	</thead> 
  	<tbody id="tbody_$commonName$"></tbody>  
  	</table>
  	</div>
  </body>
</html>
