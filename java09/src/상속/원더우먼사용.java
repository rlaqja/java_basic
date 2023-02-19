package 상속;

public class 원더우먼사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		사람1 p = new 사람1();
		p.eat();
		p.sleep();
		
		
		우먼 w = new 우먼();
		w.run();
		w.fast();
		
		
		원더우먼 ww = new 원더우먼();
		ww.name = "다이애나";
		ww.age = 25000;
		ww.power = 40000;
		ww.fly = false;
		ww.fast = "소닉만큼 날렵하다";
		ww.eat();
		ww.sleep();
		ww.run();
		ww.space();
		
		System.out.println("이름은"+ww.name);
		System.out.println("나이는"+ww.age);
		System.out.println("파워는"+ww.power);
		System.out.println("날 수 있는가"+ww.fly);
		System.out.println("얼마나 날렵한가"+ww.fast);
		
		
		
	}

}
