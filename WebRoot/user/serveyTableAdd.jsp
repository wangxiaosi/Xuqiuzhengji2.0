<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
<script type="text/javascript" src="../sanji/sanji2.js"></script>
<script type="text/javascript" src="../sanji/sanji1.js"></script>
<script type="text/javascript" src="../js/jquery-1.4.js"></script>
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
<script type="text/javascript">
$(document).ready(function(){
	getFirst_xq('OrgTechWork1');
	getFirst_xk('OrgSubject1');
});
	function tiaoZhuan1()
	{
		document.getElementById("shenhexs").value = "3";
		document.getElementById("shenhebm").value = "3";
		formServeyAdd.submit();
	}
	function tiaoZhuan2()
	{ 
		document.getElementById("shenhexs").value = "0";
		document.getElementById("shenhebm").value = "0";
		formServeyAdd.submit();
	}
 </SCRIPT>
<script type="text/javascript">
 //基础还有非基础验证*********************************************************************************
function jichu()    
{    
	study.style.display="";
    yingyonghangye.style.display="none";
	suoshulingyu.style.display="none";
}
function feijichu()    
{    
	study.style.display="none";
    yingyonghangye.style.display="";
	suoshulingyu.style.display="";
}
 </script>

 <script type="text/javascript">
//通信地址为空验证*********************************************************************************
function checktong() 
{
 var address = document.getElementById('address').value;
 if(address.replace(/(^s*)|(s*$)/g, "").length !=0)
 {
	 document.getElementById("addressmes").innerHTML="<font color='red'></font>"; 
   	 return true;
 }
 else    
 {    
      document.getElementById("addressmes").innerHTML="<font color='red'>通信地址不能为空!</font>";
      return false;    
 } 
}
 </script>
 
 <script type="text/javascript">
//技术需求名称为空验证*********************************************************************************
function checkji() 
{
 var jishuming = document.getElementById('jishuming').value;
 if(jishuming.replace(/(^s*)|(s*$)/g, "").length !=0)
 {
	 document.getElementById("jishumingmes").innerHTML="<font color='red'></font>"; 
   	 return true;
 }
 else    
 {    
      document.getElementById("jishumingmes").innerHTML="<font color='red'>通信地址不能为空!</font>";
      return false;    
 } 
}
 </script>

  <script type="text/javascript">
 </script>
<script type="text/javascript">
 //邮箱验证*********************************************************************************
function verifyAddress()    
{    
 var email = document.getElementById('email').value;    
 var pattern = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(.[a-zA-Z0-9_-])+/;    
 flag = pattern.test(email);    
 if(flag)    
 {    
	 document.getElementById("mes").innerHTML="<font color='red'></font>"; 
   	 return true;
 }    
 else    
 {    
  document.getElementById("mes").innerHTML="<font color='red'>邮箱格式有误!</font>";
  return false;    
 }    
} 
//手机号码验证*****************************************************************************
  function CheckPhone(){ 
    var phone = document.getElementById('contactnumber2').value;
	var pattern=/^1(3|4|5|7|8)\d{9}$/;//1 然后34578中的一位，然后没有限制，符合现实
	flag=pattern.test(phone);
	if(flag)
	{
		  document.getElementById("shouji").innerHTML="<font color='red'></font>";
	   	 return true;    
		}
   else    
	 {    
	  document.getElementById("shouji").innerHTML="<font color='red'>手机号码格式错误!</font>";
	  
	  return false;    
	 
    } 
}
//电话验证*******************************************************************************
/* function checkTel(){
	 var telphone = document.getElementById('Telephone').value;  
	 var pattern = /^(\(\d{3,4}\)|\d{3,4}-|\s)?\d{7,14}$/;
	 flag = pattern.test(telphone);
	 
	 if(flag)    
	 {    
		 document.getElementById("dianhua").innerHTML="<font color='red'></font>";
	   	 return true;    
	 }    
	 else    
	 {    
	  document.getElementById("dianhua").innerHTML="<font color='red'>电话格式有误!</font>";
	  
	  return false;    
	 }  

} */
//邮编验证*********************************************************************************
function youbiantest()    
{ 
	 var youbian = document.getElementById('postcode').value;  
	 var pattern = /^[0-9]{6}$/;
	 flag = pattern.test(youbian);
	 
	 if(flag)    
	 {    
		 document.getElementById("yb").innerHTML="<font color='red'></font>";
	   	 return true;    
	 }    
	 else    
	 {    
	  document.getElementById("yb").innerHTML="<font color='red'>邮编格式有误!</font>";
	  
	  return false;    
	 }  
}
//需求时限验证***********************************************************************
function YearYanzheng()
{
	var a = document.getElementById('startyear').value; 
	var b = document.getElementById('endyear').value;
	if(a>b)
	{
	    document.getElementById("mesyear").innerHTML="<font color='red'>请确保第一个年份小于等于第二个!</font>";
         document.getElementById("StartYear").focus();
         return false;
	}
	else
	{
		
		   document.getElementById("mesyear").innerHTML="<font color='red'></font>";
   	     return true;
	}
}

//字数限制*************************************************************
 function textCounter(field, countfield, maxlimit) {
// 函数，3个参数，表单名字，表单域元素名，限制字符；
if (field.value.length > maxlimit)
//如果元素区字符数大于最大字符数，按照最大字符数截断；
field.value = field.value.substring(0, maxlimit);
else
//在记数区文本框内显示剩余的字符数；
countfield.value = maxlimit - field.value.length;
}
//数值验证*************************************************************
 function touzi()    
{    
 var plansum = document.getElementById('PlanSum').value;    
 var pattern =/^(([1-9]\d{0,9})|0)(\.\d{1,2})?$/;    
 flag = pattern.test(plansum);    
 if(flag)    
 {    
	 document.getElementById("money").innerHTML="<font color='red'></font>";
   	 return true;    
 }    
 else    
 {    
  document.getElementById("money").innerHTML="<font color='red'>请输入数值!</font>";
  
  return false;    
 }    
} 
//输入框依次输入***********************************************************
function yici(){
var input1=document.getElementById("guanjianzi1").value;
var input2=document.getElementById("guanjianzi2").value;
var input3=document.getElementById("guanjianzi3").value;
var input4=document.getElementById("guanjianzi4").value;
var input5=document.getElementById("guanjianzi5").value;//通过id获得
if(input1=="")
 {
	guanjianzi2.readOnly=true;
	guanjianzi3.readOnly=true;
	guanjianzi4.readOnly=true;
	guanjianzi5.readOnly=true;
       
	}
	else
	{
		guanjianzi2.readOnly=false;
		
	}

 if(input2=="")
{
	guanjianzi3.readOnly=true;
	guanjianzi4.readOnly=true;
	guanjianzi5.readOnly=true;
}
else
{ 
	guanjianzi3.readOnly=false;
}
if(input3=="")
{
	guanjianzi4.readOnly=true;
	guanjianzi5.readOnly=true;
}
else
{ 
	guanjianzi4.readOnly=false;
}
if(input4=="")
{
	guanjianzi5.readOnly=true;
}
else
{ 
	guanjianzi5.readOnly=false;
}
}
   </script>
<title>填报表格</title>
</head>
<body>
<form id="formServeyAdd" name="formServeyAdd" method="post" action="DemandInfoAddAction">
<table width="981" height="507" border="1">
<tr>
    <td>*技术需求名称</td>
    <td>
    <INPUT TYPE="hidden"  id = "institutionid" name = "institutionid" value='<%=session.getAttribute("user")%>'>
    <input type="text" name="demandname" id="demandname"  />
    
    </td><label><div id="jishumingmes" nowrap></div></label>
    <td>*需求时限</td>
    <td>开始年限
    <select name="startyear" id="startyear">
    <option value="">--- 请选择 ---</option>
              <%  
                     StringBuffer bufYear = new StringBuffer();  
                     //下拉列表的年数  
                     for(int l=0;l<100;l++){  
                     //最小年  
                     int iYear = 2016+l;  
                     bufYear.append("<option value = '"+iYear+"'");  
                     Date date = new Date();  
                     int sYear = date.getYear();  
                     //系统时间从1900年开始  
                     int sYearc = sYear+1900;  
                     if(iYear == sYearc){  
                          bufYear.append(" selected");  
                      }  
                     bufYear.append(" >"+iYear+"</option>\n");  
                     }  
                     out.println(bufYear.toString());  
               %>  
      </select>
    </td>
    <td>到期年限
    <select name='endyear'id="endyear" onblur="YearYanzheng()">  
       <option value="">--- 请选择 ---</option>
              <%
                     StringBuffer bufYear2 = new StringBuffer();  
                     //下拉列表的年数  
                     for(int l=0;l<100;l++){  
                     //最小年  
                    
                     int iYear2 = 2016+l;  
                     bufYear2.append("<option value = '"+iYear2+"'");  
                     Date date = new Date();  
                     int sYear2 = date.getYear();  
                     //系统时间从1900年开始  
                     int sYearc2 = sYear2+1900;  
                      if(iYear2 == sYearc2){  
                          bufYear2.append(" selected");  
                      }  
                     bufYear2.append(" >"+iYear2+"</option>\n");  
                     }  
                     out.println(bufYear2.toString());  
               %>  
      </select>
    <label><div id="mesyear" nowrap></div></label></td>
  </tr>
  <tr>
    <td colspan="5">*技术需求概述</td>
  </tr>
  <tr>
    <td height="30" colspan="5">1、主要问题（需要解决的重大技术问题，限500字以内）</td>
  </tr>
  <tr>
    <td height="70" colspan="5">
    <textarea type="text" name="zhuyaowenti" id="zhuyaowenti" style="width:1060px;height:70px" onKeyDown="textCounter(zhuyaowenti,remLen1,500);" onKeyUp="textCounter(zhuyaowenti,remLen1,500);" required></textarea>
      您还可以输入:<input name="remLen1" type="text" value="500" size="5" readonly>个汉字</textarea>
    </td>
 </tr>
    <tr>
    <td height="30" colspan="5">2、技术关键（所需的关键技术、主要指标，限500字以内）</td>
  </tr>
  <tr>
    <td height="70" colspan="5">
      <textarea type="text" name="jishuguanjian" id="jishuguanjian" style="width:1060px;height:70px" onKeyDown="textCounter(jishuguanjian,remLen2,500);" onKeyUp="textCounter(jishuguanjian,remLen2,500);" required></textarea>
      您还可以输入:<input name="remLen2" type="text" value="500" size="5" readonly>个汉字</textarea>
    </td>
  </tr>
    <tr>
    <td height="30" colspan="5">3、预期目标（技术创新性、经济社会效益，限500字以内）</td>
  </tr>
  <tr>
    <td height="70" colspan="5">
      <textarea type="text" name="yuqimubiao" id="yuqimubiao" style="width:1060px;height:70px" onKeyDown="textCounter(yuqimubiao,remLen3,500);" onKeyUp="textCounter(yuqimubiao,remLen3,500);" required></textarea>
      您还可以输入:<input name="remLen3" type="text" value="500" size="5" readonly>个汉字</textarea>
    </td>
  </tr>
  <tr>
    <td colspan="5">*关键字（请依次输入）
    <input type="text" name="guanjianzi1" id="guanjianzi1" onblur="yici()" />
    <input type="text" name="guanjianzi2" id="guanjianzi2" readOnly=true  onblur="yici()"/>
    <input type="text" name="guanjianzi3" id="guanjianzi3" readOnly=true  onblur="yici()"/>
    <input type="text" name="guanjianzi4" id="guanjianzi4" readOnly=true  onblur="yici()"/>
    <input type="text" name="guanjianzi5" id="guanjianzi5" readOnly=true  onblur="yici()"/></td>
  </tr>
  <tr>
  <td colspan="2">拟投入资金总额</td>
    <td colspan="3">   
    <input type="text" name="nitouruzijinzonge" id="nitouruzijinzonge" style = "width:600px; height:20px;" />万元
    </td>
  </tr>
  <tr>
    <td colspan="2" rowspan="2">*技术需求解决方法</td>
    <td colspan="3">
      <label>
        <span id="RadioGroup3_0">
        <input type="radio" name="jishuxuqiujiejuefangfa" value="独立研发" id="RadioGroup31" checked/>独立研发</span></label>
        <span id="RadioGroup3_0">
        <input type="radio" name="jishuxuqiujiejuefangfa" value="委托研发" id="RadioGroup32" />委托研发</span>
        <span id="RadioGroup3_0">
        <input type="radio" name="jishuxuqiujiejuefangfa" value="合作研发" id="RadioGroup33" />合作研发</span>
        <span id="RadioGroup3_0">
        <input type="radio" name="jishuxuqiujiejuefangfa" value="其他" id="RadioGroup34" />其他</span>
        </td>
  </tr>
  <tr>
    <td colspan="2">合作意向单位</td>
    <td><input type="text" name="hezuoyixiangdanwei" id="hezuoyixiangdanwei" /></td>
  </tr>
  <tr>
    <td colspan="2">*科技活动类型 </td>
    <td colspan="3">
    <label>
        <span id="RadioGroup2_1">
        <input type="radio" name="kejihuodongleixing" value="基础研究"  onclick="jichu()" id="RadioGroup21" checked/> 基础研究</span></label>
        <span id="RadioGroup2_2">
        <input type="radio" name="kejihuodongleixing" value="应用研究" onclick="feijichu()" id="RadioGroup22" />应用研究</span>
        <span id="RadioGroup2_3">
        <input type="radio" name="kejihuodongleixing" value="试验发展" onclick="feijichu()" id="RadioGroup23" />试验发展</span>
        <span id="RadioGroup2_4">
        <input type="radio" name="kejihuodongleixing" value="研究与试验发展成果应用" onclick="feijichu()" id="RadioGroup24" />研究与试验发展成果应用</span>
        <span id="RadioGroup2_5">
        <input type="radio" name="kejihuodongleixing" value="技术推广与科技服务" onclick="feijichu()" id="RadioGroup25" />技术推广与科技服务</span>
        <span id="RadioGroup2_6">
        <input type="radio" name="kejihuodongleixing" value="生产性活动" onclick="feijichu()" id="RadioGroup26" />生产性活动</span>
        <label><div id="me" nowrap></div></label>
    &nbsp;</td>
  </tr>
  <tr id = "study" >
    <td colspan="2">学科分类（限基础研究填写）</td>
    <td colspan="3">
    <select name="OrgSubject1" id="OrgSubject1" onchange="changefirst_xk()"><option value=""></option> </select>
	<select name="OrgSubject2" id="OrgSubject2" onchange="changesecond_xk()"></select>
	<select name="OrgSubject3" id="OrgSubject3"></select>
    </td>
  </tr>
  <tr id="suoshulingyu"  style="display:none">
    <td colspan="2">需求技术所属领域（非基础研究填写,可多选)）</td>
    <td colspan="3">
      <p>
        <label>
          <input type="checkbox" name="xuqiujishusuoshulingyu" value="电子信息" id="CheckboxGroup1_1" />
          电子信息</label>
        <label>
          <input type="checkbox" name="xuqiujishusuoshulingyu" value="光机电一体化" id="CheckboxGroup1_2" />
          光机电一体化</label>
          <label>
          <input type="checkbox" name="xuqiujishusuoshulingyu" value="生物技术与制药" id="CheckboxGroup1_3" />
          生物技术与制药</label>
          <label>
          <input type="checkbox" name="xuqiujishusuoshulingyu" value="新材料及应用" id="CheckboxGroup1_4" />
          新材料及应用</label>
          <label>
          <input type="checkbox" name="xuqiujishusuoshulingyu" value="现代农业" id="CheckboxGroup1_5" />
          现代农业</label>
          <p>
          <label>
          <input type="checkbox" name="xuqiujishusuoshulingyu" value="新能源与高效节能" id="CheckboxGroup1_6" />
          新能源与高效节能</label>
          <label>
          <input type="checkbox" name="xuqiujishusuoshulingyu" value="资源与环境" id="CheckboxGroup1_7" />
         资源与环境</label>
          <label>
          <input type="checkbox" name="xuqiujishusuoshulingyu" value="高科技服务业" id="CheckboxGroup1_8" />
          高科技服务业</label>
          <label>
          <input type="checkbox" name="xuqiujishusuoshulingyu" value="海洋" id="CheckboxGroup1_9" />
          海洋</label>
          <label>
          <input type="checkbox" name="xuqiujishusuoshulingyu" value="社会公共事业" id="CheckboxGroup1_10" />
          社会公共事业</label>
          <label>
          <input type="checkbox" name="xuqiujishusuoshulingyu" value="医疗卫生" id="CheckboxGroup1_11" />
          医疗卫生</label>
          <label>
          <input type="checkbox" name="xuqiujishusuoshulingyu" value="其他" id="CheckboxGroup1_12" />
         其他</label>
          </td>
  </tr>
  <tr id="yingyonghangye" style="display:none">
    <td colspan="2">需求技术应用行业（非基础研究填写）</td>
    <td colspan="3">
     <select name="OrgTechWork1" id="OrgTechWork1" onchange="changefirst_xq()"><option value=""></option></select>
     <select name="OrgTechWork2" id="OrgTechWork2" onchange="changesecond_xq()"></select>
     <select name="OrgTechWork3" id="OrgTechWork3"></select>
    &nbsp;</td>
  </tr>
  <tr>  
        <td height="34" colspan="5"> 
        
          <INPUT TYPE="hidden"  id = "shenhexs" name = "shenhexs">
          <INPUT TYPE="hidden"  id = "shenhebm" name = "shenhebm">
          <INPUT TYPE="hidden"  id = "xsshenheyijian" name = "xsshenheyijian" value="none">
          <INPUT TYPE="hidden"  id = "bmshenheyijian" name = "bmshenheyijian" value="none">
          <INPUT TYPE="hidden"  id = "guishubumen" name = "guishubumen" value="none">
          
          <input type="button" name="button" id="button" value="保存不提交" onclick="tiaoZhuan1()"/>
          <input type="button" name="button" id="button" value="提交" onclick="tiaoZhuan2()"/>
          <input type="reset" name="button2" id="button2" value="重置" /></td>
      </tr>
</table>
</form>
</body>
</html>