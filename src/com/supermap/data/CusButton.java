package com.supermap.data;

import com.supermap.control.Operation;
import com.supermap.data.GBC;

import javax.swing.*;

/**
 * @author Administrator
 */
public class CusButton extends JButton {
	private GBC gbc;
	private Operation operation;
	private int cat = 1;


	public int getCat() {
		return cat;
	}

	public void setCat(int cat) {
		this.cat = cat;
	}

	public CusButton(String text, GBC gbc) {
		super(text);
		this.gbc = gbc;
	}

	public CusButton() {
	}

	public static int TYPE_NUMBER = 1;
	public static int TYPE_OP= 1;
	public CusButton(String text) {
		super(text);
	}

	public GBC getGBC() {
		return gbc;
	}

	public void setGBC(GBC gbc) {
		this.gbc = gbc;
	}


	public Operation getOperation() {
		return operation;
	}

	public void setOperation(Operation operation) {
		this.operation = operation;
	}

}
