package com.supermap.layout;


import com.supermap.control.OperationEvent;
import com.supermap.data.*;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

/**
 * @author Administrator
 */
public class GridBagLayoutUI {

	private JTextField resultText = new JTextField("0");
	JPanel contentPane;
	private Map<String, CusButton> btnMap;
	private JPanel cusPanel;

	GridBagLayoutUI(JPanel contentPane) {
		this.contentPane = contentPane;
		cusPanel = new JPanel();
		initLayout();
	}

	JPanel getCusPanel() {
		return cusPanel;
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}



	protected void initLayout() {
		btnMap = ButtonFactory.initMap();
		GridBagLayout gridBagLayout = new GridBagLayout();//创建布局
		FlowLayout flowLayout = new FlowLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);

		contentPane.setLayout(gridBagLayout);//将布局添加到面板中
		cusPanel.setLayout(flowLayout);//添加自定义

		resultText.setFont(new Font("result", Font.PLAIN, 20));//设置结果显示的字体样式
		resultText.setEditable(false);//设置不可编辑
		resultText.setHorizontalAlignment(SwingConstants.RIGHT);//右对齐
		contentPane.add(resultText, new GBC(0, 0, 4, 2).setIpad(400, 30)
				.setWeight(2, 1).setFill(GridBagConstraints.BOTH));

		//默认按钮添加点击事件
		for (Map.Entry<String, CusButton> cusButton : btnMap.entrySet()) {
			addOnclickEvent(cusButton.getValue());
			cusButton.getValue().setFocusPainted(false);//点击时不会出现白色线框
		}

		//默认布局
		//第一行
		contentPane.add(btnMap.get(Data.CE.getText()), new GBC(0, 2, 1, 1).setIpad(0, 10).setInsets(2).setFill(GridBagConstraints.BOTH).setWeight(1, 1));
		contentPane.add(btnMap.get("C"), new GBC(1, 2, 1, 1).setIpad(0, 10).setInsets(2).setFill(GridBagConstraints.BOTH).setWeight(1, 1));
		contentPane.add(btnMap.get(Data.BACK.getText()), new GBC(2, 2, 1, 1).setIpad(0, 10).setInsets(2).setFill(GridBagConstraints.BOTH).setWeight(1, 1));
		//contentPane.add(btnMap.get(Data.DIV.getText()), new GBC(3, 2, 1, 1).setIpad(0, 10).setInsets(2).setFill(GridBagConstraints.BOTH).setWeight(1, 1));
		//第二行
		contentPane.add(btnMap.get(Data.SEVEN.getText()), new GBC(0, 3, 1, 1).setIpad(0, 10).setInsets(2).setFill(GridBagConstraints.BOTH).setWeight(1, 1));
		contentPane.add(btnMap.get(Data.EIGHT.getText()), new GBC(1, 3, 1, 1).setIpad(0, 10).setInsets(2).setFill(GridBagConstraints.BOTH).setWeight(1, 1));
		contentPane.add(btnMap.get(Data.NINE.getText()), new GBC(2, 3, 1, 1).setIpad(0, 10).setInsets(2).setFill(GridBagConstraints.BOTH).setWeight(1, 1));
		//contentPane.add(btnMap.get(Data.MUL.getText()), new GBC(3, 3, 1, 1).setIpad(0, 10).setInsets(2).setFill(GridBagConstraints.BOTH).setWeight(1, 1));
		//第三行
		contentPane.add(btnMap.get(Data.FOUR.getText()), new GBC(0, 4, 1, 1).setIpad(0, 10).setInsets(2).setFill(GridBagConstraints.BOTH).setWeight(1, 1));
		contentPane.add(btnMap.get(Data.FIVE.getText()), new GBC(1, 4, 1, 1).setIpad(0, 10).setInsets(2).setFill(GridBagConstraints.BOTH).setWeight(1, 1));
		contentPane.add(btnMap.get(Data.SIX.getText()), new GBC(2, 4, 1, 1).setIpad(0, 10).setInsets(2).setFill(GridBagConstraints.BOTH).setWeight(1, 1));
		//contentPane.add(btnMap.get(Data.SUB.getText()), new GBC(3, 4, 1, 1).setIpad(0, 10).setInsets(2).setFill(GridBagConstraints.BOTH).setWeight(1, 1));
		//第四行
		contentPane.add(btnMap.get(Data.ONE.getText()), new GBC(0, 5, 1, 1).setIpad(0, 10).setInsets(2).setFill(GridBagConstraints.BOTH).setWeight(1, 1));
		contentPane.add(btnMap.get(Data.TWO.getText()), new GBC(1, 5, 1, 1).setIpad(0, 10).setInsets(2).setFill(GridBagConstraints.BOTH).setWeight(1, 1));
		contentPane.add(btnMap.get(Data.THREE.getText()), new GBC(2, 5, 1, 1).setIpad(0, 10).setInsets(2).setFill(GridBagConstraints.BOTH).setWeight(1, 1));
		//contentPane.add(btnMap.get(Data.ADD.getText()), new GBC(3, 5, 1, 1).setIpad(0, 10).setInsets(2).setFill(GridBagConstraints.BOTH).setWeight(1, 1));
		//第五行
		contentPane.add(btnMap.get(Data.ZERO.getText()), new GBC(0, 6, 2, 1).setIpad(0, 10).setInsets(2).setFill(GridBagConstraints.BOTH).setWeight(1, 1));
		contentPane.add(btnMap.get(Data.SPOT.getText()), new GBC(2, 6, 1, 1).setIpad(0, 10).setInsets(2).setFill(GridBagConstraints.BOTH).setWeight(1, 1));
		contentPane.add(btnMap.get(Data.EQUAL.getText()), new GBC(3, 6, 1, 1).setIpad(0, 10).setInsets(2).setFill(GridBagConstraints.BOTH).setWeight(1, 1));


		//将自定义的FlowLayout布局在最下方
		contentPane.add(cusPanel,new GBC(0, 7, 4, 1).setFill(GridBagConstraints.BOTH).setWeight(1, 1));


	}

	public CusButton getButtonByText(String text) {
		CusButton button = null;
		button = btnMap.get(text);
		return button;
	}


	void addOnclickEvent(JButton keys) {
		//为单个按钮添加点击事件
		OperationEvent.addClickEvent(keys, resultText);
	}
}
