package com.supermap.control;

/**
 * @author Administrator
 */
public class AddOperation extends Operation {

	public AddOperation() {
		this.text = "+";
	}


	public AddOperation(double x, double y) {
		super();
	}

	@Override
	public double getResult(double x, double y) {
		return x + y;
	}

	@Override
	public int getLevel() {
		return 0;
	}
}
