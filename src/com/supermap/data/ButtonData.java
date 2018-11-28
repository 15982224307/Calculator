package com.supermap.data;

import javax.swing.*;

/**
 * @author Administrator
 */
public class ButtonData {
	public final static String[] KEYS = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "CE", "C", "←", "÷", "×", "-", "+", ".", "="};
	private static JTextField resultText = new JTextField("0");
	public final static int ZERO = 0;
	public final static int ONE = 1;
	public final static int TWO = 2;
	public final static int THREE = 3;
	public final static int FOUR = 4;
	public final static int FIVE = 5;
	public final static int SIX = 6;
	public final static int SEVEN = 7;
	public final static int EIGHT = 8;
	public final static int NINE = 9;
	public final static int CE = 10;
	public final static int C = 11;
	public final static int BACK = 12;
	public final static int DIV = 13;
	public final static int MUL = 14;
	public final static int SUB = 15;
	public final static int ADD = 16;
	public final static int SPOT = 17;
	public final static int EQUAL = 18;
	public final static String sub = "-";
	public final static String add = "+";
	public final static String mul = "×";
	public final static String div = "÷";
	public final static String eq = "=";
	public final static String point = ".";
	public final static String c = "C";
	public final static String ce = "CE";
	public final static String space = "0";
	public final static String delete = "←";
	public final static String mod = "%";
	public final static CusButton[] keys = new CusButton[ButtonData.KEYS.length];

}
