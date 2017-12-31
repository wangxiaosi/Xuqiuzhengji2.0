package com.sisi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class GuiModel {
	// 属性***************************************************
	private String gui;// 归口管理部门

	// 方法*****************************************************
	@Id
	public String getGui() {
		return gui;
	}

	public void setGui(String gui) {
		this.gui = gui;
	}

}
