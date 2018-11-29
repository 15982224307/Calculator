package com.supermap.control;

/**
 * @author Administrator
 */
public abstract class Operation {

	public String text;
	public abstract double getResult(double x,double y);
	public abstract int getLevel();
}
