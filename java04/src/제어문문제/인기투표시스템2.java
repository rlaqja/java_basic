package 제어문문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 인기투표시스템2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(700, 900);
		f.getContentPane().setBackground(Color.orange);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font1 = new Font("궁서", 1, 20);

		Font font2 = new Font("궁서", 1, 30);

		JLabel be = new JLabel();
		be.setText("인기투표 시스템을 시작합니다.");
		be.setFont(font2);

		JLabel be1 = new JLabel();
		be1.setText("다나카");
		be1.setFont(font1);

		JLabel be2 = new JLabel();
		be2.setText("문상훈");
		be2.setFont(font1);

		JLabel be3 = new JLabel();
		be3.setText("조나단");
		be3.setFont(font1);

		JLabel be5 = new JLabel();
		JLabel be6 = new JLabel();
		JLabel be7 = new JLabel();
		be5.setFont(font2);
		be6.setFont(font2);
		be7.setFont(font2);
		be5.setForeground(Color.black);
		be6.setForeground(Color.black);
		be7.setForeground(Color.black);

		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();

		ImageIcon icon1 = new ImageIcon("2.jpg");
		ImageIcon icon2 = new ImageIcon("a.jpg");
		ImageIcon icon3 = new ImageIcon("b.jpg");
		b1.setIcon(icon1);
		b2.setIcon(icon2);
		b3.setIcon(icon3);
		
		f.add(be);

		f.add(b1);
		f.add(be1);
		f.add(be5);

		f.add(b2);
		f.add(be2);
		f.add(be6);

		f.add(b3);
		f.add(be3);
		f.add(be7);

		b1.addActionListener(new ActionListener() {
			int be1 = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				be1++;
				be5.setText(be1 + "표");
			}

		});
		b2.addActionListener(new ActionListener() {
			int be2 = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				be2++;
				be6.setText(be2 + "표");
			}

		});
		b3.addActionListener(new ActionListener() {
			int be3 = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				be3++;
				be7.setText(be3 + "표");
			}

		});

		f.setVisible(true);
	}

}
