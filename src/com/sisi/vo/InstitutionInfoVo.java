package com.sisi.vo;

import org.springframework.stereotype.Component;

@Component("ninfo")
public class InstitutionInfoVo {
	// ����***************************************************
	private int institutionid;// �������-
	private String institutionname;// ��������-
	private String email;// ��������-
	private String address;// ͨѶ��ַ-
	private String contact;// ��ϵ��-
	private String contactnumber;// ��ϵ�˹̶��绰-
	private String contactnumber2;// ��ϵ���ֻ�����-
	private String guikouguanlibumen;// ��ڹ�����-
	private String suozaidiyu;// ���ڵ���-
	private String URL;// ��λ��ַ-
	private String farendaibiao;// ���˴���-
	private String postcode;// ��������-
	private String contactchuanzhen;// ��ϵ�˴���-
	private String jigoushuxing;// ��������-
	private String jigoujianjie;// �������-

	// ����***************************************************
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

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
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

	public String getJigoujianjie() {
		return jigoujianjie;
	}

	public void setJigoujianjie(String jigoujianjie) {
		this.jigoujianjie = jigoujianjie;
	}

}
