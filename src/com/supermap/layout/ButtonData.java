package com.supermap.layout;

import javax.swing.*;

/**
 * @author Administrator
 */
public class ButtonData {
	public final static String[] KEYS = {"CE", "C", "←", "÷", "7", "8", "9", "×", "4", "5", "6", "-", "1", "2", "3", "+", "0", ".", "="};
	public final static int CE = 0;
	public final static int C = 1;
	public final static int BACK = 2;
	public final static int DIV = 3;
	public final static int SEVEN = 4;
	public final static int EIGHT = 5;
	public final static int NINE = 6;
	public final static int MUL = 7;
	public final static int FOUR = 8;
	public final static int FIVE = 9;
	public final static int SIX = 10;
	public final static int SUB = 11;
	public final static int ONE = 12;
	public final static int TWO = 13;
	public final static int THREE = 14;
	public final static int ADD = 15;
	public final static int ZERO = 16;
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
	public final static JButton[] keys = new JButton[ButtonData.KEYS.length];

}
