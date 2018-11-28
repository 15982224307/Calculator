package com.supermap.data;

import com.supermap.data.GBC;

import javax.swing.*;

/**
 * @author Administrator
 */
public class CusButton extends JButton {
	private GBC gbc;

	public CusButton(String text) {
		super(text);
	}

	public CusButton(String text, GBC gbc) {
		super(text);
		this.gbc = gbc;
	}

	public GBC getGBC() {
		return gbc;
	}

	public void setGBC(GBC gbc) {
		this.gbc = gbc;
	}
}
