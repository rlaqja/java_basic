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

public class 극장예매시스템2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("극장예매시스템");
		JLabel result1 = new JLabel("=============스크린============= ");
		result1.setForeground(Color.yellow);
		f.add(result1);
		
		f.setSize(1100, 950);
		f.getContentPane().setBackground(Color.gray);
		// 배치해주는 부품-FlowLayout
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);// 추가한 순서대로 f에 붙는다.

		// 버튼 배열 많이 만들어서 집어 넣을 배열 생성
		JButton[] btn = new JButton[100];
		// 반복해서 배열에 버튼 만들어 넣어주세요.
		// 반복해서 f에 add해주세요.
		Font font = new Font("궁서", Font.BOLD, 50);
		result1.setFont(font);
		JLabel result = new JLabel("결과 보이는 곳");
		result.setForeground(Color.yellow);
		result.setFont(font);

		// 예약 여부를 저장하는 배열을 만들어줍시다.!!
		int[] seat = new int[100]; // {1,0,0,0,0,0,0,0,0,0}
		// 각 자리게 저장된 값이 0이면 아직 예약안되었음. 예약되면 1로 바꿈!

		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i + "");
			btn[i].setFont(font);
			f.add(btn[i]);

			// 버튼에 액션기능 add해보자.
			// 1) 액션 기능 추가
			// 2) 클릭했을 때 어떤 부품이 담당할지 부품 생성
			// 3) 클릭했을 때 어떻게 처리할지 코딩해주면 됨.
			btn[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// 클릭했을 때 어떻게 처리할지 코딩해주면 됨.
					// e.getActionCommand(); 클릭한 버튼의 글자를 가지고 와줌.
					String text = e.getActionCommand(); // "0"
					System.out.println(text);
					int no = Integer.parseInt(text); // "0" --> 0
					// 이미 해당 좌석번호가 1로 저장되어있는지 확인하고, 1이 아니면 예약가능!!
					if(seat[no] == 1) { //이미 예약되어 1이 들어있음. 예약불가
						result.setText("예약불가");
						result.setForeground(Color.blue);
					}else { //아직 예약이 안되어서 0이 들어있음. 예약가능
						seat[no] = 1; // 예약좌석은 1로 변경!
						result.setText(text + "번 예약완료.");
						btn[no].setText("예약");
						btn[no].setBackground(Color.red);
					}
				}
			});
		}
		JButton total =new JButton("전체 예약 내역");
		total.setBackground(Color.blue);
		total.setForeground(Color.cyan);
		total.setFont(font);
		
		f.add(total);
		
		total.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int all = 0;
				
				for (int x : seat) {
					if (x == 1) {
						all++;
						
					}
				}
				
				JOptionPane.showMessageDialog(f, (all * 10000)+"원 결제하시면 됩니다.");
			
			}
		});
		
		
		f.add(result);

		// 맨 끝에 있어야 함.
		f.setVisible(true);

	}

}

