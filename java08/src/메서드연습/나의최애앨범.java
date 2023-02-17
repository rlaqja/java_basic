package 메서드연습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 나의최애앨범 {

	static int index = 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] title = { "문상훈", "문상훈1", "문상훈2", "문상훈4" };
		String[] img = { "문상훈1.jpg", "문상훈2.jpg", "문상훈3.jpg", "문엄마.jpg" };

		JFrame f = new JFrame();
		f.setSize(516, 530);
		f.getContentPane().setBackground(Color.gray);

		Font font = new Font("궁서", Font.BOLD, 40);
		Font font1 = new Font("궁서", Font.BOLD, 30);

		JLabel top = new JLabel(title[2]);
		top.setHorizontalAlignment(0);
		top.setForeground(Color.black);
		top.setFont(font);
		f.add(top, BorderLayout.NORTH);

		JLabel center = new JLabel("");
		center.setHorizontalAlignment(0);
		center.setFont(font);

		ImageIcon icon = new ImageIcon(img[2]);
		f.add(center, BorderLayout.CENTER);
		center.setIcon(icon);

		JButton left = new JButton("<<<");
		left.setFont(font1);
		left.setBackground(Color.gray);
		f.add(left, BorderLayout.WEST);

		left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (index > 0) {
					top.setText(title[index - 1]);
					ImageIcon icon = new ImageIcon(img[index - 1]);
					center.setIcon(icon);
					index--;
				} else {
					JOptionPane.showMessageDialog(f, "여기가 왼쪽 끝입니다.");
				}
			}
		});

		JButton right = new JButton(">>");
		right.setFont(font1);
		right.setBackground(Color.gray);
		f.add(right, BorderLayout.EAST);
		right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (index < 3) {
					top.setText(title[index + 1]);
					ImageIcon icon = new ImageIcon(img[index + 1]);
					center.setIcon(icon);
					index++;
				} else {
					JOptionPane.showMessageDialog(f, "여기가 오른쪽 끝입니다.");
				}
			}
		});

		f.setVisible(true);

	}

}
