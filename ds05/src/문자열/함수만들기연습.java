package 문자열;

public class 함수만들기연습 {

	public static void 빨래하다() {
		System.out.println("빨리1)세제넣다");
		System.out.println("빨리2)물을 채우다.");
		System.out.println("빨리3)세탁기 뚜겅 닫기");
	}
	public static void 헹구다() {
		System.out.println("헹굼1)물을 가득 넣다.");
		System.out.println("헹굼2)강하게 돌리다.");
	}
	public static void 탈수하다() {
		System.out.println("탈수1)강하게 회전하게 하다.");
		System.out.println("탈수2)발란스를 맞추다.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.빨래를 모아서");
		System.out.println("2.세탁기에 넣고");
		빨래하다();
		헹구다();
		탈수하다();
		빨래하다();
		헹구다();
		탈수하다();
		System.out.println("9.빨래를 널다");
		
		
		
	}

}
