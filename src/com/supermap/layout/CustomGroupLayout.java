package com.supermap.layout;

import com.supermap.data.CusButton;

import javax.swing.*;

/**
 * @author Administrator
 */
public class CustomGroupLayout extends GroupLayoutUI {

	public CustomGroupLayout(JPanel contentPane) {
		super(contentPane);
	}
	//添加自定义
	public void addCustomButton(CusButton button){
		button.setFocusPainted(false);
		//获取FlowLayout布局，并添加元素
		getCusPanel().add(button);
		//自定义按钮添加事件
		addOnclickEvent(button);
	}

	@Override
	public void initLayout() {
		super.initLayout();
	}

	//清除panel中的所有组件
	public void openCustom(){
		contentPane.removeAll();
	}
}
