package com.supermap.layout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Stack;
import java.util.regex.Pattern;

/**
 * @author Administrator
 */
public class OperationEvent {

	private static Stack<Double> numberStack = new Stack<>();//使用栈来数据
	private static Stack<String> opStack = new Stack<>();//使用栈来运算符号
	private static String newString = "";//用来储存最新的数字
	private static Pattern pattern = Pattern.compile("[0-9]*");
	private static boolean delete = true;
	private static boolean lock = false;


	public static void addClickEvent(JButton[] keys, JTextField resultText) {

		//为所有按钮添加点击事件
		for (JButton key : keys) {
			key.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String text = resultText.getText();//获取显示框数据
					if (ButtonData.space.equals(text)) {
						text = "";
					}
					String btnText = ((JButton) e.getSource()).getText();//获取点击Button上的文本
					if (ButtonData.c.equals(btnText)) {
						text = ButtonData.space;
						newString = "";
						if (lock) {
							lock = false;
						}
					}
					if (!lock) {
						switch (btnText) {//点击不同的按钮产生不同的操作
							case ButtonData.ce:
								text = ButtonData.space;
								newString = "";
								numberStack.setSize(0);
								opStack.setSize(0);
								break;
							case ButtonData.c:
								text = ButtonData.space;
								newString = "";
								numberStack.setSize(0);
								opStack.setSize(0);
								break;
							case ButtonData.delete:
								if (delete) {
									if ("".equals(text)) {
										text = ButtonData.space;
									} else {
										text = text.substring(0, text.length() - 1);
									}
									if (error(text.substring(text.length() - 1, text.length()))) {
										opStack.pop();
									}
									if (!"".equals(newString)) {
										newString = newString.substring(0, newString.length() - 1);//截取输入的自后一个字符
									}
								}
								break;
							case ButtonData.add:
								if (!("".equals(text))) {
									if (error(text.substring(text.length() - 1, text.length()))) {
										opStack.pop();
										opStack.push(ButtonData.add);//将运算符添加到栈中
										text = text.substring(0, text.length() - 1);//动态显示运算
										text += btnText;//动态显示运算

									} else {
										if (".".equals(text.substring(text.length() - 1, text.length()))) {
											text += "0";
										}
										if (!"".equals(newString)) {
											numberStack.push(Double.parseDouble(newString));//将最新的数字添加到栈中
										}
										opStack.push(ButtonData.add);//将运算符添加到栈中
										newString = "";//将最新数字置为空
										text += btnText;//动态显示运算
									}

								} else {
									numberStack.push(0.0);
									opStack.push(ButtonData.add);
									text += "0" + btnText;//动态显示运算
								}
								break;
							case ButtonData.sub:
								if (!("".equals(text))) {
									if (error(text.substring(text.length() - 1, text.length()))) {
										opStack.pop();
										opStack.push(ButtonData.sub);//将运算符添加到栈中
										text = text.substring(0, text.length() - 1);//动态显示运算
										text += btnText;//动态显示运算

									} else {
										if (".".equals(text.substring(text.length() - 1, text.length()))) {
											text += "0";
										}
										if (!"".equals(newString)) {
											numberStack.push(Double.parseDouble(newString));//将最新的数字添加到栈中
										}
										opStack.push(ButtonData.sub);
										newString = "";
										text += btnText;
									}
								} else {
									numberStack.push(0.0);
									opStack.push(ButtonData.sub);
									text += "0" + btnText;//动态显示运算
								}
								break;
							case ButtonData.mul:
								if (!("".equals(text))) {
									if (error(text.substring(text.length() - 1, text.length()))) {
										opStack.pop();
										opStack.push(ButtonData.mul);//将运算符添加到栈中
										text = text.substring(0, text.length() - 1);//动态显示运算
										text += btnText;//动态显示运算

									} else {
										if (".".equals(text.substring(text.length() - 1, text.length()))) {
											text += "0";
										}
										if (!"".equals(newString)) {
											numberStack.push(Double.parseDouble(newString));//将最新的数字添加到栈中
										}
										opStack.push(ButtonData.mul);
										newString = "";
										text += btnText;
									}
								} else {
									numberStack.push(0.0);
									opStack.push(ButtonData.mul);
									text += "0" + btnText;//动态显示运算
								}
								break;
							case ButtonData.div:
								if (!("".equals(text))) {
									if (error(text.substring(text.length() - 1, text.length()))) {
										opStack.pop();
										opStack.push(ButtonData.div);//将运算符添加到栈中
										text = text.substring(0, text.length() - 1);//动态显示运算
										text += btnText;//动态显示运算

									} else {
										if (".".equals(text.substring(text.length() - 1, text.length()))) {
											text += "0";
										}
										if (!"".equals(newString)) {
											numberStack.push(Double.parseDouble(newString));//将最新的数字添加到栈中
										}
										opStack.push(ButtonData.div);
										newString = "";
										text += btnText;
									}
								} else {
									numberStack.push(0.0);
									opStack.push(ButtonData.div);
									text += "0" + btnText;//动态显示运算
								}
								break;
							case ButtonData.eq:
								if ("".equals(text)) {
									text = ButtonData.space;//显示为空时，点击等号
								} else {
									String substring = text.substring(text.length() - 1, text.length());
									if (pattern.matcher(substring).matches() || ButtonData.point.equals(substring)) {//使用正则表达式计算最后一个是不是数字
										if (ButtonData.point.equals(substring)) {
											text = text.substring(0, text.length() - 1);
										}
									} else if (error(substring)) {
										text = text.substring(0, text.length() - 1);
										opStack.pop();
									}
									if (opStack.size() != 0) {//如果有运算符，再去执行运算
										if (!"".equals(newString)) {
											numberStack.push(Double.parseDouble(newString));//这是将最后一次的数字加入到数据栈中
											newString = "";
										}
										//去执行最后结果的计算
										double v = calculateResult();
										if (v == Double.MAX_VALUE) {
											text = "除数不能为0";
											lock = true;
										} else {
											text = v + "";
										}
									}
								}
								delete = false;
								break;
							case ButtonData.point:
								if (containPoint(newString) < 1) {//一个数字中只能有一个小数点
									if ("".equals(text) || "".equals(newString)) {
										text += ButtonData.space + btnText;
										newString += ButtonData.space + btnText;
									} else {
										text += btnText;
										newString += btnText;
									}
								}
								break;
							default:
								text += btnText;
								newString += btnText;
								delete = true;
								break;
						}
						resultText.setText(text);
					}

				}
			});
		}

	}

	//计算整个运算的结果
	private static double calculateResult() {
		double result = 0.0;
		while (!opStack.empty()) {
			String popTop = opStack.pop();
			if (ButtonData.mul.equals(popTop) || ButtonData.div.equals(popTop)) {//判断最末尾的运算的优先级
				if (ButtonData.div.equals(popTop) && numberStack.peek() == 0.0) {//除数不能为0
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
					if (ButtonData.mul.equals(popTwo) || ButtonData.div.equals(popTwo)) {
						Double pop1 = numberStack.pop();//取出栈顶元素
						if (ButtonData.div.equals(popTwo) && numberStack.peek() == 0.0) {//除数不能为0
							result = Double.MAX_VALUE;
							return result;
						} else {
							result = getResult(numberStack.pop(), numberStack.pop(), popTwo);//对优先级高的先运算
							opStack.push(popTop);//优先级低的运算的运算符放回栈
							numberStack.push(result);//优先级高的运算的结果放回栈
							numberStack.push(pop1);//为参与运算的栈顶元素放回栈
						}
					} else {
						if (ButtonData.sub.equals(popTwo)) {
							if (ButtonData.sub.equals(popTop)) {
								result = getResult(numberStack.pop(), numberStack.pop(), ButtonData.add);//这里是表明剩下的全是优先级低的运算
								numberStack.push(result);
							} else {
								result = getResult(numberStack.pop(), numberStack.pop(), ButtonData.sub);//这里是表明剩下的全是优先级低的运算
								numberStack.push(result);
							}
							opStack.push(popTwo);//取出的运算符，未使用就放回
						} else {
							result = getResult(numberStack.pop(), numberStack.pop(), popTop);//这里是表明剩下的全是优先级低的运算
							numberStack.push(result);
							opStack.push(popTwo);//取出的运算符，未使用就放回
						}
					}
				}
			}
		}
		return result;
	}

	//处理按钮异常的方法
	private static boolean error(String s) {
		return Arrays.asList(ButtonData.add, ButtonData.sub, ButtonData.mul, ButtonData.div).contains(s);
	}

	//加减乘除的算法
	private static double getResult(double x, double y, String op) {
		double result = 0.0;
		switch (op) {
			case ButtonData.add:
				result = y + x;
				break;
			case ButtonData.sub:
				result = y - x;
				break;
			case ButtonData.mul:
				result = y * x;
				break;
			case ButtonData.div:
				result = y / x;
				break;
			default:
				break;
		}
		return result;
	}

	//用来统计点击过多少个小数点，避免重复点击
	private static int containPoint(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			String c = String.valueOf(s.charAt(i));
			if (ButtonData.point.equals(c)) {
				count++;
			}
		}
		return count;
	}
}
