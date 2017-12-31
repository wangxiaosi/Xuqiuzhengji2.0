package com.sisi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DemandInfoModel {
	// ����***************************************************
	private int demandid;// �������͵�������1-
	private int institutionid;// �������2-
	private String demandname;// ��������3-
	private int startyear;// ������ʼ����4-
	private int endyear;// �����������5-
	private String zhuyaowenti;// ��Ҫ����6-
	private String jishuguanjian;// �����ؼ�7-
	private String yuqimubiao;// Ԥ��Ŀ��8-
	private String guanjianzi;// �ؼ���9-
	private String nitouruzijinzonge;// ��Ͷ���ʽ��ܶ�10-
	private String jishuxuqiujiejuefangfa;// ��������������11-
	private String hezuoyixiangdanwei;// ��������λ12-
	private String kejihuodongleixing;// (50),--�Ƽ������13
	private String xuekefenlei;// ѧ�Ʒ��ࣨ��������д��14-
	private String xuqiujishusuoshulingyu;// �������������򣨷ǻ�������д��15-
	private String xuqiujishuyingyonghangye;// ������Ӧ����ҵ���ǻ�������д��16-
	private int shenhexs;// �ж��Ƿ񾭹���ʽ���0Ϊ�ύδ���,1Ϊ���ͨ��,2Ϊû��ͨ����3Ϊ����δ�ύ���17-
	private int shenhebm;// �ж��Ƿ񾭹��������0Ϊ�ύδ���,1Ϊ���ͨ��,2Ϊû��ͨ����3Ϊ����δ�ύ���18-
	private String guishubumen;// �ύ��������ˣ����������ύ���ţ�һ��29������19-
	private String xsshenheyijian;// ��ʽ������20-
	private String bmshenheyijian;// ����������21-

	// ����*****************************************************
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
