package com.supermap.layout;


import javax.swing.*;
import java.awt.*;

/**
 * @author Administrator
 */
public class GridBagLayoutCalculator {

	final String[] KEYS = {"CE", "C", "←", "÷", "7", "8", "9", "×", "4", "5", "6", "-", "1", "2", "3", "+", "0", ".", "="};
	JButton[] keys = new JButton[KEYS.length];
	JTextField resultText = new JTextField("0");

	public void creatAndShowUI() {

		JFrame jFrame = new JFrame("计算器");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setLocationRelativeTo(null);
		jFrame.setResizable(false);
		addComponentsToPane(jFrame.getContentPane());
		jFrame.pack();
		jFrame.setVisible(true);//显示窗口
	}

	public void addComponentsToPane(Container contentPane) {
		GridBagLayout gridBagLayout = new GridBagLayout();//创建布局
		GridBagConstraints gridBagConstraints = new GridBagConstraints();//约束布局
		contentPane.setLayout(gridBagLayout);//将布局添加到面板中
		resultText.setFont(new Font("result", Font.PLAIN, 16));//设置结果显示的字体样式
		resultText.setEditable(false);//设置不可编辑
		resultText.setHorizontalAlignment(SwingConstants.RIGHT);//右对齐
		contentPane.add(resultText, new GBC(0, 0, 4, 2).setIpad(300, 20)
				.setWeight(2, 1).setFill(GridBagConstraints.BOTH));

		for (int i = 0; i < keys.length; i++) {
			keys[i] = new JButton(KEYS[i]);
			keys[i].setFocusPainted(false);//点击时不会出现白色线框
			if (i == keys.length - 3) {
				contentPane.add(keys[i], new GBC(i % 4, i / 4 + 2, 2, 1).setIpad(0, 12)
						.setFill(GridBagConstraints.BOTH).setWeight(1, 1));
			} else if (i == keys.length - 2 || i == keys.length - 1) {
				contentPane.add(keys[i], new GBC(i % 4 + 1, i / 4 + 2, 1, 1).setIpad(0, 12).setInsets(1)
						.setFill(GridBagConstraints.BOTH).setWeight(1, 1));
			} else {
				contentPane.add(keys[i],new GBC(i % 4, i / 4 + 2,1,1).setIpad(0, 12)
						.setInsets(1).setFill(gridBagConstraints.BOTH).setWeight(1,1));
			}
		}
	}
	public static void main(String[] args) {
		new GridBagLayoutCalculator().creatAndShowUI();
	}
}
