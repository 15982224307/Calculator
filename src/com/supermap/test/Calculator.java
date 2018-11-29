package com.supermap.test;

import com.supermap.control.AddOperation;
import com.supermap.control.Operation;
import com.supermap.data.CusButton;
import com.supermap.data.Data;
import com.supermap.layout.CustomGridBag;

import javax.swing.*;

/**
 * @author Administrator
 */
public class Calculator {
	JFrame jFrame;
	JPanel jPanel;
	JPanel jPanel1;
	CustomGridBag gridBagLayoutUI;

	Calculator() {

	}

	public void show() {

		jFrame = new JFrame("计算器");//设置标题
		jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//关闭窗口时的行为
		jFrame.setLocationRelativeTo(null);//设置窗口在屏幕正中显示
		jFrame.setResizable(false);//设置窗口不可缩放
		jPanel = new JPanel();//新建面板
		gridBagLayoutUI = new CustomGridBag(jPanel);//使用GridBagLyout布局计算器
		//获取布局
		jPanel1 = gridBagLayoutUI.getContentPane();
		jFrame.setContentPane(jPanel1);

		jFrame.pack();//容纳所有组件
		jFrame.setVisible(true);//显示窗口
	}

	public void addCustomButton(Operation operation) {

		CusButton cusButton1 = new CusButton(Data.ADD.getText());

		cusButton1.setCat(2);
		cusButton1.setOperation(new AddOperation());
	}
}
