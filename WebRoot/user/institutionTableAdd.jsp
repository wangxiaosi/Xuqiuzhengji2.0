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
<script type="text/javascript" src="../js/jquery-1.4.js"></script>
<script>
/* 接收归口管理部门信息 */
$(function() {
		var html = "";
		$.ajax({
					url : "../showGui",
					type : "post",
					dataType : "json",
					success : function(json) {
					                        /* alert(json.gui[0]); */
											for(var i=0;i<82;i++)
											{ 
										    	html += "<option value='" + json.gui[i] + "'>" + json.gui[i] + "</option>";
										    	
											}
								$("#guikouguanlibumen").html(html);
                                }
										});
					});
/*所在地域*/			
$(function() {
		var html = "";
		$.ajax({
					url : "../showSuo",
					type : "post",
					dataType : "json",
					success : function(json) {
					                        /* alert(json.gui[0]); */
											for(var i=0;i<14;i++)
											{ 
										    	html += "<option value='" + json.suo[i] + "'>" + json.suo[i] + "</option>";
										    	
											}
								$("#suozaidiyu").html(html);
                                }
										});
					});
/*输出已填机构信息*/			
$(function() {
		var html = "";
		$.ajax({
					url : "../ShowYitianInstitutionInfo",
					type : "post",
					dataType : "json",
					success : function(json) {
					    document.getElementById("institutionname").value = json.institutionname;
					    document.getElementById("email").value = json.email;
					    document.getElementById("address").value = json.address;
					    document.getElementById("contact").value = json.contact;
					    document.getElementById("contactnumber").value = json.contactnumber;
					    document.getElementById("contactnumber2").value = json.contactnumber2;
					    document.getElementById("URL").value = json.URL;
					    document.getElementById("farendaibiao").value = json.farendaibiao;
					    document.getElementById("postcode").value = json.postcode;
					    document.getElementById("contactchuanzhen").value = json.contactchuanzhen;
					    document.getElementById("jigoushuxing").value = json.jigoushuxing;
					    document.getElementById("jigoujianjie").value = json.jigoujianjie;
					     $("#guikouguanlibumen").append("<option value='"+ json.guikouguanlibumen +"'>" + json.guikouguanlibumen + "</option>");
					     $("#guikouguanlibumen").attr('selectedIndex', 82);
					     
					     $("#suozaidiyu").append("<option value='"+ json.suozaidiyu +"'>" + json.suozaidiyu + "</option>");
					     $("#suozaidiyu").attr('selectedIndex', 14);
					     if(json.jigoushuxing=="企业")
					     {
					         $("input[name=jigoushuxing]:eq(0)").attr("checked",'checked');
					     }
					     else if(json.jigoushuxing=="高等院校")
					     {
					         $("input[name=jigoushuxing]:eq(1)").attr("checked",'checked');
					     }
					     else if(json.jigoushuxing=="研究机构")
					     {
					         $("input[name=jigoushuxing]:eq(2)").attr("checked",'checked');
					     }
					     else
					     {
					         $("input[name=jigoushuxing]:eq(3)").attr("checked",'checked');
					     }
                                }
										});
					});

</script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="text/javascript" src="../sanji/sanji2.js"></script>
<script type="text/javascript" src="../sanji/sanji1.js"></script>

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
<script type="text/javascript">
$(document).ready(function(){
	getFirst_xq('OrgTechWork1');
	getFirst_xk('OrgSubject1');
});
	/* function tiaoZhuan1()
	{
		document.getElementById("tijiaoxingshi").value = "1";
		form1.submit();
	}
	function tiaoZhuan2()
	{ 
		document.getElementById("tijiaoxingshi").value = "2";
		form1.submit();
	} */
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

   </script>
<title>填报表格</title>
</head>
<body>
<form id="formInstitutionAdd" name="formInstitutionAdd" method="post" action="InstitutionInfoAddAction">
<table width="981" height="507" border="1">
  <tr>
    <td>*机构全称</td>
    <td>
		<input type="text"  
		name="institutionname" 
		id="institutionname"/>
    </td>
    <td width="173">归口管理部门</td>
    <td colspan="2">
      <select name="guikouguanlibumen" id="guikouguanlibumen">
 		 
        </select>
    </td>
  </tr>
  <tr>
    <td width="109">*通讯地址</td>
    <td width="176">
   			<input type="text"  name="address" onblur="checktong()" id="address" /><label><div id="addressmes" nowrap></div></label>
    </td>
    <td>*所在地域</td>
    <td colspan="2">
    <select name="suozaidiyu" id="suozaidiyu">			
        </select>
    </td>
  </tr>
  <tr>
    <td>网址</td>
    <td>
   	    <input type="text" name="URL" id="URL" />
    </td>
    <td>*电子信箱</td>
    <td colspan="2">
		 <input type="text" onblur="verifyAddress()" name="email" id="email"/><label><div id="mes" nowrap></div></label>
						
    </td>
  </tr>
  <tr>
    <td>法人代表</td>
    <td>
   			<input type="text" name="farendaibiao" id="farendaibiao" />
   	</td>
    <td>邮政编码</td>
    <td colspan="2">
   			<input type="text" onblur="youbiantest()" name="postcode" id="postcode" /><label><div id="yb" nowrap></div></label>
    </td>
  </tr>
  <tr>
    <td>*联系人</td>
    <td>
		 <input type="text" name="contact" id="contact"/>
    </td>
    
    <td>固定电话</td>
    <td colspan="2">
    <input type="text" name="contactnumber" id="contactnumber" /><label><div id="yb" nowrap></div></label>   
    </td>
  </tr>
  <tr>
    <td width="242">手机</td>
     <td>
		 <input type="text" name="contactnumber2"  onblur="CheckPhone()" id="contactnumber2"/><label><div id="shouji" nowrap></div></label>
     </td>
    <td>传真</td>
    <td colspan="2">
   			<input type="text" name="contactchuanzhen" id="contactchuanzhen" /><label><div id="yb" nowrap></div></label>
    </td>
  </tr>
  <tr>
    <td>*机构属性</td>
    <td colspan="4" nowrap="nowrap">
             <span id="RadioGroup1_0">
             <input type="radio" name="jigoushuxing" value="企业" id="jigoushuxing" checked/>
                                企业</span></label>
             <span id="RadioGroup1_0">
        	 <input type="radio" name="jigoushuxing" value="高等院校" id="jigoushuxing" />
        	  高等院校</span>
        	 <span id="RadioGroup1_0">
        	 <input type="radio" name="jigoushuxing" value="研究机构" id="jigoushuxing" />
        	   研究机构</span>
        	 <span id="RadioGroup1_0">
        	 <input type="radio" name="jigoushuxing" value="其他" id="jigoushuxing" />
        	  其他</span>
      </td>
  </tr>
  <tr>
    <td height="30" colspan="5">*机构简介（主要包括基本情况、现有研究基础等，限500字以内）</td>
  </tr>
  <tr>
    <td height="70" colspan="5">
		 <textarea name="jigoujianjie" id="jigoujianjie"  style="width:1060px;height:70px" onKeyDown="textCounter(jigoujianjie,remLen,500);" onKeyUp="textCounter(jigoujianjie,remLen,500);" required></textarea>
      您还可以输入:<input name="remLen" type="text" value="500" size="5" readonly>个汉字    
    </td>
  </tr>
  <tr>  
        <td height="34" colspan="5"> 
          <input type="button" name="button" id="button" value="提交" onclick="submit()"/>
          <input type="reset" name="button2" id="button2" value="重置" /></td>
      </tr>
      
</table>
</form>

</body>
</html>