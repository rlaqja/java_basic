package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 계산기부품만들기 {

	public static void main(String[] args) {
		// JFrame, ImageIcon, JLabel 3개
		JFrame f =new JFrame();
		
		f.setSize(300, 500);
		ImageIcon icon = new ImageIcon("013.jpg");
		
		
		
		JLabel label1 = new JLabel();
		label1.setIcon(icon);
		JLabel lable2 = new JLabel();
		lable2.setText("숫자1");
		JLabel lable3 = new JLabel();
		lable3.setText("숫자2");
		
		
		// JTextField 2개
		JTextField text1 = new JTextField(10);
		JTextField text2 = new JTextField(10);
		
		// Font, FlowLayout
		Font font= new Font("굴림",1,30);
		FlowLayout layout = new FlowLayout();
		
		f.setLayout(layout);
		// JButton
		
		JButton b = new JButton();
		b.setText("+");
		JButton b1 = new JButton();
		b1.setText("-");
		JButton b2 = new JButton();
		b2.setText("*");
		JButton b3 = new JButton();
		b3.setText("/");
		JButton b4 = new JButton();
		b4.setText("%");
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String s1 = text1.getText();
				String s2 = text2.getText();
				
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				int result = n1+n2;
				JOptionPane.showMessageDialog(f,result);
				}
		});
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String s1 = text1.getText();
				String s2 = text2.getText();
				
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				int result = n1 - n2;
				JOptionPane.showMessageDialog(f, result);
			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String s1 = text1.getText();
				String s2 = text2.getText();

				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				int result = n1 * n2;
				JOptionPane.showMessageDialog(f, result);
			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String s1 = text1.getText();
				String s2 = text2.getText();

				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				int result = n1 / n2;
				JOptionPane.showMessageDialog(f, result);
				JOptionPane.showMessageDialog(f, String.format("%.3f", result));
			}
		});
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String s1 = text1.getText();
				String s2 = text2.getText();
				
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				double result = n1 %(double) n2;
				JOptionPane.showMessageDialog(f,result);
				}
		});
		
		
//		=======================================
		lable2.setFont(font);
		lable3.setFont(font);
		text1.setFont(font);
		text2.setFont(font);
		b.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
//		===========================
		f.add(label1);
		f.add(lable2);
		f.add(text1);
		f.add(lable3);
		f.add(text2);
		f.add(b);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
//		=====================================
		lable2.setForeground(Color.blue);	
		lable3.setBackground(Color.black);	
		text1.setForeground(Color.blue);	
		text2.setForeground(Color.blue);	
		lable2.setForeground(Color.blue);	
		lable2.setForeground(Color.blue);	
		b.setForeground(Color.blue);		
		b1.setBackground(Color.black);		
		b1.setForeground(Color.yellow);		
		b2.setForeground(Color.blue);		
		b3.setBackground(Color.black);	
		b3.setForeground(Color.yellow);	
		b4.setForeground(Color.blue);		
//		=====================================
		f.setVisible(true);
	}

}
