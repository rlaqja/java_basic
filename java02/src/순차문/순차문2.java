package 순차문;

import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {

		// 기본순차문 ==> 입력 => 처리=> 출력
		//입력 => 부품사용,망치같은 언제나 바로 사용할 수 있는 것
		String data1= JOptionPane.showInputDialog("당신의 키는?-1");
		String data2= JOptionPane.showInputDialog("당신의 몸무게는?-2");
		
		int data11 =Integer.parseInt(data1);
		int data22 =Integer.parseInt(data2);

		
		double data33= Double.parseDouble(data1);
		double data44= Double.parseDouble(data2);
		
		double result2 = (data11 - data22)* 0.9;
		//처리 ->글자연결
		//출력 =>모니터 화면에 보이고 싶음.

		System.out.println(result2);

	}

}
