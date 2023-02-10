package 반복문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class for3 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JOptionPane n = new JOptionPane();
		
		JFrame f = new JFrame();
		f.setSize(330, 350);
		f.getContentPane().setBackground(Color.green);
		
		FlowLayout flow= new FlowLayout();
		f.setLayout(flow);
		
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		JButton b4 = new JButton();
		
		b1.setText("별10개");
		b2.setText("커피*5");
		b3.setText("커피*우유3개");
		b4.setText("1:짱");
		
		Font font = new Font("궁서",1,45);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				for (int i = 0; i < 10; i++) {
					System.out.print("*");
				}
				System.out.print("");
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				for (int i = 0; i < 5; i++) {
					System.out.print("커피*");
				}
				System.out.println("");
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				for (int i = 0; i < 3; i++) {
					System.out.print("커피*우유");
				}
			}
		});
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				for (int i = 0; i < 3; i++) {
					System.out.println((i+1)+":짱");
				}
			}
		});
		
		
		f.setVisible(true);
		}
		
	
}
