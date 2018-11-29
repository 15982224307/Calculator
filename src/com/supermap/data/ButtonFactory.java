package com.supermap.data;

import com.supermap.control.AddOperation;
import com.supermap.control.DivOperation;
import com.supermap.control.MulOperation;
import com.supermap.control.SubOperation;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 */
public class ButtonFactory {

	private static Map<String, CusButton> btnMap = new HashMap<>();

	public static Map<String, CusButton> initMap() {
		CusButton cusButton0 = new CusButton(Data.ZERO.getText());
		CusButton cusButton1 = new CusButton(Data.ONE.getText());
		CusButton cusButton2 = new CusButton(Data.TWO.getText());
		CusButton cusButton3 = new CusButton(Data.THREE.getText());
		CusButton cusButton4 = new CusButton(Data.FOUR.getText());
		CusButton cusButton5 = new CusButton(Data.FIVE.getText());
		CusButton cusButton6 = new CusButton(Data.SIX.getText());
		CusButton cusButton7 = new CusButton(Data.SEVEN.getText());
		CusButton cusButton8 = new CusButton(Data.EIGHT.getText());
		CusButton cusButton9 = new CusButton(Data.NINE.getText());
		CusButton cusButton_CE = new CusButton(Data.CE.getText());
		CusButton cusButton_C = new CusButton(Data.C.getText());
		CusButton cusButton_BACK = new CusButton(Data.BACK.getText());

		CusButton cusButton_DIV = new CusButton(Data.DIV.getText());
		cusButton_DIV.setCat(ButtonEnum.OP.getCode());
		cusButton_DIV.setOperation(new DivOperation());

		CusButton cusButton_MUL = new CusButton(Data.MUL.getText());
		cusButton_MUL.setCat(ButtonEnum.OP.getCode());
		cusButton_MUL.setOperation(new MulOperation());

		CusButton cusButton_SUB = new CusButton(Data.SUB.getText());
		cusButton_SUB.setCat(ButtonEnum.OP.getCode());
		cusButton_SUB.setOperation(new SubOperation());

		CusButton cusButton_ADD = new CusButton(Data.ADD.getText());
		cusButton_ADD.setCat(ButtonEnum.OP.getCode());
		cusButton_ADD.setOperation(new AddOperation());

		CusButton cusButton_SPORT = new CusButton(Data.SPOT.getText());
		CusButton cusButton_EQUAL = new CusButton(Data.EQUAL.getText());
		cusButton_EQUAL.setCat(ButtonEnum.EQ.getCode());
		btnMap.put(Data.ZERO.getText(), cusButton0);
		btnMap.put(Data.ONE.getText(), cusButton1);
		btnMap.put(Data.TWO.getText(), cusButton2);
		btnMap.put(Data.THREE.getText(), cusButton3);
		btnMap.put(Data.FOUR.getText(), cusButton4);
		btnMap.put(Data.FIVE.getText(), cusButton5);
		btnMap.put(Data.SIX.getText(), cusButton6);
		btnMap.put(Data.SEVEN.getText(), cusButton7);
		btnMap.put(Data.EIGHT.getText(), cusButton8);
		btnMap.put(Data.NINE.getText(), cusButton9);
		btnMap.put(Data.CE.getText(), cusButton_CE);
		btnMap.put(Data.C.getText(), cusButton_C);
		btnMap.put(Data.BACK.getText(), cusButton_BACK);
		btnMap.put(Data.DIV.getText(), cusButton_DIV);
		btnMap.put(Data.MUL.getText(), cusButton_MUL);
		btnMap.put(Data.SUB.getText(), cusButton_SUB);
		btnMap.put(Data.ADD.getText(), cusButton_ADD);
		btnMap.put(Data.SPOT.getText(), cusButton_SPORT);
		btnMap.put(Data.EQUAL.getText(), cusButton_EQUAL);
		return btnMap;
	}

	public static CusButton getBtnByText(String text) {
		CusButton cusButton = null;
		if (btnMap.containsKey(text)){
			cusButton = btnMap.get(text);
		}
		return cusButton;
	}
}
