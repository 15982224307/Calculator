package com.supermap.layout;


import javax.swing.*;
import java.awt.*;

/**
 * @author Administrator
 */
public class GridBagLayoutUI {


	private JTextField resultText = new JTextField("0");



	//返回创建好的Panel
	public JPanel addComponentsToPane(JPanel contentPane) {
		GridBagLayout gridBagLayout = new GridBagLayout();//创建布局
		contentPane.setLayout(gridBagLayout);//将布局添加到面板中
		resultText.setFont(new Font("result", Font.PLAIN, 20));//设置结果显示的字体样式
		resultText.setEditable(false);//设置不可编辑
		resultText.setHorizontalAlignment(SwingConstants.RIGHT);//右对齐
		contentPane.add(resultText, new GBC(0, 0, 4, 2).setIpad(400, 30)
				.setWeight(2, 1).setFill(GridBagConstraints.BOTH));
		for (int i = 0; i < ButtonData.keys.length; i++) {
			ButtonData.keys[i] = new JButton(ButtonData.KEYS[i]);
			ButtonData.keys[i].setFocusPainted(false);//点击时不会出现白色线框
			if (i == ButtonData.keys.length - 3) {
				contentPane.add(ButtonData.keys[i], new GBC(i % 4, i / 4 + 2, 2, 1).setIpad(0, 10).setFill(GridBagConstraints.BOTH).setWeight(1, 1));
			} else if (i == ButtonData.keys.length - 2 || i == ButtonData.keys.length - 1) {
				contentPane.add(ButtonData.keys[i], new GBC(i % 4 + 1, i / 4 + 2, 1, 1).setIpad(0, 10).setInsets(1).setFill(GridBagConstraints.BOTH).setWeight(1, 1));
			} else {
				contentPane.add(ButtonData.keys[i], new GBC(i % 4, i / 4 + 2, 1, 1).setIpad(0, 10).setInsets(1).setFill(GridBagConstraints.BOTH).setWeight(1, 1));
			}
		}
		return contentPane;
	}

	public void addOnclickEvent(JButton[] keys){
		//为所有按钮添加点击事件
		OperationEvent.addClickEvent(keys, resultText);
	}
}
