package 반복문;

import javax.swing.JOptionPane;

public class 반목문확인문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int full = 0; //배부른 사람 카운트
		int noFull = 0; //안배부른 사람 카운트
		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("배부른가요? 1)배부름 2)안배부름");
			if (data.equals("1")) {
				//full = full + 1; // 0 + 1
				full++;
			}else if (data.equals("2")) {
				noFull++;
			} //else
		} //for221
		
		System.out.println("배부른 사람 몇명? " + full + "명");
		System.out.println("안배부른 사람 몇명? " + noFull + "명");
	}
}
