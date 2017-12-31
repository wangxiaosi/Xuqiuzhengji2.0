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
	window.onload=button;
	function button()
	{/*用来让提交过的需求的提交按钮还有意见消失*/
	    var xs = document.getElementById("xs").value;
	    if(xs!="0")
	    {
	        shenhejieguo.style.display="none";
	        tijiaobumen.style.display="none";
	        yijian.style.display="none";
	        butt.style.display="none";
	    }
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
  <form id="formServeyAdd" name="formServeyAdd" method="post" action="tijiaoXing">
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
  <tr id="tijiaobumen">
  <td colspan="1"><b>提交部门</b></td>
  <td colspan="4">
   <select  size="1" id="guishubumen" name="guishubumen">
        <option value="办公室">办公室</option>
        <option value="人事处">人事处</option>
        <option value="机关党委">机关党委</option>
        <option value="政策法规处">政策法规处</option>
        <option value="计划财务处">计划财务处</option>
        <option value="平台与基础处">平台与基础处</option>
        <option value="国际合作处">国际合作处</option>
        <option value="高新技术处">高新技术处</option>
        <option value="农村科技处">农村科技处</option>
        <option value="社会发展处">社会发展处</option>
        <option value="成果与市场处">成果与市场处</option>
        <option value="监察室">监察室</option>
        <option value="离退休干部处">离退休干部处</option>
        <option value="半干旱中心">半干旱中心</option>
        <option value="山办">山办</option>
        <option value="机关服务中心">机关服务中心</option>
        <option value="科技研发中心">科技研发中心</option>
        <option value="科技情报研究院">科技情报研究院</option>
        <option value="器材公司">器材公司</option>
        <option value="基金办">基金办</option>
        <option value="档案馆">档案馆</option>
        <option value="科技管理信息中心">科技管理信息中心</option>
        <option value="科技投资中心">科技投资中心</option>
        <option value="成果转换中心">成果转换中心</option>
        <option value="中小企业创新资金管理中心">中小企业创新资金管理中心</option>
        <option value="对外交流中心">对外交流中心</option>
        <option value="知识产权局">知识产权局</option>
      </select>
  </td>  
  </tr>
  <tr id="shenhejieguo">
  <td colspan="1"><b>审核结果</b></td>
  <td colspan="4">
  <input TYPE="hidden" 
  value="<s:property value="shenhexs"/>" 
  name="xs" id="xs">
   <span id="RadioGroup2_1">
        <input type="radio" name="shenhexs" value="1"  onclick="jichu()" id="shenhexs1" checked/>通过</span></label>
        <span id="RadioGroup2_2">
        <input type="radio" name="shenhexs" value="2" onclick="feijichu()" id="shenhexs2" />不通过</span>
  </td>  
  </tr>
  <tr  id="yijian" style="display:none">
  <td colspan="1"><b>审核意见</b></td>
  <td colspan="4">
  <textarea type="text" name="xsshenheyijian" id="xsshenheyijian" style="width:760px;height:70px"required></textarea>
  </td>  
  </tr>
  <tr id="butt">
  <td colspan="5">
  <input TYPE="hidden" value="<s:property value="demandid"/>" name="demandid" id="demandid">
  <INPUT TYPE="button" value="提交" onclick="submit()">
  </td> 
  </tr>
   </s:iterator>
</table>
    </form>
  </body>
</html>
