package com.sisi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SuoModel {
	// ����***************************************************
	private float Code;// ���
	private String Title;// ��������
	private String F3;// ������Ϣ

	// ����*****************************************************
	@Id
	public float getCode() {
		return Code;
	}

	public void setCode(float code) {
		Code = code;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getF3() {
		return F3;
	}

	public void setF3(String f3) {
		F3 = f3;
	}
}
