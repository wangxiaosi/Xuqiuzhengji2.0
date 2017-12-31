<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@ page import="java.sql.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<script src="https://cdn.bootcss.com/jquery/3.0.0-alpha1/jquery.min.js"></script>
<style  type="text/css">
   /* 鼠标滑过，改变颜色 */
	ul li a:hover
	{ 
		background:#999;
	}
	/* 呈块状显示 */
	ul li a
	{
		display:block;
		width: 210px;
		/* 去掉下划线 */
		text-decoration:none;
	}
	/* 去掉点儿 */
	ul li
	{
	}
	ul li a.noline 
	{ 
		border-bottom:none; 
	}
	/* 让二级还有还有三级目录自动隐藏 */
	/* .second
	{
		display:none;
	}
	.third
	{
		display:none;
	} */
	.out1
	{
		
	}
</style>
  <SCRIPT LANGUAGE="JavaScript">
	$(function()
	{
	    $(".liulan").on('click','.first',function()
	    {
	        alert("执行了这个函数");
	    });
	});
 </SCRIPT>
  <head>
<jsp:useBean id="db"  class="com.sisi.model.DBean" scope="page" />
<jsp:useBean id="db1" class="com.sisi.model.DBean" scope="page" />
<jsp:useBean id="db2" class="com.sisi.model.DBean" scope="page" />
<!-- <link type="text/css" rel="stylesheet" href="style.css" /> -->
  </head>
  <body>
  <div class='div' style="float:left;border:1px solid #00E3E3;width: 350px;height:10000px">
			<%
				request.setCharacterEncoding("UTF-8");
				String Sql1 = "select * from xueke where Code like '__00000' order by Code";
				System.out.println(Sql1);
				ResultSet rs2 = db.executeQuery(Sql1);
				out.println("<ul class='out1'>");
				while (rs2.next()) {
				out.println("<li class='first' id = 'first" + rs2.getString("Code").substring(0,2) + "'><a style='font-weight:800;'><span>"+rs2.getString("Title")+"</span></a><ul class='out2'>");
				String Sql2 = "select * from xueke where Code like  '"+rs2.getString("Code").substring(0,2) +"___00' order by Code";
				System.out.println(Sql2);
					ResultSet rs3 = db1.executeQuery(Sql2);
					rs3.next();
					while(rs3.next()){
					out.println("<li class='second' id='second" + rs3.getString("Code").substring(0,5) + "'><a><span>"+rs3.getString("Title")+"</span></a><ul class='out3'>");
						ResultSet rs4 = db2.executeQuery("select * from xueke where Code like '"+rs3.getString("Code").substring(0,5)+"__'order by Code");
						rs4.next();
						while(rs4.next()){
								out.println("<li class='third' id='third" + rs4.getString("Code") + "'><a href='Demand_showXKFL.action?demandhelp.xuekefenlei="+rs4.getString("Code")+"' target='frmright'><span>"+
								rs4.getString("Title")+"</span></a></li>"
									);
						}
						out.println("</ul></li>");
					}
					out.println("</ul></li>");
				}
				out.println("</ul>");
			%>
  </div>
  </body>
</html>
