package 상속;

public class 수퍼맨 extends 맨{
	Boolean fly;
	
	public void space() {
		System.out.println("이름은"+ fly);
		System.out.println("우주를 날다.");
	}
	
	@Override
	public void eat() {
		System.out.println("많이 먹다~~");
	}
	
	
	
	@Override
	public String toString() {
		return "수퍼맨 [fly=" + fly + ", power=" + power + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
