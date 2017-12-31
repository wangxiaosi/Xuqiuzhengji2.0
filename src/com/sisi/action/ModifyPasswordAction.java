package com.sisi.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sisi.model.InstitutionInfoModel;
import com.sisi.model.InstitutionReInfoModel;
import com.sisi.service.UserManager;
import com.sisi.vo.InstitutionReInfoVo;

//action类
public class ModifyPasswordAction extends ActionSupport {

	private String newpassword;

	private UserManager um;

	public UserManager getUm() {
		return um;
	}

	@Resource(name = "userManager")
	public void setUm(UserManager um) {
		this.um = um;
	}

	@Override
	public String execute() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session1 = request.getSession(true);
		String user = session1.getAttribute("user").toString();
		int institutionid = Integer.parseInt(user);

		// 查找到相应对象，然后更新它
		List<InstitutionReInfoModel> I = um.findInstitutionByID(institutionid);

		I.get(0).setPassword(newpassword);

		um.modifyPassword(I.get(0));
		return "true";
	}

	public String getNewpassword() {
		return newpassword;
	}

	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}
}
