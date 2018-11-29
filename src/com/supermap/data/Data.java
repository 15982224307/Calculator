package com.supermap.data;

/**
 * @author Administrator
 */
public enum Data {

	ZERO(0, "0"),
	ONE(1, "1"),
	TWO(2, "2"),
	THREE(3, "3"),
	FOUR(4, "4"),
	FIVE(5, "5"),
	SIX(6, "6"),
	SEVEN(7, "7"),
	EIGHT(8, "8"),
	NINE(9, "9"),
	CE(10, "CE"),
	C(11, "C"),
	BACK(12, "←"),
	DIV(13, "÷"),
	MUL(14, "×"),
	SUB(15, "-"),
	ADD(16, "+"),
	SPOT(17, "."),
	EQUAL(18, "="),
	SPACE(0,"0");


	private Integer code;
	private String text;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	Data(Integer code, String text) {
		this.code = code;
		this.text = text;
	}

	Data(Integer code) {
		this.code = code;
	}
}
