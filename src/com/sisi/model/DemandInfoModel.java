package com.sisi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DemandInfoModel {
	// 属性***************************************************
	private int demandid;// 自增类型的需求编号1-
	private int institutionid;// 机构编号2-
	private String demandname;// 需求名称3-
	private int startyear;// 需求起始年限4-
	private int endyear;// 需求结束年限5-
	private String zhuyaowenti;// 主要问题6-
	private String jishuguanjian;// 技术关键7-
	private String yuqimubiao;// 预期目标8-
	private String guanjianzi;// 关键字9-
	private String nitouruzijinzonge;// 拟投入资金总额10-
	private String jishuxuqiujiejuefangfa;// 技术需求解决方法11-
	private String hezuoyixiangdanwei;// 合作意向单位12-
	private String kejihuodongleixing;// (50),--科技活动类型13
	private String xuekefenlei;// 学科分类（基础类填写）14-
	private String xuqiujishusuoshulingyu;// 需求技术所属领域（非基础类填写）15-
	private String xuqiujishuyingyonghangye;// 需求技术应用行业（非基础类填写）16-
	private int shenhexs;// 判断是否经过形式审核0为提交未审核,1为审核通过,2为没有通过，3为保存未提交审核17-
	private int shenhebm;// 判断是否经过部门审核0为提交未审核,1为审核通过,2为没有通过，3为保存未提交审核18-
	private String guishubumen;// 提交到部门审核，这里是所提交部门，一共29个部门19-
	private String xsshenheyijian;// 形式审核意见20-
	private String bmshenheyijian;// 部门审核意见21-

	// 方法*****************************************************
	@Id
	@GeneratedValue
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

	public String getGuanjianzi() {
		return guanjianzi;
	}

	public void setGuanjianzi(String guanjianzi) {
		this.guanjianzi = guanjianzi;
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

	public String getXuekefenlei() {
		return xuekefenlei;
	}

	public void setXuekefenlei(String xuekefenlei) {
		this.xuekefenlei = xuekefenlei;
	}

	public String getXuqiujishusuoshulingyu() {
		return xuqiujishusuoshulingyu;
	}

	public void setXuqiujishusuoshulingyu(String xuqiujishusuoshulingyu) {
		this.xuqiujishusuoshulingyu = xuqiujishusuoshulingyu;
	}

	public String getXuqiujishuyingyonghangye() {
		return xuqiujishuyingyonghangye;
	}

	public void setXuqiujishuyingyonghangye(String xuqiujishuyingyonghangye) {
		this.xuqiujishuyingyonghangye = xuqiujishuyingyonghangye;
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

	public String getNitouruzijinzonge() {
		return nitouruzijinzonge;
	}

	public void setNitouruzijinzonge(String nitouruzijinzonge) {
		this.nitouruzijinzonge = nitouruzijinzonge;
	}

}
