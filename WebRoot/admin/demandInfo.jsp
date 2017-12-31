<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
  <head>
    <title>未审核需求管理界面</title>
  </head>
  <SCRIPT LANGUAGE="JavaScript">
	function jichu()    
    {    
		yijian.style.display="none";
	}
	function feijichu()    
	{    
		yijian.style.display="";
	}
 </SCRIPT>
<style type="text/css">
 table{
border-color: #e9e6e7;
background:white;
margin: auto;
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
  <body>
  <form id="formServeyAdd" name="formServeyAdd" method="post" action="tijiaoBu">
  <table width="981" height="507" border="1">
  <s:iterator value="demand">
  <tr>
  <td width="200"><b>技术需求编号</b></td>
  <td colspan="4"><s:property value="demandid"/></td>
  </tr>
  <tr>
    <td><b>技术需求名称</b></td>
    <td>
    <s:property value="demandname"/>
    </td>
    <td><b>需求时限</b></td>
    <td><b>开始年限</b><s:property value="startyear"/>
    </td>
    <td><b>到期年限</b><s:property value="endyear"/></td>
  </tr>
  <tr>
    <td colspan="5"><b>技术需求概述</b></td>
  </tr>
  <tr>
    <td height="30" colspan="5"><b>1、主要问题</b></td>
  </tr>
  <tr>
    <td height="70" colspan="5" width="1060" height="70">
    <s:property value="zhuyaowenti"/>
    </td>
 </tr>
    <tr>
    <td height="30" colspan="5"><b>2、技术关键</b></td>
  </tr>
  <tr>
    <td height="70" colspan="5" width="1060" height="70">
    <s:property value="jishuguanjian"/>
    </td>
  </tr>
    <tr>
    <td height="30" colspan="5"><b>3、预期目标</b></td>
  </tr>
  <tr>
    <td height="70" colspan="5" width="1060" height="70">
    <s:property value="yuqimubiao"/>
    </td>
  </tr>
  <tr>
    <td colspan="1"><b>关键字</b></td>
    <td colspan="4">
    <s:property value="guanjianzi"/>
    </td>
  </tr>
  <tr>
  <td colspan="1"><b>拟投入资金总额</b></td>
    <td colspan="4">   
    <s:property value="nitouruzijinzonge"/>元
    </td>
  </tr>
  <tr>
    <td colspan="1" rowspan="2"><b>技术需求解决方法</b></td>
    <td colspan="4">
      <s:property value="jishuxuqiujiejuefangfa"/>
        </td>
  </tr>
  <tr>
    <td colspan="1"><b>合作意向单位</b></td>
    <td colspan="3"><s:property value="hezuoyixiangdanwei"/></td>
  </tr>
  <tr>
    <td colspan="1"><b>科技活动类型</b></td>
    <td colspan="4">
    <s:property value="kejihuodongleixing"/>
    </td>
  </tr>
  <tr id = "study" >
    <td colspan="1"><b>学科分类</b></td>
    <td colspan="4">
    <s:property value="xuekefenlei"/>
    </td>
  </tr>
  <tr id="suoshulingyu">
    <td colspan="1"><b>需求技术所属领域</b></td>
    <td colspan="4">
      <s:property value="xuqiujishusuoshulingyu"/>
  </tr>
  <tr id="yingyonghangye">
    <td colspan="1"><b>需求技术应用行业</b></td>
    <td colspan="4">
     <s:property value="xuqiujishuyingyonghangye"/>
     </td>
  </tr>
   </s:iterator>
</table>
    </form>
  </body>
</html>
