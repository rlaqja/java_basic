package 배열응용;

import javax.swing.JOptionPane;

public class 입력받아평균 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] jumsu = new int[5];
		
		for (int i = 0; i < jumsu.length; i++) {
			String data = JOptionPane.showInputDialog("숫자입력");
			jumsu[i] = Integer.parseInt(data);
		}
		for (int x : jumsu) {
			System.out.print(x + " ");
		}
		
		int count = 0;
		int sum = 0;
		
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300) {
				count++;
				sum = sum +jumsu[i];
				System.out.println("300이상 위치값"+ i);
			}	
		}
		System.out.println(" ");
		System.out.println("총 합"+ sum);
		System.out.println("300이상 총 합 평균"+ sum / 5);
		System.out.println("300이상 총 갯수"+ count);
	}

}

