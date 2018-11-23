package com.supermap.layout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Administrator
 */
public class GroupLayoutUI {
	private final String[] KEYS = {"CE", "C", "←", "÷", "7", "8", "9", "×", "4", "5", "6", "-", "1", "2", "3", "+", "0", ".", "="};
	private final static int CE = 0;
	private final static int C = 1;
	private final static int BACK = 2;
	private final static int DIV = 3;
	private final static int SEVEN = 4;
	private final static int EIGHT = 5;
	private final static int NINE = 6;
	private final static int MUL = 7;
	private final static int FOUR = 8;
	private final static int FIVE = 9;
	private final static int SIX = 10;
	private final static int SUB = 11;
	private final static int ONE = 12;
	private final static int TWO = 13;
	private final static int THREE = 14;
	private final static int ADD = 15;
	private final static int ZERO = 16;
	private final static int SPOT = 17;
	private final static int EQUAL = 18;
	private JButton[] keys = new JButton[KEYS.length];
	private static JTextField resultText = new JTextField("0");

	public JPanel addComponentsToPane(JPanel jPanel) {
		resultText.setFont(new Font("result", Font.PLAIN, 20));//设置结果显示的字体样式
		resultText.setEditable(false);//设置不可编辑
		resultText.setHorizontalAlignment(SwingConstants.RIGHT);//右对齐
		GroupLayout layout = new GroupLayout(jPanel);
		// 设置容器的布局
		jPanel.setLayout(layout);
		//初始化button数据
		for (int i = 0; i < keys.length; i++) {
			keys[i] = new JButton(KEYS[i]);
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
												.addComponent(keys[CE], 0, 100, Short.MAX_VALUE)
												.addComponent(keys[SEVEN], 0, 100, Short.MAX_VALUE)
												.addComponent(keys[FOUR], 0, 100, Short.MAX_VALUE)
												.addComponent(keys[ONE], 0, 100, Short.MAX_VALUE))
										.addGroup(layout.createParallelGroup()
												.addComponent(keys[C], 0, 100, Short.MAX_VALUE)
												.addComponent(keys[EIGHT], 0, 100, Short.MAX_VALUE)
												.addComponent(keys[FIVE], 0, 100, Short.MAX_VALUE)
												.addComponent(keys[TWO], 0, 100, Short.MAX_VALUE)))
								.addComponent(keys[ZERO], 0, 100, 1000))
						.addGroup(layout.createParallelGroup()
								.addComponent(keys[BACK], 0, 100, Short.MAX_VALUE)
								.addComponent(keys[NINE], 0, 100, Short.MAX_VALUE)
								.addComponent(keys[SIX], 0, 100, Short.MAX_VALUE)
								.addComponent(keys[THREE], 0, 100, Short.MAX_VALUE)
								.addComponent(keys[SPOT], 0, 100, Short.MAX_VALUE))
						.addGroup(layout.createParallelGroup()
								.addComponent(keys[DIV], 0, 100, Short.MAX_VALUE)
								.addComponent(keys[MUL], 0, 100, Short.MAX_VALUE)
								.addComponent(keys[SUB], 0, 100, Short.MAX_VALUE)
								.addComponent(keys[ADD], 0, 100, Short.MAX_VALUE)
								.addComponent(keys[EQUAL], 0, 100, Short.MAX_VALUE))
				)
		);
		//垂直方向
		layout.setVerticalGroup(layout.createSequentialGroup()
				.addComponent(resultText, 55, 55, 200)
				.addGroup(layout.createParallelGroup()
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup()
										.addComponent(keys[CE], 38, 38, Short.MAX_VALUE)
										.addComponent(keys[C], 38, 38, Short.MAX_VALUE))
								.addGroup(layout.createParallelGroup()
										.addComponent(keys[SEVEN], 38, 38, Short.MAX_VALUE)
										.addComponent(keys[EIGHT], 38, 38, Short.MAX_VALUE))
								.addGroup(layout.createParallelGroup()
										.addComponent(keys[FOUR], 38, 38, Short.MAX_VALUE)
										.addComponent(keys[FIVE], 38, 38, Short.MAX_VALUE))
								.addGroup(layout.createParallelGroup()
										.addComponent(keys[ONE], 38, 38, Short.MAX_VALUE)
										.addComponent(keys[TWO], 38, 38, Short.MAX_VALUE))
								.addComponent(keys[ZERO], 38, 38, Short.MAX_VALUE))
						.addGroup(layout.createSequentialGroup()
								.addComponent(keys[BACK], 38, 38, Short.MAX_VALUE)
								.addComponent(keys[NINE], 38, 38, Short.MAX_VALUE)
								.addComponent(keys[SIX], 38, 38, Short.MAX_VALUE)
								.addComponent(keys[THREE], 38, 38, Short.MAX_VALUE)
								.addComponent(keys[SPOT], 38, 38, Short.MAX_VALUE))
						.addGroup(layout.createSequentialGroup()
								.addComponent(keys[DIV], 38, 38, Short.MAX_VALUE)
								.addComponent(keys[MUL], 38, 38, Short.MAX_VALUE)
								.addComponent(keys[SUB], 38, 38, Short.MAX_VALUE)
								.addComponent(keys[ADD], 38, 38, Short.MAX_VALUE)
								.addComponent(keys[EQUAL], 38, 38, Short.MAX_VALUE))));
		//为所有按钮添加点击事件
		OperationEvent.addClickEvent(keys, resultText);


		return jPanel;

	}

}
