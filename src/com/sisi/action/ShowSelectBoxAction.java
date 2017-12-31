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

//action��

public class ShowSelectBoxAction extends ActionSupport {
	// ����***************************************************************
	private List<GuiModel> Gui;
	private UserManager um;
	private UserDao ud;
	private String tiaojian;

	// setget����*********************************************************

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
	// ��������************************************************************


	@SuppressWarnings("null")
	@Override
	public String execute() throws Exception {
		return "true";
	}

	// ͨ��ajax��ʾ��ڹ����ŵ��ڶ�ѡ��
	public void showGui() throws IOException {
		HttpServletResponse response = (HttpServletResponse) ActionContext
				.getContext().get(
						org.apache.struts2.StrutsStatics.HTTP_RESPONSE);
		PrintWriter out = response.getWriter();
		// ��G��Ԫ�ض�ת�Ƶ�a��
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

	// ͨ��ajax��ʾ���ڵ�����ڶ�ѡ��
	public void showSuo() throws IOException {
		HttpServletResponse response = (HttpServletResponse) ActionContext
				.getContext().get(
						org.apache.struts2.StrutsStatics.HTTP_RESPONSE);
		PrintWriter out = response.getWriter();
		// ��G��Ԫ�ض�ת�Ƶ�a��
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

	// ͨ��ajax��ʾ�Ѿ�����û�����Ϣ
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
	//��ʾһ��Ŀ¼
	public void showYi() throws IOException {
		HttpServletResponse response = (HttpServletResponse) ActionContext
				.getContext().get(
						org.apache.struts2.StrutsStatics.HTTP_RESPONSE);
		PrintWriter out = response.getWriter();
		
		// ��G��Ԫ�ض�ת�Ƶ�a��
		List<JingjihangyeModel> J = ud.getYi();
		String[] a = new String[20];
		String[] b = new String[20];
		for (int i = 0; i < 20; i++)//�����ж�ʮ������ҵ
		{
			a[i] = J.get(i).getCode();//�Ѵ������a��
			b[i] = J.get(i).getTitle();//����ҵ���Ʒ���b��
		}
		Map map = new HashMap();
		map.put("code", a);
		map.put("name", b);
		JSONObject json = JSONObject.fromObject(map);
		out.println(json);
	}
	//��ʾ����Ŀ¼
	public void showEr() throws IOException {
		HttpServletResponse response = (HttpServletResponse) ActionContext
				.getContext().get(
						org.apache.struts2.StrutsStatics.HTTP_RESPONSE);
		PrintWriter out = response.getWriter();
		
		System.out.println("���ǽ��յ�����Ϣ");
		System.out.println(":"+tiaojian);
		
		// ��G��Ԫ�ض�ת�Ƶ�a��
		List<JingjihangyeModel> J = ud.getEr(tiaojian);
		int length = J.size();
		String[] a = new String[length];
		String[] b = new String[length];
		for (int i = 0; i < length; i++)//�����ж�ʮ������ҵ
		{
			a[i] = J.get(i).getCode();//�Ѵ������a��
			b[i] = J.get(i).getTitle();//����ҵ���Ʒ���b��
		}
		Map map = new HashMap();
		map.put("code", a);
		map.put("name", b);
		JSONObject json1 = JSONObject.fromObject(map);
		out.println(json1);
	}
	//��ʾ����Ŀ¼
	public void showSan() throws IOException {
		HttpServletResponse response = (HttpServletResponse) ActionContext
				.getContext().get(
						org.apache.struts2.StrutsStatics.HTTP_RESPONSE);
		PrintWriter out = response.getWriter();
		// ��G��Ԫ�ض�ת�Ƶ�a��
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
		System.out.println("���ǽ��յ�����Ϣ2");
		setTiaojian(tiaojian);
	}
}
