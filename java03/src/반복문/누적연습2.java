package 반복문;

import javax.swing.JOptionPane;

public class 누적연습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		for (int i = 5; i <= 300; i++) {
			if (i % 5 != 0) {
				sum = sum + i;
			}
		}
		System.out.println("다 더한값은"+ sum);
		
		String sum2="";
		for (int i = 0; i < 4; i++) {
			String data = JOptionPane.showInputDialog("뭐 먹고싶은 음식 입력");
			sum2 = sum2 + data + "랑";
		}
		System.out.println("먹고싶은 음식종류>>"+sum2);
	}

}
