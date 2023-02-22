package 오늘했던내용해보기;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class 나의문상훈 extends Thread{
	
	int x , y;
	JLabel label;
	
	public  나의문상훈(String file,int x,int y) {
		this.x = x;
		this.y = y;
		ImageIcon icon = new ImageIcon(file);
		label.setIcon(icon);
		label = new JLabel();
		label.setBounds(x, y, 300, 300);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	@Override
	public void run() {
		Random r= new Random();
		for (int i = 0; i < 200; i++) {
			int move = r.nextInt(50);
			x = x + move;
			label.setBounds(x, y, 300, 300);
		}
	}
}
