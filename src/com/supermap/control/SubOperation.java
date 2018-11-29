package com.supermap.control;

/**
 * @author Administrator
 */
public class SubOperation extends Operation {

	public SubOperation() {
		this.text = "-";
	}

	public SubOperation(double x, double y) {
		super();
	}


	@Override
	public double getResult(double x, double y) {
		return x - y;
	}

	@Override
	public int getLevel() {
		return 0;
	}
}
