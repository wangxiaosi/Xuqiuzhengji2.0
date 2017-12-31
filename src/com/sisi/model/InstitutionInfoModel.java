package com.sisi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class InstitutionInfoModel {
	// 属性***************************************************
	private int institutionid;// 机构编号-1
	private String institutionname;// 机构名称-2
	private String email;// 电子邮箱-3
	private String address;// 通讯地址-4
	private String contact;// 联系人-5
	private String contactnumber;// 联系人固定电话-6
	private String contactnumber2;// 联系人手机号码-7
	private String guikouguanlibumen;// 归口管理部门-8
	private String suozaidiyu;// 所在地域-9
	private String URL;// 单位网址-10
	private String farendaibiao;// 法人代表-11
	private String postcode;// 邮政编码-12
	private String contactchuanzhen;// 联系人传真-13
	private String jigoushuxing;// 机构属性-14
	private String jigoujianjie;// 机构简介-15

	// 方法***************************************************
	@Id
	public int getInstitutionid() {
		return institutionid;
	}

	public void setInstitutionid(int institutionid) {
		this.institutionid = institutionid;
	}

	public String getInstitutionname() {
		return institutionname;
	}

	public void setInstitutionname(String institutionname) {
		this.institutionname = institutionname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}

	public String getContactnumber2() {
		return contactnumber2;
	}

	public void setContactnumber2(String contactnumber2) {
		this.contactnumber2 = contactnumber2;
	}

	public String getGuikouguanlibumen() {
		return guikouguanlibumen;
	}

	public void setGuikouguanlibumen(String guikouguanlibumen) {
		this.guikouguanlibumen = guikouguanlibumen;
	}

	public String getSuozaidiyu() {
		return suozaidiyu;
	}

	public void setSuozaidiyu(String suozaidiyu) {
		this.suozaidiyu = suozaidiyu;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	public String getFarendaibiao() {
		return farendaibiao;
	}

	public void setFarendaibiao(String farendaibiao) {
		this.farendaibiao = farendaibiao;
	}

	public String getContactchuanzhen() {
		return contactchuanzhen;
	}

	public void setContactchuanzhen(String contactchuanzhen) {
		this.contactchuanzhen = contactchuanzhen;
	}

	public String getJigoushuxing() {
		return jigoushuxing;
	}

	public void setJigoushuxing(String jigoushuxing) {
		this.jigoushuxing = jigoushuxing;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getJigoujianjie() {
		return jigoujianjie;
	}

	public void setJigoujianjie(String jigoujianjie) {
		this.jigoujianjie = jigoujianjie;
	}
}
