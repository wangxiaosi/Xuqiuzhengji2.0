package com.sisi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class JingjihangyeModel {
	// ����***************************************************
	private String Code;// ����������21-
	private String Title;// ����������21-
	// ����*****************************************************
	@Id
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	

}
