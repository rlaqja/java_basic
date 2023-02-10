package 복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품조립하기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400, 300);

		f.getContentPane().setBackground(Color.green);
		JLabel l = new JLabel();
		l.setText("당신이 생각한 숫자를 입력하세요");
		JTextField text = new JTextField(10);

		JButton b = new JButton();
		FlowLayout flow = new FlowLayout();
		Font font = new Font("궁서", 1, 20);
		Font font2 = new Font("궁서", 1, 30);

		f.setLayout(flow);

		text.setBackground(Color.cyan);
		text.setForeground(Color.blue);
		text.setFont(font2);

		f.add(l);
		f.add(text);
		f.add(b);

		l.setFont(font);
		l.setForeground(Color.red);

		b.setBackground(Color.red);
		b.setForeground(Color.white);
		b.setFont(font2);
		b.setText("Number Game");

		f.setVisible(true);

	}

}