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

public class 나의영화앨범 {
	 
	static int index =2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] title = { "더 퍼스트 슬램덩크", "타이타닉", "아바타: 물의 길", "교섭", "바빌론" };
		String[] img = { "001.png", "002.png", "003.png", "004.png", "005.png" };
		double[] jumsu = { 9.28, 9.72, 8.82, 6.62, 8.85 };
		
		JFrame f = new JFrame();
		f.setSize(516, 530);
		f.getContentPane().setBackground(Color.green);
		
		
		Font font = new Font("궁서",Font.BOLD,40);
		Font font2 = new Font("궁서",Font.BOLD,30);
		
		
		JLabel top = new JLabel(title[2]);
		top.setHorizontalAlignment(0);
		top.setForeground(Color.red);
		top.setFont(font);
		f.add(top,BorderLayout.NORTH);
		
		
		
		JLabel center = new JLabel("");
		center.setHorizontalAlignment(0);
		center.setFont(font);
		
		
		ImageIcon icon = new ImageIcon(img[2]);
		f.add(center,BorderLayout.CENTER);
		center.setIcon(icon);
		
		
		JLabel under = new JLabel(String.valueOf(jumsu[2]));
		under.setHorizontalAlignment(0);
		under.setForeground(Color.blue);
		under.setFont(font);
		f.add(under,BorderLayout.SOUTH);
		
		
		JButton left= new JButton("<<<");
		left.setFont(font2);
		left.setBackground(Color.gray);
		f.add(left,BorderLayout.WEST);
		left.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if ( index > 0) {
					top.setText(title[index - 1]);
					ImageIcon icon = new ImageIcon(img[index - 1]);
					center.setIcon(icon);
					under.setText(jumsu[index -1] + "");
					index--;
				} else {
					JOptionPane.showMessageDialog(f,"여기가 왼쪽 끝 입니다.");
				}
		
				
				}
		});

		JButton right= new JButton(">>>");
		right.setFont(font2);
		right.setBackground(Color.gray);
		f.add(right,BorderLayout.EAST);
		
		right.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if ( index < 4) {
					top.setText(title[index + 1]);
					ImageIcon icon = new ImageIcon(img[index + 1]);
					center.setIcon(icon);
					under.setText(jumsu[index +1] + "");
					index++;
				} else {
					JOptionPane.showMessageDialog(f,"여기가 오른쪽 끝 입니다.");
					
				}
		
				
				}
		});

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		f.setVisible(true);
		
	}

}
