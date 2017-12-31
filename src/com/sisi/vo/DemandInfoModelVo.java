package com.sisi.vo;

import org.springframework.stereotype.Component;

@Component("dinfo")
public class DemandInfoModelVo {
	// ����***************************************************
	private int demandid;// �������͵�������1
	private int institutionid;// �������2
	private String demandname;// ��������3
	private int startyear;// ������ʼ����4
	private int endyear;// �����������5
	private String zhuyaowenti;// ��Ҫ����6
	private String jishuguanjian;// �����ؼ�7
	private String yuqimubiao;// Ԥ��Ŀ��8
	private String guanjianzi1;// �ؼ���9.1
	private String guanjianzi2;// �ؼ���9.2
	private String guanjianzi3;// �ؼ���9.3
	private String guanjianzi4;// �ؼ���9.4
	private String guanjianzi5;// �ؼ���9.5
	private String nitouruzijinzonge;// ��Ͷ���ʽ��ܶ�10
	private String jishuxuqiujiejuefangfa;// ��������������11
	private String hezuoyixiangdanwei;// ��������λ12
	private String kejihuodongleixing;// (50),--�Ƽ������13
	private String OrgSubject1;// ѧ�Ʒ���1����������д��14.1
	private String OrgSubject2;// ѧ�Ʒ���2����������д��14.2
	private String OrgSubject3;// ѧ�Ʒ���3����������д��14.3
	private String xuqiujishusuoshulingyu;// �������������򣨷ǻ�������д��15
	private String OrgTechWork1;// ������Ӧ����ҵ���ǻ�������д��16.1
	private String OrgTechWork2;// ������Ӧ����ҵ���ǻ�������д��16.2
	private String OrgTechWork3;// ������Ӧ����ҵ���ǻ�������д��16.3
	private int shenhexs;// �ж��Ƿ񾭹���ʽ���0Ϊ�ύδ���,1Ϊ���ͨ��,2Ϊû��ͨ����3Ϊ����δ�ύ���17
	private int shenhebm;// �ж��Ƿ񾭹��������0Ϊ�ύδ���,1Ϊ���ͨ��,2Ϊû��ͨ����3Ϊ����δ�ύ���18
	private String guishubumen;// �ύ��������ˣ����������ύ���ţ�һ��29������19
	private String xsshenheyijian;// ��ʽ������20
	private String bmshenheyijian;// ����������21

	// ����*****************************************************
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
