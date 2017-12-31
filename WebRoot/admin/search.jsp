<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<!-- <meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="stylesheet" href="lay/css/layui.css" />
<script src="layui.js" charset="utf-8"></script>
<script src="tree.js" charset="utf-8"></script> -->
<script src="https://cdn.bootcss.com/jquery/3.0.0-alpha1/jquery.min.js"></script>
<!-- <script type="text/javascript" src="js/jquery-1.4.js"></script> -->
<script src="treeAjax.js"></script>
<script src="tree.js"></script>

<script type="text/javascript"> 
function tianjia()
{
	if(document.all.txt.rows.length != 10)
	{
		var nextRow = document.all.txt.rows.length - 1;
		var nextRowX = document.all.txt.rows.length - 2;//检索词之间的关系比检索词小一，因为第一个没有检索关系
		//添加一行
		var newTr = txt.insertRow(2);
		//添加两列
		var newTd0 = newTr.insertCell();
		var newTd1 = newTr.insertCell();
		var newTd2 = newTr.insertCell();
		var newTd3 = newTr.insertCell();
		//设置列内容和属性
		newTd0.innerHTML = "<select style='width:100px;height:30px' name='jiansuoguanxi"+nextRowX+"'  id='jiansuoguanxi"+nextRowX+"'><option value='and'>并且</option><option value='or'>或者</option><option value='whitout'>不含</option></select>";
		newTd1.innerHTML = "<select style='width:150px;height:30px' name='jiansuotiaojian"+nextRow+"' id='jiansuotiaojian"+nextRow+"'><option value='demandname'>技术需求名称</option><option value='guanjianzi'>关键字</option><option value='jishuxuqiujiejuefangfa'>技术需求解决方式</option><option value='kejihuodongleixing'>科技活动类型</option><option value='xuekefenlei'>学科分类</option><option value='xuqiujishusuoshulingyu'>需求技术所属领域</option>	<option value='xuqiujishuyingyonghangye'>需求技术应用行业</option><option value='guishubumen'>管理处室</option></select>";
		newTd2.innerHTML = "<input style='width:331px;height:30px' type='text'  name='jiansuo"+nextRow+"' id='jiansuo"+nextRow+"' />";
		newTd3.innerHTML = "<select style='width:60px;height:30px' name='mohu"+nextRow+"' id='mohu"+nextRow+"'><option value='like'>模糊</option><option value='='>精确</option></select>";
	}
}
function jianshao()
{  
	if(document.all.txt.rows.length > 3)//前提是
	{
		document.all.txt.deleteRow(2);//总是删除第二行
	}
}
</script>	
<style type="text/css">
	ul{ 
	list-style-type: none; 
	margin:0px; 
	}  
	li{
	height:30px;
	
	}
	ul li a
	{ 
	display:block; 
	width: 100%;  
	}  
	ul li a:hover
	{ 
	background:#999; 
	}
	table{
	border-color: #e9e6e7;
	margin: 0 0 0 0;
	}
	th {
		height: 30px;
	}
.div_inline{
           display: inline;
       }
        /* 设置子节点属性 */
.tree_node_child{ 
margin-left: 30px;
}
 </style>
  <head>
  </head>
  <body>
  <form id="formSearch" name="formSearch" method="post" action="search.action">
  <div  id="left" style="float:left;padding-top: 0px;padding-left:0px;width:330px;">
  
  </div>
  <div id="right" style="float:right;padding-top: 0px;padding-right: 0px;">
  
  	  <table width="710" id="txt">
  	  <tr>
  	  <td colspan="5">
      需求相关信息
      </td>
      </tr>
  	  <tr>
  	      <td>
      	     <input onclick="tianjia()" type="button" style="width:30px;" value='+'/>
      	     &nbsp;
             <input onclick="jianshao()" type="button" style="width:30px;" value='-'/>
      	  </td>
          <td>
  			<select style="width:150px;height:30px" name="jiansuotiaojian1" id="jiansuotiaojian1">
 		    <option value='guanjianzi'>关键字</option>
 		    <option value='demandname'>技术需求名称</option>
 		    <option value='jishuxuqiujiejuefangfa'>技术需求解决方式</option>
 		    <option value='kejihuodongleixing'>科技活动类型</option>
 		    <option value='xuekefenlei'>学科分类</option>
 		    <option value='xuqiujishusuoshulingyu'>需求技术所属领域</option>	
 		    <option value='xuqiujishuyingyonghangye'>需求技术应用行业</option>
 		    <option value='guishubumen'>管理处室</option>		
            </select>
  		  </td>
  		  <td>
  		  <input style="width:331px;height:30px" type="text"  name="jiansuo1"id="jiansuo1" />
  		  </td>
  		  <td width="60">
  		  <select style="width:60px;height:30px" name="mohu1" id="mohu1">
 		    <option value='like'>模糊</option>
 		    <option value='='>精确</option>	
            </select>
  		  </td>
  	  </tr>
  	   <tr>
  	      <td width="100">
      	  </td>
          <td>
          </td>
          <td colspan="2" width="250">
  		  </td>
  		  <td>
  		  <input type = "submit" value = "搜索">
  		  </td>
  	  </tr>
  </table>
  </div>
  </form>
  </body>

</html>
