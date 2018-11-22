import com.sun.org.apache.xpath.internal.SourceTree;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Administrator
 */
public class test {


	public static void main(String[] args) {
		JFrame jf = new JFrame("测试窗口");
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		// 创建内容面板容器
		JPanel panel = new JPanel();
		// 创建分组布局，并关联容器
		GroupLayout layout = new GroupLayout(panel);
		// 设置容器的布局
		panel.setLayout(layout);

		// 创建组件
		JButton btn01 = new JButton("Button01");
		JButton btn02 = new JButton("Button02");
		JButton btn03 = new JButton("Button03");
		JButton btn04 = new JButton("Button04");
		JButton btn05 = new JButton("Button05");
		JButton btn06 = new JButton("Button06");
		JButton btn07 = new JButton("Button07");

		btn01.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton jButton = (JButton)e.getSource();
				System.out.println(jButton.getText());
			}
		});
		// 自动创建组件之间的间隙
		layout.setAutoCreateGaps(true);
		// 自动创建容器与触到容器边框的组件之间的间隙
		layout.setAutoCreateContainerGaps(true);

		layout.setHorizontalGroup(layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup()
						.addComponent(btn01, 0,100,Short.MAX_VALUE)
						.addGroup(layout.createSequentialGroup()
								.addComponent(btn02, 0,100,Short.MAX_VALUE)
								.addComponent(btn03, 0,100,Short.MAX_VALUE))
						.addGroup(layout.createSequentialGroup()
								.addComponent(btn05, 0,100,Short.MAX_VALUE)
								.addComponent(btn06, 0,100,Short.MAX_VALUE)))
				.addGroup(layout.createParallelGroup()
						.addComponent(btn04, 0,100,Short.MAX_VALUE)
						.addComponent(btn07, 0,100,Short.MAX_VALUE)));

		layout.setVerticalGroup(layout.createSequentialGroup()
				.addComponent(btn01, 0,30,Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup()
						.addComponent(btn02, 0,30,Short.MAX_VALUE)
						.addComponent(btn03, 0,30,Short.MAX_VALUE))
				.addGroup(layout.createParallelGroup()
						.addComponent(btn05, 0,30,Short.MAX_VALUE)
						.addComponent(btn06, 0,30,Short.MAX_VALUE)
						.addComponent(btn04, 0,30,Short.MAX_VALUE))
				.addComponent(btn07, 0,30,Short.MAX_VALUE));

//		layout.setHorizontalGroup(layout.createSequentialGroup()
//
//				.addGroup(layout.createParallelGroup()
//						.addComponent(btn01)
//						.addComponent(btn03)
//				)
//				.addGap(10, 10, 10)
//				.addComponent(btn02)
//
//
//		);
//
//		layout.setVerticalGroup(layout.createSequentialGroup()
//				.addComponent(btn01)
//				.addComponent(btn02)
//				.addGap(10, 10, 10)
//				.addComponent(btn03)
//
//		);


		jf.setContentPane(panel);
		jf.pack();
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
	}

}
