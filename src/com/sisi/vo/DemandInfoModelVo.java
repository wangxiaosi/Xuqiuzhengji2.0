package com.sisi.vo;

import org.springframework.stereotype.Component;

@Component("dinfo")
public class DemandInfoModelVo {
	// 属性***************************************************
	private int demandid;// 自增类型的需求编号1
	private int institutionid;// 机构编号2
	private String demandname;// 需求名称3
	private int startyear;// 需求起始年限4
	private int endyear;// 需求结束年限5
	private String zhuyaowenti;// 主要问题6
	private String jishuguanjian;// 技术关键7
	private String yuqimubiao;// 预期目标8
	private String guanjianzi1;// 关键字9.1
	private String guanjianzi2;// 关键字9.2
	private String guanjianzi3;// 关键字9.3
	private String guanjianzi4;// 关键字9.4
	private String guanjianzi5;// 关键字9.5
	private String nitouruzijinzonge;// 拟投入资金总额10
	private String jishuxuqiujiejuefangfa;// 技术需求解决方法11
	private String hezuoyixiangdanwei;// 合作意向单位12
	private String kejihuodongleixing;// (50),--科技活动类型13
	private String OrgSubject1;// 学科分类1（基础类填写）14.1
	private String OrgSubject2;// 学科分类2（基础类填写）14.2
	private String OrgSubject3;// 学科分类3（基础类填写）14.3
	private String xuqiujishusuoshulingyu;// 需求技术所属领域（非基础类填写）15
	private String OrgTechWork1;// 需求技术应用行业（非基础类填写）16.1
	private String OrgTechWork2;// 需求技术应用行业（非基础类填写）16.2
	private String OrgTechWork3;// 需求技术应用行业（非基础类填写）16.3
	private int shenhexs;// 判断是否经过形式审核0为提交未审核,1为审核通过,2为没有通过，3为保存未提交审核17
	private int shenhebm;// 判断是否经过部门审核0为提交未审核,1为审核通过,2为没有通过，3为保存未提交审核18
	private String guishubumen;// 提交到部门审核，这里是所提交部门，一共29个部门19
	private String xsshenheyijian;// 形式审核意见20
	private String bmshenheyijian;// 部门审核意见21

	// 方法*****************************************************
	public int getDemandid() {
		return demandid;
	}

	public void setDemandid(int demandid) {
		this.demandid = demandid;
	}

	public int getInstitutionid() {
		return institutionid;
	}

	public void setInstitutionid(int institutionid) {
		this.institutionid = institutionid;
	}

	public String getDemandname() {
		return demandname;
	}

	public void setDemandname(String demandname) {
		this.demandname = demandname;
	}

	public int getStartyear() {
		return startyear;
	}

	public void setStartyear(int startyear) {
		this.startyear = startyear;
	}

	public int getEndyear() {
		return endyear;
	}

	public void setEndyear(int endyear) {
		this.endyear = endyear;
	}

	public String getZhuyaowenti() {
		return zhuyaowenti;
	}

	public void setZhuyaowenti(String zhuyaowenti) {
		this.zhuyaowenti = zhuyaowenti;
	}

	public String getJishuguanjian() {
		return jishuguanjian;
	}

	public void setJishuguanjian(String jishuguanjian) {
		this.jishuguanjian = jishuguanjian;
	}

	public String getYuqimubiao() {
		return yuqimubiao;
	}

	public void setYuqimubiao(String yuqimubiao) {
		this.yuqimubiao = yuqimubiao;
	}

	public String getJishuxuqiujiejuefangfa() {
		return jishuxuqiujiejuefangfa;
	}

	public void setJishuxuqiujiejuefangfa(String jishuxuqiujiejuefangfa) {
		this.jishuxuqiujiejuefangfa = jishuxuqiujiejuefangfa;
	}

	public String getHezuoyixiangdanwei() {
		return hezuoyixiangdanwei;
	}

	public void setHezuoyixiangdanwei(String hezuoyixiangdanwei) {
		this.hezuoyixiangdanwei = hezuoyixiangdanwei;
	}

	public String getKejihuodongleixing() {
		return kejihuodongleixing;
	}

	public void setKejihuodongleixing(String kejihuodongleixing) {
		this.kejihuodongleixing = kejihuodongleixing;
	}

	public String getXuqiujishusuoshulingyu() {
		return xuqiujishusuoshulingyu;
	}

	public void setXuqiujishusuoshulingyu(String xuqiujishusuoshulingyu) {
		this.xuqiujishusuoshulingyu = xuqiujishusuoshulingyu;
	}

	public int getShenhexs() {
		return shenhexs;
	}

	public void setShenhexs(int shenhexs) {
		this.shenhexs = shenhexs;
	}

	public int getShenhebm() {
		return shenhebm;
	}

	public void setShenhebm(int shenhebm) {
		this.shenhebm = shenhebm;
	}

	public String getGuishubumen() {
		return guishubumen;
	}

	public void setGuishubumen(String guishubumen) {
		this.guishubumen = guishubumen;
	}

	public String getXsshenheyijian() {
		return xsshenheyijian;
	}

	public void setXsshenheyijian(String xsshenheyijian) {
		this.xsshenheyijian = xsshenheyijian;
	}

	public String getBmshenheyijian() {
		return bmshenheyijian;
	}

	public void setBmshenheyijian(String bmshenheyijian) {
		this.bmshenheyijian = bmshenheyijian;
	}

	public String getGuanjianzi1() {
		return guanjianzi1;
	}

	public void setGuanjianzi1(String guanjianzi1) {
		this.guanjianzi1 = guanjianzi1;
	}

	public String getGuanjianzi2() {
		return guanjianzi2;
	}

	public void setGuanjianzi2(String guanjianzi2) {
		this.guanjianzi2 = guanjianzi2;
	}

	public String getGuanjianzi3() {
		return guanjianzi3;
	}

	public void setGuanjianzi3(String guanjianzi3) {
		this.guanjianzi3 = guanjianzi3;
	}

	public String getGuanjianzi4() {
		return guanjianzi4;
	}

	public void setGuanjianzi4(String guanjianzi4) {
		this.guanjianzi4 = guanjianzi4;
	}

	public String getGuanjianzi5() {
		return guanjianzi5;
	}

	public void setGuanjianzi5(String guanjianzi5) {
		this.guanjianzi5 = guanjianzi5;
	}

	public String getOrgSubject1() {
		return OrgSubject1;
	}

	public void setOrgSubject1(String orgSubject1) {
		OrgSubject1 = orgSubject1;
	}

	public String getOrgSubject2() {
		return OrgSubject2;
	}

	public void setOrgSubject2(String orgSubject2) {
		OrgSubject2 = orgSubject2;
	}

	public String getOrgSubject3() {
		return OrgSubject3;
	}

	public void setOrgSubject3(String orgSubject3) {
		OrgSubject3 = orgSubject3;
	}

	public String getOrgTechWork1() {
		return OrgTechWork1;
	}

	public void setOrgTechWork1(String orgTechWork1) {
		OrgTechWork1 = orgTechWork1;
	}

	public String getOrgTechWork2() {
		return OrgTechWork2;
	}

	public void setOrgTechWork2(String orgTechWork2) {
		OrgTechWork2 = orgTechWork2;
	}

	public String getOrgTechWork3() {
		return OrgTechWork3;
	}

	public void setOrgTechWork3(String orgTechWork3) {
		OrgTechWork3 = orgTechWork3;
	}

	public String getNitouruzijinzonge() {
		return nitouruzijinzonge;
	}

	public void setNitouruzijinzonge(String nitouruzijinzonge) {
		this.nitouruzijinzonge = nitouruzijinzonge;
	}
}
