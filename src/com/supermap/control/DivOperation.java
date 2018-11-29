package com.supermap.control;

/**
 * @author Administrator
 */
public class DivOperation extends Operation {
	public DivOperation() {
		this.text = "÷";
	}

	public DivOperation(double x, double y) {
		super();
	}

	@Override
	public double getResult(double x, double y) {
		return x / y;
	}

	@Override
	public int getLevel() {
		return 1;
	}
}
