package 상속;

public class 사람1 extends Object{

		String name;
		int age;
		
		public void eat() {
			System.out.println("고기를 많이 먹는다");
		}
		
		public void sleep() {
			System.out.println("잠을 많이 잔다~ 부럽네");
		}

		@Override
		public String toString() {
			return "사람1 [name=" + name + ", age=" + age + "]";
		}
		
		

}
