package 상속;

public class 커피트럭사용 {

	public static void main(String[] args) {
		CoffeeTruck co = new CoffeeTruck();
		co.color = "브라운";
		co.price = 2500;
		co.weight = 1;
	
		co.move();
		co.sell();
		
		System.out.println(co.color+":색깔");
		System.out.println(co.price+"원");
		System.out.println(co.weight+"개");
	}

}