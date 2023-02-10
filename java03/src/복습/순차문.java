package 복습;

import javax.swing.JOptionPane;

public class 순차문 {

	public static void main(String[] args) {
		// 입력-> 처리 -> 출력
		//두개의 숫자를 입력을 받아서 처리해서 출력
		//프로그래밍은 손으로 치는 값은 모두다 스트링으로 취급(문자열)
		//입력
		String n1 =JOptionPane.showInputDialog("숫자1입력");
		String n2 =JOptionPane.showInputDialog("숫자2입력");
		
//		출력
		//정수로 바꿔주는 부품을 써라 
		int n11 =Integer.parseInt(n1);
		int n22 =Integer.parseInt(n2);
		
		
		
		System.out.printf("%.3f",(double)n11 / n22);
	}

}
