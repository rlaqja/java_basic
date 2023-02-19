package 상속기본;

public class FlyCar사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Flycar fly = new Flycar();
		
		fly.color = "회색";
		fly.fly = true;
		
		fly.fly();
		fly.run();
		
		System.out.println(fly.color);
		System.out.println(fly.fly);
		
	}

}
