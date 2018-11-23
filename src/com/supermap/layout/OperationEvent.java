package com.supermap.layout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Administrator
 */
public class OperationEvent {

	private static Stack<Double> numberStack = new Stack<>();//使用栈来数据
	private static Stack<String> opStack = new Stack<>();//使用栈来运算符号
	private static String newString = "";//用来储存最新的数字


	public static void addClickEvent(JButton[] keys, JTextField resultText) {

		//为所有按钮添加点击事件
		for (JButton key : keys) {
			key.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String text = resultText.getText();//获取显示框数据
					if ("0".equals(text)) {
						text = "";
					}
					String btnText = ((JButton) e.getSource()).getText();//获取点击Button上的文本

					//点击不同的按钮产生不同的操作
					switch (btnText) {
						case "CE":
							text = "0";
							break;
						case "C":
							text = "0";
							numberStack.setSize(0);
							break;
						case "←":
							if ("".equals(text)) {
								text = "0";
							}
							text = text.substring(0, text.length() - 1);//截取输入的自后一个字符

							if ("".equals(text)) {
								text = "0";
							}
							System.out.println(text);
							break;
						case "+":
							numberStack.push(Double.parseDouble(newString));//将最新的数字添加到栈中
							opStack.push("+");//将运算符添加到栈中
							newString = "";//将最新数字置为空
//							System.out.println(stack);
							text += btnText;//动态显示运算
							break;
						case "-":
							numberStack.push(Double.parseDouble(newString));
							opStack.push("-");
							newString = "";
//							System.out.println(stack);
							text += btnText;
							break;
						case "×":
							numberStack.push(Double.parseDouble(newString));
							opStack.push("×");
							newString = "";
//							System.out.println(stack);
							text += btnText;
							break;
						case "÷":
							numberStack.push(Double.parseDouble(newString));
							opStack.push("÷");
							newString = "";
//							System.out.println(stack);
							text += btnText;
							break;
						case "=":
							numberStack.push(Double.parseDouble(newString));
							newString = "";

							//去执行最后结果的计算
							double v = calculateResult();
							System.out.println(v);
							text = v + "";
							break;

						default:
							text += btnText;
							newString += btnText;
							break;
					}
					resultText.setText(text);
				}
			});
		}

	}

	//计算整个运算的结果
	private static double calculateResult() {
		double result = 0.0;
		System.out.println(numberStack);
		System.out.println(opStack);

		while (!opStack.empty()) {
			String popTop = opStack.pop();
			if ("×".equals(popTop) || "÷".equals(popTop)) {//判断最末尾的运算的优先级
				if ("÷".equals(popTop) && numberStack.peek() == 0.0) {//除数不能为0
					result = Double.MAX_VALUE;
					return result;
				} else {
					result = getResult(numberStack.pop(), numberStack.pop(), popTop);
					numberStack.push(result);
				}

			} else {//如果末尾是优先级低的，不能直接运算，因为倒数第二个的优先级可能会高，所以要先进行判断
				if (opStack.empty()) {//说明此时只剩一次运算了
					result = getResult(numberStack.pop(), numberStack.pop(), popTop);//得到最后的结果
					numberStack.push(result);
				} else {
					String popTwo = opStack.pop();
					if ("×".equals(popTwo) || "÷".equals(popTwo)) {
						Double pop1 = numberStack.pop();//取出栈顶元素
						if ("÷".equals(popTwo) && numberStack.peek() == 0.0) {//除数不能为0
							result = Double.MAX_VALUE;
							return result;
						} else {
							result = getResult(numberStack.pop(), numberStack.pop(), popTwo);//对优先级高的先运算
							opStack.push(popTop);//优先级低的运算的运算符放回栈
							numberStack.push(result);//优先级高的运算的结果放回栈
							numberStack.push(pop1);//为参与运算的栈顶元素放回栈
						}
					} else {
						result = getResult(numberStack.pop(), numberStack.pop(), popTop);//这里是表明剩下的全是优先级低的运算
						numberStack.push(result);
						opStack.push(popTwo);//取出的运算符，未使用就放回

					}
				}
			}
			System.out.println(numberStack);
			System.out.println(opStack);
		}
		return result;
	}

	private static double getResult(double x, double y, String op) {
		double result = 0.0;
		switch (op) {
			case "+":
				result = y + x;
				break;
			case "-":
				result = y - x;
				break;
			case "×":
				result = y * x;
				break;
			case "÷":
				result = y / x;
				break;
			default:
				break;
		}
		return result;
	}
}
