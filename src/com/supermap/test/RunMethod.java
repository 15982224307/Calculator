package com.supermap.test;

import com.supermap.data.CusButton;
import com.supermap.data.GBC;
import com.supermap.layout.*;

import javax.swing.*;
import java.awt.*;

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

		CustomGridBag gridBagLayoutUI = new CustomGridBag(jPanel);//使用GridBagLyout布局计算器
		//获取布局
		JPanel jPanel1 = gridBagLayoutUI.getContentPane();
		//获取指定按钮
		JButton component = (CusButton) jPanel1.getComponent(11);

		System.out.println(component.getText());



		//使用全部自定义布局，清除panel
//		gridBagLayoutUI.openCustom();

		//自定义按钮
//		CusButton cusButton = new CusButton("%");
//		GBC gbc = new GBC(0, 7, 1, 1).setIpad(0, 10).setInsets(1).setFill(GridBagConstraints.BOTH).setWeight(1, 1);
//		//为按钮设置属性
//		cusButton.setGBC(gbc);
//		//添加控件
//		gridBagLayoutUI.addCustomButton(cusButton);



//		//得到布局之后的面板
		jFrame.setContentPane(jPanel1);
//

		jFrame.pack();//容纳所有组件
		jFrame.setVisible(true);//显示窗口
	}
}
