package 생성자;

public class 딸 {
	String name;
	String gender;
	static int count;
	static int 아빠지갑 = 10000;
	
	
	public 딸(String name, String gender) {

		this.name = name;
		this.gender = gender;
		count++;
	}

	@Override
	public String toString() {
		return "딸 [name=" + name + ", gender=" + gender + "]";
	}
	
	public void 티비보다() {
		System.out.println("뉴진스 를 챙겨본다!");
	}
	public void 티비보다1() {
		System.out.println("10시드라마를 챙겨본다!");
	}

	
	
}
