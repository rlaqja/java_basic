package 생성자;

public class 우리집 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		딸 d1 = new 딸("홍길순", "여");
		System.out.println(d1);
		System.out.println(딸.count+"명");
		System.out.println(딸.아빠지갑 = 딸.아빠지갑 - 1000);
		d1.티비보다1();
		딸 d2 = new 딸("홍길진", "여");
		System.out.println(d2);
		System.out.println(딸.count+"명");
		System.out.println(딸.아빠지갑 = 딸.아빠지갑 - 1000);
		
		
		System.out.println(딸.아빠지갑+"현재 남아있는 아빠 돈");
		d2.티비보다();
	}

}
