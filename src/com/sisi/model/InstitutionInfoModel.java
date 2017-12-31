package com.sisi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class InstitutionInfoModel {
	// ����***************************************************
	private int institutionid;// �������-1
	private String institutionname;// ��������-2
	private String email;// ��������-3
	private String address;// ͨѶ��ַ-4
	private String contact;// ��ϵ��-5
	private String contactnumber;// ��ϵ�˹̶��绰-6
	private String contactnumber2;// ��ϵ���ֻ�����-7
	private String guikouguanlibumen;// ��ڹ�����-8
	private String suozaidiyu;// ���ڵ���-9
	private String URL;// ��λ��ַ-10
	private String farendaibiao;// ���˴���-11
	private String postcode;// ��������-12
	private String contactchuanzhen;// ��ϵ�˴���-13
	private String jigoushuxing;// ��������-14
	private String jigoujianjie;// �������-15

	// ����***************************************************
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
