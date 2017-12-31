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
	// ����*************************************************************
	private DemandInfoModelVo dinfo;

	private List<DemandInfoModel> demands;

	private DemandInfoModel demand;

	private UserManager um;

	// get set����*****************************************************
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

	// ��ȡ������������
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

	// ��������**********************************************************
	@Override
	public String execute() throws Exception {
		return "true";
	}

	// ��ʾ������ʽδͨ���������
	public String demandWeishenhe() throws Exception {
		this.demands = um.listDemandsForXing();
		return "true";
	}

	// ��ʾ���в���δͨ���������
	public String demandWeishenheBu() throws Exception {
		HttpServletRequest request1 = ServletActionContext.getRequest();
		HttpSession session = request1.getSession(true);
		String user = session.getAttribute("user").toString();
		// �����û������ҵ������Ա�������Ĳ���
		int user1 = Integer.parseInt(user);
		String bumen = um.findBumen(user1);
		// Ȼ�󽫹������Ŵ�����Һ���
		this.demands = um.listDemandsForBu(bumen);
		return "true";
	}

	// ��ʾ���в����Ѿ��������
	public String demandYishenheBu() throws Exception {
		HttpServletRequest request1 = ServletActionContext.getRequest();
		HttpSession session = request1.getSession(true);
		String user = session.getAttribute("user").toString();
		// �����û������ҵ������Ա�������Ĳ���
		int user1 = Integer.parseInt(user);
		String bumen = um.findBumen(user1);
		// Ȼ�󽫹������Ŵ�����Һ���
		this.demands = um.listYiDemandsForBu(bumen);
		return "true";
	}

	// �����������
	public String demanInfo() throws Exception {
		this.setDemand(um.findDemandById(dinfo.getDemandid()));
		return "true";
	}

	// ��ʽ����ύ����
	public String tijiaoXing() throws Exception {
		DemandInfoModel d = um.findDemandById(dinfo.getDemandid());

		d.setShenhexs(dinfo.getShenhexs());
		d.setGuishubumen(dinfo.getGuishubumen());
		d.setXsshenheyijian(dinfo.getXsshenheyijian());
		um.demandAdd(d);
		return "true";
	}

	// ��������ύ����
	public String tijiaoBu() throws Exception {
		DemandInfoModel d = um.findDemandById(dinfo.getDemandid());

		d.setShenhebm(dinfo.getShenhebm());
		d.setBmshenheyijian(dinfo.getBmshenheyijian());
		um.demandAdd(d);
		return "true";
	}

	// ��ʾ������ʽ���������
	public String demandYishenhe() throws Exception {
		this.demands = um.listYiDemandsForXing();
		return "true";
	}
}
