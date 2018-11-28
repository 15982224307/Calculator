package com.supermap.layout;

import com.supermap.data.CusButton;
import com.supermap.data.GBC;

import javax.swing.*;
import java.awt.*;

/**
 * @author Administrator
 */
public class CustomGridBag extends GridBagLayoutUI {

	public CustomGridBag(JPanel contentPane) {
		super(contentPane);
	}


	//添加自定义按钮
	public void addCustomButton(CusButton button){
		button.setFocusPainted(false);
		contentPane.add(button,button.getGBC());
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
