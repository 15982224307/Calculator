package com.supermap.layout;

import com.supermap.control.OperationEvent;
import com.supermap.data.ButtonData;
import com.supermap.data.ButtonFactory;
import com.supermap.data.CusButton;
import com.supermap.data.Data;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

/**
 * @author Administrator
 */
public class GroupLayoutUI {

	private static JTextField resultText = new JTextField("0");
	JPanel contentPane;
	private Map<String, CusButton> btnMap;
	private JPanel cusPanel;

	public GroupLayoutUI(JPanel contentPane) {
		this.contentPane = contentPane;
		cusPanel = new JPanel();
		initLayout();
	}


	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	protected void initLayout() {
		btnMap = ButtonFactory.initMap();
		resultText.setFont(new Font("result", Font.PLAIN, 20));//设置结果显示的字体样式
		resultText.setEditable(false);//设置不可编辑
		resultText.setHorizontalAlignment(SwingConstants.RIGHT);//右对齐
		GroupLayout layout = new GroupLayout(contentPane);

		// 设置容器的布局
		contentPane.setLayout(layout);
		//添加自定义
		FlowLayout flowLayout = new FlowLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		cusPanel.setLayout(flowLayout);


		for (Map.Entry<String, CusButton> cusButton : btnMap.entrySet()) {
			addOnclickEvent(cusButton.getValue());
			cusButton.getValue().setFocusPainted(false);//点击时不会出现白色线框
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
												.addComponent(btnMap.get(Data.CE.getText()), 0, 100, Short.MAX_VALUE)
												.addComponent(btnMap.get(Data.SEVEN.getText()), 0, 100, Short.MAX_VALUE)
												.addComponent(btnMap.get(Data.FOUR.getText()), 0, 100, Short.MAX_VALUE)
												.addComponent(btnMap.get(Data.ONE.getText()), 0, 100, Short.MAX_VALUE))
										.addGroup(layout.createParallelGroup()
												.addComponent(btnMap.get(Data.C.getText()), 0, 100, Short.MAX_VALUE)
												.addComponent(btnMap.get(Data.EIGHT.getText()), 0, 100, Short.MAX_VALUE)
												.addComponent(btnMap.get(Data.FIVE.getText()), 0, 100, Short.MAX_VALUE)
												.addComponent(btnMap.get(Data.TWO.getText()), 0, 100, Short.MAX_VALUE)))
								.addComponent(ButtonFactory.getBtnByText(Data.ZERO.getText()), 0, 100, 1000))
						.addGroup(layout.createParallelGroup()
								.addComponent(btnMap.get(Data.BACK.getText()), 0, 100, Short.MAX_VALUE)
								.addComponent(btnMap.get(Data.NINE.getText()), 0, 100, Short.MAX_VALUE)
								.addComponent(btnMap.get(Data.SIX.getText()), 0, 100, Short.MAX_VALUE)
								.addComponent(btnMap.get(Data.THREE.getText()), 0, 100, Short.MAX_VALUE)
								.addComponent(btnMap.get(Data.SPOT.getText()), 0, 100, Short.MAX_VALUE))
						.addGroup(layout.createParallelGroup()
								.addComponent(btnMap.get(Data.DIV.getText()), 0, 100, Short.MAX_VALUE)
								.addComponent(btnMap.get(Data.MUL.getText()), 0, 100, Short.MAX_VALUE)
								.addComponent(btnMap.get(Data.SUB.getText()), 0, 100, Short.MAX_VALUE)
								.addComponent(btnMap.get(Data.ADD.getText()), 0, 100, Short.MAX_VALUE)
								.addComponent(btnMap.get(Data.EQUAL.getText()), 0, 100, Short.MAX_VALUE)))
				.addComponent(cusPanel)
		);
		//垂直方向
		layout.setVerticalGroup(layout.createSequentialGroup()
				.addComponent(resultText, 55, 55, 200)
				.addGroup(layout.createParallelGroup()
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup()
										.addComponent(btnMap.get(Data.CE.getText()), 38, 38, Short.MAX_VALUE)
										.addComponent(btnMap.get(Data.C.getText()), 38, 38, Short.MAX_VALUE))
								.addGroup(layout.createParallelGroup()
										.addComponent(btnMap.get(Data.SEVEN.getText()), 38, 38, Short.MAX_VALUE)
										.addComponent(btnMap.get(Data.EIGHT.getText()), 38, 38, Short.MAX_VALUE))
								.addGroup(layout.createParallelGroup()
										.addComponent(btnMap.get(Data.FOUR.getText()), 38, 38, Short.MAX_VALUE)
										.addComponent(btnMap.get(Data.FIVE.getText()), 38, 38, Short.MAX_VALUE))
								.addGroup(layout.createParallelGroup()
										.addComponent(btnMap.get(Data.ONE.getText()), 38, 38, Short.MAX_VALUE)
										.addComponent(btnMap.get(Data.TWO.getText()), 38, 38, Short.MAX_VALUE))
								.addComponent(ButtonFactory.getBtnByText(Data.ZERO.getText()), 38, 38, Short.MAX_VALUE))
						.addGroup(layout.createSequentialGroup()
								.addComponent(btnMap.get(Data.BACK.getText()), 38, 38, Short.MAX_VALUE)
								.addComponent(btnMap.get(Data.NINE.getText()), 38, 38, Short.MAX_VALUE)
								.addComponent(btnMap.get(Data.SIX.getText()), 38, 38, Short.MAX_VALUE)
								.addComponent(btnMap.get(Data.THREE.getText()), 38, 38, Short.MAX_VALUE)
								.addComponent(btnMap.get(Data.SPOT.getText()), 38, 38, Short.MAX_VALUE))
						.addGroup(layout.createSequentialGroup()
								.addComponent(btnMap.get(Data.DIV.getText()), 38, 38, Short.MAX_VALUE)
								.addComponent(btnMap.get(Data.MUL.getText()), 38, 38, Short.MAX_VALUE)
								.addComponent(btnMap.get(Data.SUB.getText()), 38, 38, Short.MAX_VALUE)
								.addComponent(btnMap.get(Data.ADD.getText()), 38, 38, Short.MAX_VALUE)
								.addComponent(btnMap.get(Data.EQUAL.getText()), 38, 38, Short.MAX_VALUE)))
				.addComponent(cusPanel)
		);

	}

	JPanel getCusPanel() {
		return cusPanel;
	}

	void addOnclickEvent(JButton keys) {
		//为所有按钮添加点击事件
		OperationEvent.addClickEvent(keys, resultText);
	}

}
