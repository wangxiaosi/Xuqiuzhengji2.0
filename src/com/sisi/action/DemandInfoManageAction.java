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

public class DemandInfoManageAction extends ActionSupport implements
		ModelDriven {
	// ����*************************************************************

	private DemandInfoModelVo dinfo;

	private List<DemandInfoModel> demands;

	private DemandInfoModel demand;

	private UserManager um;

	// setget����*********************************************************
	public UserManager getUm() {
		return um;
	}

	@Resource(name = "userManager")
	public void setUm(UserManager um) {
		this.um = um;
	}

	public DemandInfoModelVo getDinfo() {
		return dinfo;
	}

	@Resource(name = "dinfo")
	public void setDinfo(DemandInfoModelVo dinfo) {
		this.dinfo = dinfo;
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

	// ��������*********************************************************
	@Override
	public String execute() throws Exception {
		return "true";
	}

	// ����༭ҳ��֮ǰ����ҳ����Ϣ�����ǽ���Ϣ�����list������ʾ��ǰ�û���������
	public String demandEdit() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session1 = request.getSession(true);
		String user = session1.getAttribute("user").toString();

		this.demands = um.listDemands(Integer.parseInt(user));
		return "true";
	}

	// ɾ���û�ѡ�е�������Ϣ
	public String demandDelete() throws Exception {
		um.demandDelete(dinfo.getDemandid());
		return "true";
	}

	// �����û�ѡ�е�������Ϣ
	public String demandUpdate() throws Exception {
		System.out.println(dinfo.getDemandid());
		this.setDemand(um.findDemandById(dinfo.getDemandid()));
		return "true";
	}

	// �����û�ѡ�е�������Ϣ
	public String demandUpdate1() throws Exception {
		DemandInfoModel d = new DemandInfoModel();

		d.setBmshenheyijian(dinfo.getBmshenheyijian());// ����������
		d.setDemandid(dinfo.getDemandid());
		d.setDemandname(dinfo.getDemandname());
		d.setGuanjianzi(dinfo.getGuanjianzi1());
		d.setGuishubumen(dinfo.getGuishubumen());
		d.setHezuoyixiangdanwei(dinfo.getHezuoyixiangdanwei());
		d.setInstitutionid(dinfo.getInstitutionid());
		d.setJishuguanjian(dinfo.getJishuguanjian());
		d.setJishuxuqiujiejuefangfa(dinfo.getJishuxuqiujiejuefangfa());
		d.setNitouruzijinzonge(dinfo.getNitouruzijinzonge());
		d.setShenhebm(dinfo.getShenhebm());
		d.setShenhexs(dinfo.getShenhexs());
		d.setStartyear(dinfo.getStartyear());
		d.setEndyear(dinfo.getEndyear());
		d.setXsshenheyijian(dinfo.getXsshenheyijian());
		d.setXuekefenlei(dinfo.getOrgSubject1() + dinfo.getOrgSubject2()
				+ dinfo.getOrgSubject3());
		d.setXuqiujishusuoshulingyu(dinfo.getXuqiujishusuoshulingyu());
		d.setXuqiujishuyingyonghangye(dinfo.getOrgTechWork1()
				+ dinfo.getOrgTechWork2() + dinfo.getOrgTechWork3());
		d.setYuqimubiao(dinfo.getYuqimubiao());
		d.setZhuyaowenti(dinfo.getZhuyaowenti());
		d.setKejihuodongleixing(dinfo.getKejihuodongleixing());

		um.demandUpdate(d);
		return "true";
	}

}
