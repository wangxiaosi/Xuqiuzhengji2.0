package com.sisi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class GuiModel {
	// ����***************************************************
	private String gui;// ��ڹ�����

	// ����*****************************************************
	@Id
	public String getGui() {
		return gui;
	}

	public void setGui(String gui) {
		this.gui = gui;
	}

}
