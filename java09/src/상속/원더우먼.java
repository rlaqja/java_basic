package 상속;

public class 원더우먼 extends 우먼{
	boolean fly;
	
	public void space() {
		System.out.println("우주에 못 있어");
	}
	@Override
	public void eat() {
		System.out.println("많이 먹는다");
	}
	
	@Override
	public void sleep() {
		System.out.println("많이 잔다");
	}
	
	
	
}
