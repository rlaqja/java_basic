package 생성자;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 카운터 {
	static int count;
	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(550,500);
		f.getContentPane().setBackground(Color.orange);
		
		Font font = new Font("궁서",Font.BOLD,30);
		Font font1 = new Font("궁서",Font.BOLD,100);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		
		JLabel number = new JLabel("0");
		number.setFont(font1);
		number.setForeground(Color.red);
		

		JButton b1 = new JButton("1 더하기");
		b1.setFont(font);
		b1.setBackground(Color.green);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count++;
				number.setText(count + " ");
			}
		});
		
		
		
		JButton b2 = new JButton("0으로 초기화");
		b2.setFont(font);
		b2.setBackground(Color.blue);
		b2.setForeground(Color.white);
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count = 0;
				number.setText("0");
			}
		});
		
		JButton b3 = new JButton("1 빼기");
		b3.setFont(font);
		b3.setBackground(Color.green);
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count--;
				System.out.println(count + " ");
				number.setText(count + " ");
			}
		});
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(number);
		
		
		
		
		
		
		
		
		
		
		f.setVisible(true);
	}

}
