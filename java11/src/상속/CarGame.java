package 상속;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarGame extends JFrame {

	public static void main(String[] args) {
		CarGame	f = new CarGame();
	}

	public CarGame() {
			setTitle("나의 자동차 경주게임");
			setSize(1200, 600);
			
			MYThread car1 = new MYThread("car01.png", 100, 0);
			MYThread car2 = new MYThread("car02.png", 100, 150);
			MYThread car3 = new MYThread("car03.png", 100, 300);
			
			car1.start();
			car2.start();
			car3.start();
			
			
			
			setVisible(true);
		}

	public class MYThread extends Thread {

		int x, y;
		JLabel label;

		public MYThread(String file, int x, int y) {
			this.x = x;
//			System.out.println(x);
			this.y = y;
			ImageIcon icon = new ImageIcon(file);
			label = new JLabel();
			label.setIcon(icon);
			label.setBounds(x, y, 300, 300);
			add(label);

		}

		@Override
		public void run() {
			Random r = new Random();
			for (int i = 0; i < 200; i++) {
				int move = r.nextInt(50);
				x = x + move;
				label.setBounds(x, y, 300, 300);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
