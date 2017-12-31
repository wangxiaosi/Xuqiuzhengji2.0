package com.sisi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class InstitutionReInfoModel {
	// 属性***************************************************
	private int institutionid;// 自增类型的机构编号
	private String institutionname;// 机构名称
	private String password;// 密码
	private String email;// 电子邮箱
	private String contact;// 联系人
	private String contactnumber;// 联系人手机号码
	private int label;// 标签，用来识别用户身份进而分配权限1为管理员，2为形式审核人员，3为注册用户，4为部门审核员
	private String label2;// 标记部门审核员的所属部门

	// 方法***************************************************
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
