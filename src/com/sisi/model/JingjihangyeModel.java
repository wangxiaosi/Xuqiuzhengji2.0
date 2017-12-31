package com.sisi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class JingjihangyeModel {
	// 属性***************************************************
	private String Code;// 部门审核意见21-
	private String Title;// 部门审核意见21-
	// 方法*****************************************************
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
