package com.sisi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class InstitutionReInfoModel {
	// ����***************************************************
	private int institutionid;// �������͵Ļ������
	private String institutionname;// ��������
	private String password;// ����
	private String email;// ��������
	private String contact;// ��ϵ��
	private String contactnumber;// ��ϵ���ֻ�����
	private int label;// ��ǩ������ʶ���û���ݽ�������Ȩ��1Ϊ����Ա��2Ϊ��ʽ�����Ա��3Ϊע���û���4Ϊ�������Ա
	private String label2;// ��ǲ������Ա����������

	// ����***************************************************
	@Id
	@GeneratedValue
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public int getLabel() {
		return label;
	}

	public void setLabel(int label) {
		this.label = label;
	}

	public String getLabel2() {
		return label2;
	}

	public void setLabel2(String label2) {
		this.label2 = label2;
	}

}
