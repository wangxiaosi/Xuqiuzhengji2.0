package com.sisi.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
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
import com.sisi.model.InstitutionReInfoModel;
import com.sisi.service.UserManager;
import com.sisi.vo.InstitutionReInfoVo;

//action类
@Component("user")
@Scope("prototype")
public class LoginAction extends ActionSupport implements ModelDriven {
	// 属性**************************************************************
	private InstitutionReInfoVo info;

	private UserManager um;

	// setget函数********************************************************
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

	// 其他函数********************************************************
	@SuppressWarnings("null")
	@Override
	public String execute() throws Exception {

		HttpServletRequest request1 = ServletActionContext.getRequest();
		HttpSession session = request1.getSession(true);
		String rand = (String) session.getAttribute("rand");
		// 传递用户名以显示用户信息
		session.setAttribute("user", info.getInstitutionid());

		// 初始化一个用户
		String returnvalue = "";

		InstitutionReInfoModel u = new InstitutionReInfoModel();
		u.setInstitutionid(info.getInstitutionid());
		u.setPassword(info.getPassword());
		String x = info.getRandcode();

		if (x.equals(rand)) {
			if (um.loginCheck(u)) {
				returnvalue = "true";
			} else {
				returnvalue = "loginfail";
			}
		} else {
			returnvalue = "checkcodewrong";
		}
		return returnvalue;
	}

	public void powerControl() throws Exception {
		HttpServletResponse response = (HttpServletResponse) ActionContext
				.getContext().get(
						org.apache.struts2.StrutsStatics.HTTP_RESPONSE);
		PrintWriter out = response.getWriter();
		// 直接从模型中获取用户id然后传入函数获取他的标签1，标签1就是权限代表
		String data = "" + um.roleCheck(info.getInstitutionid());
		out.println(data);
	}

}
