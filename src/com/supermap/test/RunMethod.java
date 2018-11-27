package com.supermap.test;

import com.supermap.layout.GridBagLayoutUI;
import com.supermap.layout.GroupLayoutUI;

import javax.swing.*;

/**
 * @author Administrator
 */
public class RunMethod {
	//运行窗口的主方法
	public static void main(String[] args) {

		JFrame jFrame = new JFrame("计算器");//设置标题
		jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//关闭窗口时的行为
		jFrame.setLocationRelativeTo(null);//设置窗口在屏幕正中显示
		jFrame.setResizable(false);//设置窗口不可缩放
		JPanel jPanel = new JPanel();//新建面板

		GridBagLayoutUI gridBagLayoutUI = new GridBagLayoutUI();//使用GridBagLyout布局计算器
		GroupLayoutUI groupLayoutUI = new GroupLayoutUI();//使用GroupLayout布局计算器
		jFrame.setContentPane(groupLayoutUI.addComponentsToPane(jPanel));//得到布局之后的面板
		groupLayoutUI.addOnclickEvent();

		jFrame.pack();//容纳所有组件
		jFrame.setVisible(true);//显示窗口
	}
}
