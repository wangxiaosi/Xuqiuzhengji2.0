package com.sisi.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sisi.dao.UserDao;
import com.sisi.model.GuiModel;
import com.sisi.model.InstitutionReInfoModel;
import com.sisi.model.JingjihangyeModel;
import com.sisi.model.SuoModel;
import com.sisi.service.UserManager;
import com.sisi.vo.InstitutionReInfoVo;

//action类

public class ShowSelectBoxAction extends ActionSupport {
	// 属性***************************************************************
	private List<GuiModel> Gui;
	private UserManager um;
	private UserDao ud;
	private String tiaojian;

	// setget函数*********************************************************

	public String getTiaojian() {
		return tiaojian;
	}

	public void setTiaojian(String tiaojian) {
		this.tiaojian = tiaojian;
	}

	public List<GuiModel> getGui() {
		return Gui;
	}

	public void setGui(List<GuiModel> gui) {
		Gui = gui;
	}

	public UserManager getUm() {
		return um;
	}

	@Resource(name = "userManager")
	public void setUm(UserManager um) {
		this.um = um;
	}

	public UserDao getUd() {
		return ud;
	}

	@Resource
	public void setUd(UserDao ud) {
		this.ud = ud;
	}
	// 其他函数************************************************************


	@SuppressWarnings("null")
	@Override
	public String execute() throws Exception {
		return "true";
	}

	// 通过ajax显示归口管理部门的众多选项
	public void showGui() throws IOException {
		HttpServletResponse response = (HttpServletResponse) ActionContext
				.getContext().get(
						org.apache.struts2.StrutsStatics.HTTP_RESPONSE);
		PrintWriter out = response.getWriter();
		// 将G中元素都转移到a中
		List<GuiModel> G = um.getGui();
		String[] a = new String[82];
		for (int i = 0; i < 82; i++) {
			a[i] = G.get(i).getGui();
		}
		Map map = new HashMap();
		map.put("gui", a);
		JSONObject json = JSONObject.fromObject(map);
		out.println(json);
	}

	// 通过ajax显示所在地域的众多选项
	public void showSuo() throws IOException {
		HttpServletResponse response = (HttpServletResponse) ActionContext
				.getContext().get(
						org.apache.struts2.StrutsStatics.HTTP_RESPONSE);
		PrintWriter out = response.getWriter();
		// 将G中元素都转移到a中
		List<SuoModel> S = um.getSuo();
		String[] a = new String[14];
		for (int i = 0; i < 14; i++) {
			a[i] = S.get(i).getTitle();
		}
		Map map = new HashMap();
		map.put("suo", a);
		JSONObject json = JSONObject.fromObject(map);
		out.println(json);
	}

	// 通过ajax显示已经填报过得机构信息
	@SuppressWarnings("unchecked")
	public void showJigou() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session1 = request.getSession(true);
		String user = session1.getAttribute("user").toString();

		HttpServletResponse response = (HttpServletResponse) ActionContext
				.getContext().get(
						org.apache.struts2.StrutsStatics.HTTP_RESPONSE);
		PrintWriter out = response.getWriter();

		Map map = new HashMap();
		map.put("institutionname", um.showInfo(user).getInstitutionname());
		map.put("email", um.showInfo(user).getEmail());
		map.put("address", um.showInfo(user).getAddress());
		map.put("contact", um.showInfo(user).getContact());
		map.put("contactnumber", um.showInfo(user).getContactnumber());
		map.put("contactnumber2", um.showInfo(user).getContactnumber2());
		map.put("suozaidiyu", um.showInfo(user).getSuozaidiyu());
		map.put("URL", um.showInfo(user).getURL());
		map.put("farendaibiao", um.showInfo(user).getFarendaibiao());
		map.put("postcode", um.showInfo(user).getPostcode());
		map.put("guikouguanlibumen", um.showInfo(user).getGuikouguanlibumen());
		map.put("contactchuanzhen", um.showInfo(user).getContactchuanzhen());
		map.put("jigoushuxing", um.showInfo(user).getJigoushuxing());
		map.put("jigoujianjie", um.showInfo(user).getJigoujianjie());
		JSONObject json = JSONObject.fromObject(map);
		out.println(json);
	}
	//显示一级目录
	public void showYi() throws IOException {
		HttpServletResponse response = (HttpServletResponse) ActionContext
				.getContext().get(
						org.apache.struts2.StrutsStatics.HTTP_RESPONSE);
		PrintWriter out = response.getWriter();
		
		// 将G中元素都转移到a中
		List<JingjihangyeModel> J = ud.getYi();
		String[] a = new String[20];
		String[] b = new String[20];
		for (int i = 0; i < 20; i++)//正好有二十个大行业
		{
			a[i] = J.get(i).getCode();//把代码放在a中
			b[i] = J.get(i).getTitle();//把行业名称放在b中
		}
		Map map = new HashMap();
		map.put("code", a);
		map.put("name", b);
		JSONObject json = JSONObject.fromObject(map);
		out.println(json);
	}
	//显示二级目录
	public void showEr() throws IOException {
		HttpServletResponse response = (HttpServletResponse) ActionContext
				.getContext().get(
						org.apache.struts2.StrutsStatics.HTTP_RESPONSE);
		PrintWriter out = response.getWriter();
		
		System.out.println("这是接收到的信息");
		System.out.println(":"+tiaojian);
		
		// 将G中元素都转移到a中
		List<JingjihangyeModel> J = ud.getEr(tiaojian);
		int length = J.size();
		String[] a = new String[length];
		String[] b = new String[length];
		for (int i = 0; i < length; i++)//正好有二十个大行业
		{
			a[i] = J.get(i).getCode();//把代码放在a中
			b[i] = J.get(i).getTitle();//把行业名称放在b中
		}
		Map map = new HashMap();
		map.put("code", a);
		map.put("name", b);
		JSONObject json1 = JSONObject.fromObject(map);
		out.println(json1);
	}
	//显示二级目录
	public void showSan() throws IOException {
		HttpServletResponse response = (HttpServletResponse) ActionContext
				.getContext().get(
						org.apache.struts2.StrutsStatics.HTTP_RESPONSE);
		PrintWriter out = response.getWriter();
		// 将G中元素都转移到a中
		List<GuiModel> G = um.getGui();
		String[] a = new String[82];
		for (int i = 0; i < 82; i++) {
			a[i] = G.get(i).getGui();
		}
		Map map = new HashMap();
		map.put("gui", a);
		JSONObject json = JSONObject.fromObject(map);
		out.println(json);
	}
	public void jieshou() throws IOException {
		System.out.println("这是接收到的信息2");
		setTiaojian(tiaojian);
	}
}
