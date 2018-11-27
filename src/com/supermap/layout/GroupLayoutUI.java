package com.supermap.layout;

import javax.swing.*;
import java.awt.*;

/**
 * @author Administrator
 */
public class GroupLayoutUI {

	private JButton[] keys = new JButton[ButtonData.KEYS.length];
	private static JTextField resultText = new JTextField("0");

	//返回创建好的Panel
	public JPanel addComponentsToPane(JPanel jPanel) {
		resultText.setFont(new Font("result", Font.PLAIN, 20));//设置结果显示的字体样式
		resultText.setEditable(false);//设置不可编辑
		resultText.setHorizontalAlignment(SwingConstants.RIGHT);//右对齐
		GroupLayout layout = new GroupLayout(jPanel);
		// 设置容器的布局
		jPanel.setLayout(layout);
		//初始化button数据
		for (int i = 0; i < keys.length; i++) {
			keys[i] = new JButton(ButtonData.KEYS[i]);
			keys[i].setFocusPainted(false);
		}
		// 自动创建组件之间的间隙
		layout.setAutoCreateGaps(true);
		// 自动创建容器与触到容器边框的组件之间的间隙
		layout.setAutoCreateContainerGaps(true);

		//水平方向
		layout.setHorizontalGroup(layout.createParallelGroup()
				.addComponent(resultText)
				.addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup()
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup()
												.addComponent(keys[ButtonData.CE], 0, 100, Short.MAX_VALUE)
												.addComponent(keys[ButtonData.SEVEN], 0, 100, Short.MAX_VALUE)
												.addComponent(keys[ButtonData.FOUR], 0, 100, Short.MAX_VALUE)
												.addComponent(keys[ButtonData.ONE], 0, 100, Short.MAX_VALUE))
										.addGroup(layout.createParallelGroup()
												.addComponent(keys[ButtonData.C], 0, 100, Short.MAX_VALUE)
												.addComponent(keys[ButtonData.EIGHT], 0, 100, Short.MAX_VALUE)
												.addComponent(keys[ButtonData.FIVE], 0, 100, Short.MAX_VALUE)
												.addComponent(keys[ButtonData.TWO], 0, 100, Short.MAX_VALUE)))
								.addComponent(keys[ButtonData.ZERO], 0, 100, 1000))
						.addGroup(layout.createParallelGroup()
								.addComponent(keys[ButtonData.BACK], 0, 100, Short.MAX_VALUE)
								.addComponent(keys[ButtonData.NINE], 0, 100, Short.MAX_VALUE)
								.addComponent(keys[ButtonData.SIX], 0, 100, Short.MAX_VALUE)
								.addComponent(keys[ButtonData.THREE], 0, 100, Short.MAX_VALUE)
								.addComponent(keys[ButtonData.SPOT], 0, 100, Short.MAX_VALUE))
						.addGroup(layout.createParallelGroup()
								.addComponent(keys[ButtonData.DIV], 0, 100, Short.MAX_VALUE)
								.addComponent(keys[ButtonData.MUL], 0, 100, Short.MAX_VALUE)
								.addComponent(keys[ButtonData.SUB], 0, 100, Short.MAX_VALUE)
								.addComponent(keys[ButtonData.ADD], 0, 100, Short.MAX_VALUE)
								.addComponent(keys[ButtonData.EQUAL], 0, 100, Short.MAX_VALUE))
				)
		);
		//垂直方向
		layout.setVerticalGroup(layout.createSequentialGroup()
				.addComponent(resultText, 55, 55, 200)
				.addGroup(layout.createParallelGroup()
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup()
										.addComponent(keys[ButtonData.CE], 38, 38, Short.MAX_VALUE)
										.addComponent(keys[ButtonData.C], 38, 38, Short.MAX_VALUE))
								.addGroup(layout.createParallelGroup()
										.addComponent(keys[ButtonData.SEVEN], 38, 38, Short.MAX_VALUE)
										.addComponent(keys[ButtonData.EIGHT], 38, 38, Short.MAX_VALUE))
								.addGroup(layout.createParallelGroup()
										.addComponent(keys[ButtonData.FOUR], 38, 38, Short.MAX_VALUE)
										.addComponent(keys[ButtonData.FIVE], 38, 38, Short.MAX_VALUE))
								.addGroup(layout.createParallelGroup()
										.addComponent(keys[ButtonData.ONE], 38, 38, Short.MAX_VALUE)
										.addComponent(keys[ButtonData.TWO], 38, 38, Short.MAX_VALUE))
								.addComponent(keys[ButtonData.ZERO], 38, 38, Short.MAX_VALUE))
						.addGroup(layout.createSequentialGroup()
								.addComponent(keys[ButtonData.BACK], 38, 38, Short.MAX_VALUE)
								.addComponent(keys[ButtonData.NINE], 38, 38, Short.MAX_VALUE)
								.addComponent(keys[ButtonData.SIX], 38, 38, Short.MAX_VALUE)
								.addComponent(keys[ButtonData.THREE], 38, 38, Short.MAX_VALUE)
								.addComponent(keys[ButtonData.SPOT], 38, 38, Short.MAX_VALUE))
						.addGroup(layout.createSequentialGroup()
								.addComponent(keys[ButtonData.DIV], 38, 38, Short.MAX_VALUE)
								.addComponent(keys[ButtonData.MUL], 38, 38, Short.MAX_VALUE)
								.addComponent(keys[ButtonData.SUB], 38, 38, Short.MAX_VALUE)
								.addComponent(keys[ButtonData.ADD], 38, 38, Short.MAX_VALUE)
								.addComponent(keys[ButtonData.EQUAL], 38, 38, Short.MAX_VALUE))));
		//为所有按钮添加点击事件
		OperationEvent.addClickEvent(keys, resultText);


		return jPanel;

	}

}
