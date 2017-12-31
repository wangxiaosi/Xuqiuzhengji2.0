package com.sisi.action;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sisi.model.DemandInfoModel;
import com.sisi.service.UserManager;
import com.sisi.vo.DemandInfoModelVo;

public class DemandInfoAddAction extends ActionSupport implements ModelDriven {

	private DemandInfoModelVo dinfo;

	public DemandInfoModelVo getDinfo() {
		return dinfo;
	}

	@Resource(name = "dinfo")
	public void setDinfo(DemandInfoModelVo dinfo) {
		this.dinfo = dinfo;
	}

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

		DemandInfoModel d = new DemandInfoModel();

		d.setBmshenheyijian(dinfo.getBmshenheyijian());// 部门审核意见
		d.setDemandid(dinfo.getDemandid());
		d.setDemandname(dinfo.getDemandname());
		d.setGuanjianzi(dinfo.getGuanjianzi1() + dinfo.getGuanjianzi2()
				+ dinfo.getGuanjianzi3() + dinfo.getGuanjianzi4()
				+ dinfo.getGuanjianzi5());
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

		um.demandAdd(d);
		return "true";
	}

	public Object getModel() {
		return dinfo;
	}
}

