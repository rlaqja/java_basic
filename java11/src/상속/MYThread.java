package 상속;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MYThread extends Thread{
	
	int x ,y ;
	JLabel label;
	
	public MYThread(String file, int x , int y) {
		this.x= x;
		this.y= y;
		ImageIcon icon = new ImageIcon(file);
		label = new JLabel();
		label.setIcon(icon);
		label.setBounds(x, y, 100, 100);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		Random r= new Random();
		for (int i = 0; i < 200; i++) {
			int move = r.nextInt(50);
			x = x + move;
			label.setBounds(x, y, 100, 100);
		}
	}
}
