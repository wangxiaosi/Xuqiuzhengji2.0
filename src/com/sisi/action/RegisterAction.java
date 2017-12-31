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

//action��
public class RegisterAction extends ActionSupport implements ModelDriven {
	// ����***************************************************************
	private InstitutionReInfoVo info;

	private UserManager um;

	// setget����*********************************************************

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

	// ��������************************************************************

	@SuppressWarnings("null")
	@Override
	public String execute() throws Exception {
		// ��ʼ��һ���û�
		InstitutionReInfoModel u = new InstitutionReInfoModel();

		u.setInstitutionname(info.getInstitutionname());
		u.setPassword(info.getPassword());
		u.setEmail(info.getEmail());
		u.setContact(info.getContact());
		u.setContactnumber(info.getContactnumber());
		u.setLabel(3);// ע����û�����ʹ���û���Ȩ��
		um.save(u);
		return "true";

	}

}
