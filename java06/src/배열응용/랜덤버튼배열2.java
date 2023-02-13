package 배열응용;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열2 {

	public static void main(String[] args) {

		JFrame f= new JFrame();
		f.setSize(800, 500);
		f.setLayout(null);
		
		JButton[] b = new JButton[500];
		Random r = new Random();
		Color[] colors = {Color.red, Color.blue, Color.white, 
				Color.gray, Color.green, Color.orange};
		for (int  i= 0;  i < b.length; i++) {
			b[i] = new JButton(i + "번 버튼");
			int x = r.nextInt(800);
			int y = r.nextInt(800);
			
			b[i].setBounds(x, y, 100, 50);
			b[i].setBackground(colors[r.nextInt(colors.length)]);
			f.add(b[i]);
		}
		
		f.getContentPane().setBackground(Color.yellow);
		f.setVisible(true);
	}

}