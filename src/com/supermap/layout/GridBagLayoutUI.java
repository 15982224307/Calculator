package com.supermap.layout;


import com.supermap.control.OperationEvent;
import com.supermap.data.ButtonData;
import com.supermap.data.CusButton;
import com.supermap.data.GBC;

import javax.swing.*;
import java.awt.*;

/**
 * @author Administrator
 */
public class GridBagLayoutUI {

	private JTextField resultText = new JTextField("0");

	JPanel contentPane;

	GridBagLayoutUI(JPanel contentPane) {
		this.contentPane = contentPane;
		initLayout();
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	protected void initLayout() {
		GridBagLayout gridBagLayout = new GridBagLayout();//创建布局
		contentPane.setLayout(gridBagLayout);//将布局添加到面板中
		resultText.setFont(new Font("result", Font.PLAIN, 20));//设置结果显示的字体样式
		resultText.setEditable(false);//设置不可编辑
		resultText.setHorizontalAlignment(SwingConstants.RIGHT);//右对齐
		contentPane.add(resultText, new GBC(0, 0, 4, 2).setIpad(400, 30)
				.setWeight(2, 1).setFill(GridBagConstraints.BOTH));

		for (int i = 0; i < ButtonData.keys.length; i++) {
			ButtonData.keys[i] = new CusButton(ButtonData.KEYS[i]);
			ButtonData.keys[i].setFocusPainted(false);//点击时不会出现白色线框
		}
		//默认布局
		//第一行
		contentPane.add(ButtonData.keys[ButtonData.CE], new GBC(0, 2, 1, 1).setIpad(0, 10).setInsets(2).setFill(GridBagConstraints.BOTH).setWeight(1, 1));
		contentPane.add(ButtonData.keys[ButtonData.C], new GBC(1, 2, 1, 1).setIpad(0, 10).setInsets(2).setFill(GridBagConstraints.BOTH).setWeight(1, 1));
		contentPane.add(ButtonData.keys[ButtonData.BACK], new GBC(2, 2, 1, 1).setIpad(0, 10).setInsets(2).setFill(GridBagConstraints.BOTH).setWeight(1, 1));
		contentPane.add(ButtonData.keys[ButtonData.DIV], new GBC(3, 2, 1, 1).setIpad(0, 10).setInsets(2).setFill(GridBagConstraints.BOTH).setWeight(1, 1));
		//第二行
		contentPane.add(ButtonData.keys[ButtonData.SEVEN], new GBC(0, 3, 1, 1).setIpad(0, 10).setInsets(2).setFill(GridBagConstraints.BOTH).setWeight(1, 1));
		contentPane.add(ButtonData.keys[ButtonData.EIGHT], new GBC(1, 3, 1, 1).setIpad(0, 10).setInsets(2).setFill(GridBagConstraints.BOTH).setWeight(1, 1));
		contentPane.add(ButtonData.keys[ButtonData.NINE], new GBC(2, 3, 1, 1).setIpad(0, 10).setInsets(2).setFill(GridBagConstraints.BOTH).setWeight(1, 1));
		contentPane.add(ButtonData.keys[ButtonData.MUL], new GBC(3, 3, 1, 1).setIpad(0, 10).setInsets(2).setFill(GridBagConstraints.BOTH).setWeight(1, 1));
		//第三行
		contentPane.add(ButtonData.keys[ButtonData.FOUR], new GBC(0, 4, 1, 1).setIpad(0, 10).setInsets(2).setFill(GridBagConstraints.BOTH).setWeight(1, 1));
		contentPane.add(ButtonData.keys[ButtonData.FIVE], new GBC(1, 4, 1, 1).setIpad(0, 10).setInsets(2).setFill(GridBagConstraints.BOTH).setWeight(1, 1));
		contentPane.add(ButtonData.keys[ButtonData.SIX], new GBC(2, 4, 1, 1).setIpad(0, 10).setInsets(2).setFill(GridBagConstraints.BOTH).setWeight(1, 1));
		contentPane.add(ButtonData.keys[ButtonData.SUB], new GBC(3, 4, 1, 1).setIpad(0, 10).setInsets(2).setFill(GridBagConstraints.BOTH).setWeight(1, 1));
		//第四行
		contentPane.add(ButtonData.keys[ButtonData.ONE], new GBC(0, 5, 1, 1).setIpad(0, 10).setInsets(2).setFill(GridBagConstraints.BOTH).setWeight(1, 1));
		contentPane.add(ButtonData.keys[ButtonData.TWO], new GBC(1, 5, 1, 1).setIpad(0, 10).setInsets(2).setFill(GridBagConstraints.BOTH).setWeight(1, 1));
		contentPane.add(ButtonData.keys[ButtonData.THREE], new GBC(2, 5, 1, 1).setIpad(0, 10).setInsets(2).setFill(GridBagConstraints.BOTH).setWeight(1, 1));
		contentPane.add(ButtonData.keys[ButtonData.ADD], new GBC(3, 5, 1, 1).setIpad(0, 10).setInsets(2).setFill(GridBagConstraints.BOTH).setWeight(1, 1));
		//第五行
		contentPane.add(ButtonData.keys[ButtonData.ZERO], new GBC(0, 6, 2, 1).setIpad(0, 10).setInsets(2).setFill(GridBagConstraints.BOTH).setWeight(1, 1));
		contentPane.add(ButtonData.keys[ButtonData.SPOT], new GBC(2, 6, 1, 1).setIpad(0, 10).setInsets(2).setFill(GridBagConstraints.BOTH).setWeight(1, 1));
		contentPane.add(ButtonData.keys[ButtonData.EQUAL], new GBC(3, 6, 1, 1).setIpad(0, 10).setInsets(2).setFill(GridBagConstraints.BOTH).setWeight(1, 1));

		//默认按钮添加点击事件
		addOnclickEvent(ButtonData.keys);

	}

	private void addOnclickEvent(JButton[] keys) {
		//为所有按钮添加点击事件
		OperationEvent.addClickEvent(keys, resultText);
	}

	void addOnclickEvent(JButton keys) {
		//为单个按钮添加点击事件
		OperationEvent.addClickEvent(keys, resultText);
	}
}
