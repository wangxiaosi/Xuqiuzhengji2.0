package com.sisi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SuoModel {
	// 属性***************************************************
	private float Code;// 编号
	private String Title;// 地域名称
	private String F3;// 辅助信息

	// 方法*****************************************************
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
