package com.sisi.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sisi.model.DemandInfoModel;
import com.sisi.model.InstitutionInfoModel;
import com.sisi.service.UserManager;
import com.sisi.vo.DemandInfoModelVo;

public class DemandShenheAction extends ActionSupport implements ModelDriven {
	// 属性*************************************************************
	private DemandInfoModelVo dinfo;

	private List<DemandInfoModel> demands;

	private DemandInfoModel demand;

	private UserManager um;

	// get set方法*****************************************************
	public UserManager getUm() {
		return um;
	}

	@Resource(name = "userManager")
	public void setUm(UserManager um) {
		this.um = um;
	}

	public Object getModel() {
		return dinfo;
	}

	public List<DemandInfoModel> getDemands() {
		return demands;
	}

	// 调取表中所有数据
	public void setDemands(List<DemandInfoModel> demands) {
		this.demands = demands;
	}

	public DemandInfoModel getDemand() {
		return demand;
	}

	public void setDemand(DemandInfoModel demand) {
		this.demand = demand;
	}

	public DemandInfoModelVo getDinfo() {
		return dinfo;
	}

	@Resource(name = "dinfo")
	public void setDinfo(DemandInfoModelVo dinfo) {
		this.dinfo = dinfo;
	}

	// 其他方法**********************************************************
	@Override
	public String execute() throws Exception {
		return "true";
	}

	// 显示所有形式未通过审核需求
	public String demandWeishenhe() throws Exception {
		this.demands = um.listDemandsForXing();
		return "true";
	}

	// 显示所有部门未通过审核需求
	public String demandWeishenheBu() throws Exception {
		HttpServletRequest request1 = ServletActionContext.getRequest();
		HttpSession session = request1.getSession(true);
		String user = session.getAttribute("user").toString();
		// 根据用户名查找到审核人员所归属的部门
		int user1 = Integer.parseInt(user);
		String bumen = um.findBumen(user1);
		// 然后将归属部门代入查找函数
		this.demands = um.listDemandsForBu(bumen);
		return "true";
	}

	// 显示所有部门已经审核需求
	public String demandYishenheBu() throws Exception {
		HttpServletRequest request1 = ServletActionContext.getRequest();
		HttpSession session = request1.getSession(true);
		String user = session.getAttribute("user").toString();
		// 根据用户名查找到审核人员所归属的部门
		int user1 = Integer.parseInt(user);
		String bumen = um.findBumen(user1);
		// 然后将归属部门代入查找函数
		this.demands = um.listYiDemandsForBu(bumen);
		return "true";
	}

	// 需求详情界面
	public String demanInfo() throws Exception {
		this.setDemand(um.findDemandById(dinfo.getDemandid()));
		return "true";
	}

	// 形式审核提交函数
	public String tijiaoXing() throws Exception {
		DemandInfoModel d = um.findDemandById(dinfo.getDemandid());

		d.setShenhexs(dinfo.getShenhexs());
		d.setGuishubumen(dinfo.getGuishubumen());
		d.setXsshenheyijian(dinfo.getXsshenheyijian());
		um.demandAdd(d);
		return "true";
	}

	// 部门审核提交函数
	public String tijiaoBu() throws Exception {
		DemandInfoModel d = um.findDemandById(dinfo.getDemandid());

		d.setShenhebm(dinfo.getShenhebm());
		d.setBmshenheyijian(dinfo.getBmshenheyijian());
		um.demandAdd(d);
		return "true";
	}

	// 显示所有形式已审核需求
	public String demandYishenhe() throws Exception {
		this.demands = um.listYiDemandsForXing();
		return "true";
	}
}
