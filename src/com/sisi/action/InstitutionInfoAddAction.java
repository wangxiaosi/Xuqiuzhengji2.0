package com.sisi.action;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sisi.model.InstitutionInfoModel;
import com.sisi.model.InstitutionReInfoModel;
import com.sisi.service.UserManager;
import com.sisi.vo.InstitutionInfoVo;
import com.sisi.vo.InstitutionReInfoVo;

public class InstitutionInfoAddAction extends ActionSupport implements
		ModelDriven {
	// 属性*************************************************************
	private InstitutionInfoVo ninfo;

	private InstitutionInfoModel institution;

	private UserManager um;

	// setget函数*******************************************************
	public UserManager getUm() {
		return um;
	}

	@Resource(name = "userManager")
	public void setUm(UserManager um) {
		this.um = um;
	}

	public InstitutionInfoVo getNinfo() {
		return ninfo;
	}

	@Resource(name = "ninfo")
	public void setNinfo(InstitutionInfoVo ninfo) {
		this.ninfo = ninfo;
	}

	public Object getModel() {
		return ninfo;
	}

	public InstitutionInfoModel getInstitution() {
		return institution;
	}

	public void setInstitution(InstitutionInfoModel institution) {
		this.institution = institution;
	}

	// 其他函数*******************************************************
	@Override
	public String execute() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session1 = request.getSession(true);
		String user = session1.getAttribute("user").toString();

		InstitutionInfoModel u = new InstitutionInfoModel();
		u.setInstitutionid(Integer.parseInt(user));
		u.setAddress(ninfo.getAddress());
		u.setContact(ninfo.getContact());
		u.setContactchuanzhen(ninfo.getContactchuanzhen());
		u.setContactnumber(ninfo.getContactnumber());
		u.setContactnumber2(ninfo.getContactnumber2());
		u.setEmail(ninfo.getEmail());
		u.setFarendaibiao(ninfo.getFarendaibiao());
		u.setGuikouguanlibumen(ninfo.getGuikouguanlibumen());
		u.setInstitutionname(ninfo.getInstitutionname());
		u.setJigoujianjie(ninfo.getJigoujianjie());
		u.setJigoushuxing(ninfo.getJigoushuxing());
		u.setPostcode(ninfo.getPostcode());
		u.setSuozaidiyu(ninfo.getSuozaidiyu());
		u.setURL(ninfo.getURL());
		// 检验机构名称是否重复
		if (um.institutionNameCheck(u)) {
			return "fail";
		} else {
			// 将机构信息存入数据库
			um.institutionAdd(u);
			return "true";
		}
	}

	// 显示机构信息
	public String showInfo() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session1 = request.getSession(true);
		String user = session1.getAttribute("user").toString();

		System.out.println("1." + user);

		this.setInstitution(um.showInfo(user));
		return "true";
	}

	// 如果之前填报过，那么自动显示机构信息
	public void showInfoInLogin() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session1 = request.getSession(true);
		String user = session1.getAttribute("user").toString();

		HttpServletResponse response = (HttpServletResponse) ActionContext
				.getContext().get(
						org.apache.struts2.StrutsStatics.HTTP_RESPONSE);
		PrintWriter out = response.getWriter();
		// 将数据信息通过map传到前台
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
}
