package com.supermap.control;

/**
 * @author Administrator
 */
public class MulOperation extends Operation {
	public MulOperation() {
		super();
	}

	public MulOperation(double x, double y) {
		this.text = "×";
	}


	@Override
	public double getResult(double x, double y) {
		return x * y;
	}

	@Override
	public int getLevel() {
		return 1;
	}
}
