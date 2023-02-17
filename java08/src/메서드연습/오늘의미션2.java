package 메서드연습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 오늘의미션2 {

	static int count;
	static int count1;
	static int count2;
	static int count3;
	final static int price1 = 3500;
	final static int price2 = 3000;
	final static int price3 = 4000;
	
	public static void main(String[] args) {
		
		
		
		JFrame f = new JFrame();
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		
		f.setTitle("짬뽕:"+count4+"개"+" 버거:"+count5+"개"+" 자장면:"+count6+"개");
		
		
		
		
		f.setSize(500, 500);
		f.getContentPane().setBackground(Color.green);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton b1 = new JButton("짬뽕");
		JButton b2 = new JButton("버거");
		JButton b3 = new JButton("짜장");
		Font font = new Font("궁서", Font.ITALIC, 30);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b1.setBackground(Color.pink);
		b2.setBackground(Color.yellow);
		b3.setBackground(Color.cyan);
		
		
		JLabel textLabel = new JLabel("개수: ");
		textLabel.setFont(font);
		JLabel countLabel = new JLabel("0개");
		countLabel.setFont(font);
		JLabel imgLabel = new JLabel();
		ImageIcon icon = new ImageIcon("home.png");
		imgLabel.setIcon(icon);
		JLabel result = new JLabel("결제금액 0원");
		result.setFont(font);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("짬뽕.jpg");
				imgLabel.setIcon(icon);
				count1++;
				countLabel.setText(count1 + "개");
				result.setText("결제금액"+(count1 * price1) +"원");
				f.setTitle("짬뽕:"+count1+"개"+" 버거:"+count2+"개"+" 자장면:"+count3+"개");
				int total = (count1 * price1) + (count2 * price2) + (count3 * price3);
				result.setText("결제금액 " + total + "원");
				
				
				
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("버거.jpg");
				imgLabel.setIcon(icon);
				count2++;
				countLabel.setText(count2 + "개");
				result.setText("결제금액"+(count2 * price2) +"원");
				 f.setTitle("짬뽕:"+count1+"개"+" 버거:"+count2+"개"+" 자장면:"+count3+"개");
				 int total = (count1 * price1) + (count2 * price2) + (count3 * price3);
					result.setText("결제금액 " + total + "원");
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("자장면.jpg");
				imgLabel.setIcon(icon);
				count3++;
				countLabel.setText(count3 + "개");
				result.setText("결제금액"+(count3 * price3) +"원");
				f.setTitle("짬뽕:"+count1+"개"+" 버거:"+count2+"개"+" 자장면:"+count3+"개");
				int total = (count1 * price1) + (count2 * price2) + (count3 * price3);
				result.setText("결제금액 " + total + "원");
			}
		});
		
		f.setTitle("짬뽕:"+count1+"개"+" 버거:"+count2+"개"+" 자장면:"+count3+"개");
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(textLabel);
		f.add(countLabel);
		f.add(imgLabel);
		f.add(result);
		
		f.setVisible(true);
	}

}