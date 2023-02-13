package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 영화예매내가해보기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setTitle("식당예매시스템");
		f.setSize(1000, 850);
		f.getContentPane().setBackground(Color.darkGray);
		
		Font font = new Font("궁서",1,20);
		JLabel result = new JLabel("======================================애슐리=======================================");
		
		result.setForeground(Color.yellow);
		f.add(result);
		result.setFont(font);
	
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		
		JButton[] b = new JButton[101];
		
		JLabel result1 = new JLabel("결과 보이는 곳");
		result1.setForeground(Color.yellow);
		result1.setFont(font);
		

		int[] seat = new int[b.length];
				
		for (int i = 0; i < seat.length; i++) {
			b[i] = new JButton(i+"");
			b[i].setFont(font);
			f.add(b[i]);
			
				b[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					String text = e.getActionCommand();
					System.out.println(text);
					int no = Integer.parseInt(text);
					
					if(seat[no] == 1) { 
						result1.setText("예약불가");
						result1.setForeground(Color.blue);
					}else { 
						seat[no] = 1; 
						result1.setText(text + "번 예약완료.");
						b[no].setText("예약");
						b[no].setBackground(Color.red);
					}
				
				}
			});
		}
		JButton result3 = new JButton("예약 선금");
		result3.setForeground(Color.orange);
		result3.setFont(font);

		f.add(result3);
		
		result3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int count = 0;
				
				for (int x : seat) {
					if (x == 1) {
						count++;
					}
				}
				JOptionPane.showMessageDialog(f, (count * 10000)+"원 결제하시면 됩니다.");
			}
		});
		
		
		f.add(result1);

		
		f.setVisible(true);
		
		
	}

}
