package com.supermap.test;

import com.supermap.control.AddOperation;
import com.supermap.control.DivOperation;
import com.supermap.control.MulOperation;
import com.supermap.control.SubOperation;
import com.supermap.data.CusButton;
import com.supermap.data.Data;
import com.supermap.layout.*;

import javax.swing.*;
import java.util.ArrayList;

/**
 * @author Administrator
 */
public class RunMethod {
	//运行窗口的主方法
	public static void main(String[] args) {


		Calculator calculator = new Calculator();
		calculator.show();

		//自定义按钮
		//加法
		CusButton cusButton1 = new CusButton(Data.ADD.getText());
		cusButton1.setCat(2);
		cusButton1.setOperation(new AddOperation());
		//减法
		CusButton cusButton2 = new CusButton(Data.SUB.getText());
		cusButton2.setCat(2);
		cusButton2.setOperation(new SubOperation());
		//乘法
		CusButton cusButton3 = new CusButton(Data.MUL.getText());
		cusButton3.setCat(2);
		cusButton3.setOperation(new MulOperation());

		//除法
		CusButton cusButton4 = new CusButton(Data.DIV.getText());
		cusButton4.setCat(2);
		cusButton4.setOperation(new DivOperation());

//		gridBagLayoutUI.addCustomButton(cusButton1);
//		gridBagLayoutUI.addCustomButton(cusButton2);
//		gridBagLayoutUI.addCustomButton(cusButton3);
//		gridBagLayoutUI.addCustomButton(cusButton4);


		//获取指定按钮
//		CusButton cusButton = gridBagLayoutUI.getButtonByText("+");
//		System.out.println(cusButton.getText());

		//使用全部自定义布局，清除panel
//		gridBagLayoutUI.openCustom();

//		//得到布局之后的面板

	}
}
