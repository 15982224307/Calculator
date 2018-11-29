package com.supermap.data;

/**
 * @author Administrator
 */
public enum ButtonEnum {
	OTHERS(0,"OTHERS"),
	NUMBER(1,"NUMBER"),
	OP(2,"OP"),
	EQ(3,"EQ");
	//按钮类型 0，代表其他 1，代表数字，2，代表运算符
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

	ButtonEnum(Integer code, String text) {
		this.code = code;
		this.text = text;
	}

	ButtonEnum(Integer code) {
		this.code = code;
	}
}
