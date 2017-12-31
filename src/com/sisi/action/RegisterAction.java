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
import com.sisi.model.DemandInfoModel;
import com.sisi.model.GuiModel;
import com.sisi.model.InstitutionReInfoModel;
import com.sisi.service.UserManager;
import com.sisi.vo.InstitutionReInfoVo;

//action类
public class RegisterAction extends ActionSupport implements ModelDriven {
	// 属性***************************************************************
	private InstitutionReInfoVo info;

	private UserManager um;

	// setget函数*********************************************************

	public UserManager getUm() {
		return um;
	}

	@Resource(name = "userManager")
	public void setUm(UserManager um) {
		this.um = um;
	}

	public InstitutionReInfoVo getInfo() {
		return info;
	}

	@Resource(name = "info")
	public void setInfo(InstitutionReInfoVo info) {
		this.info = info;
	}

	public Object getModel() {
		return info;
	}

	// 其他函数************************************************************

	@SuppressWarnings("null")
	@Override
	public String execute() throws Exception {
		// 初始化一个用户
		InstitutionReInfoModel u = new InstitutionReInfoModel();

		u.setInstitutionname(info.getInstitutionname());
		u.setPassword(info.getPassword());
		u.setEmail(info.getEmail());
		u.setContact(info.getContact());
		u.setContactnumber(info.getContactnumber());
		u.setLabel(3);// 注册的用户都是使用用户的权限
		um.save(u);
		return "true";

	}

}
