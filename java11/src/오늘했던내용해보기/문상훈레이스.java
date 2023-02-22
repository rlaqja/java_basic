package 오늘했던내용해보기;

import java.awt.Color;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 문상훈레이스 extends JFrame{

	public static void main(String[] args) {
		문상훈레이스 f = new 문상훈레이스();
		}
		
	
	public 문상훈레이스() {
		setTitle("문상훈레이스");
		setSize(1500, 1500);
		getContentPane().setBackground(Color.DARK_GRAY);
		
		나의문상훈 mon = new 나의문상훈("버거.jpg",100,0);
		나의문상훈 mon1 = new 나의문상훈("자장면.jpg",100,200);
		나의문상훈 mon2= new 나의문상훈("짬뽕.jpg",100,400);
		나의문상훈 mon3= new 나의문상훈("문상훈3.jpg",-300,200);


		mon.start();
		mon1.start();
		mon2.start();
		mon3.start();

		
		setVisible(true);
		
	}
	public class 나의문상훈 extends Thread{
		
		int x , y;
		JLabel label;
		
		public  나의문상훈(String file,int x,int y) {
			this.x = x;
			this.y = y;
			ImageIcon icon = new ImageIcon(file);
			label = new JLabel();
			label.setIcon(icon);
			label.setBounds(x, y, 500, 500);
			add(label);
		}
		
		
		
		public void run() {
			Random r= new Random();
			for (int i = 0; i < 200; i++) {
				int move = r.nextInt(50);
				x = x + move;
				label.setBounds(x, y, 500, 500);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	}
}
