package 조건문;

public class IF문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myNum = 99;
		
		if (myNum >=80) {
			System.out.println("최우수");
		} else if (myNum >=70) {
			System.out.println("우수");
		}else if(myNum >=60){
			System.out.println("보통");
		}else {
			System.out.println("미달");
		}
		
		int mytour = 10;

		if (mytour >= 10) {
			System.out.println("VVIP");
		} else if (mytour >= 6) {
			System.out.println("VIP");
		} else {
			System.out.println("Normal");
		}
		{

		}
	}
}