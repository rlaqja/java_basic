package 조건문;

import javax.swing.JOptionPane;

public class IF문7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pwd = JOptionPane.showInputDialog(args);
			
		if (pwd.equals("pass")) {
			System.out.println("들어오세요");
		} else {
			System.out.println("나가세요");
		}
		String food1= JOptionPane.showInputDialog("당신이 먹고 싶은 저녁 메뉴는?(자장면,라면,회)에서 선택");
		
		String food11 ="자장면";
		String food22 ="라면";
		String food33 ="회";
		
		if (food11.equals(food1) ) {
			System.out.println("중국집으로 가요");
		} else if (food1.equals(food22)) {
			System.out.println("분식집으로가요");
		}else if (food1.equals(food33)) {
			System.out.println("횟집으로 가요");
		}else {
			System.out.println("그냥 안먹어요");
		}
		String n1= JOptionPane.showInputDialog("정수 1입력");
		String n2= JOptionPane.showInputDialog("정수 2입력");
		
		int n11=Integer.parseInt(n1);
		int n22 =Integer.parseInt(n2);
		
		if (n11 > n22) {
			System.out.println("입력값이 더 큼");
		} else if(n11 < n22){
			System.out.println("두번째 입력값이 더 큼");
		}else {
			System.out.println("두 수가 동일");
		}
				
		String no = "A100EX";
		char ch = no.charAt(0);
		switch (ch) {
		case 'A':
			System.out.println("기획부");
			break;
		case 'B':
			System.out.println("총무부");
			break;
		case 'C':
			System.out.println("개발부");
			break;

		default:
			System.out.println("없음");
			break;
		}
	}
}