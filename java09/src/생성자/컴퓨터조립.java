package 생성자;

public class 컴퓨터조립 {

	public static void main(String[] args) {
		컴퓨터 com1 = new 컴퓨터(100000, "apple", "32");
		컴퓨터 com2 = new 컴퓨터(500000, "samsung", "36");
		
		
		System.out.println(com1);
		System.out.println(com2);
		
		

	}

}
