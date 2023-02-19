package 생성자;


public class 티비사용하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		티비 tv1 = new 티비(10 , 9 , true);
//		tv1.ch = 10;
//		tv1.vol=0;
//		tv1.onOff=true;
		tv1.채널을_바꾸다();
		System.out.println(tv1.ch+" "+tv1.vol+tv1.onOff);
		System.out.println(tv1);
		
		티비 tv2 = new 티비(0, 0, false);
		tv2.ch=20;
		tv2.vol=10;
		tv2.onOff=false;
		tv2.유튜브();
		System.out.println(tv2.ch+" "+tv2.vol+tv2.onOff);
		System.out.println(tv2);
	
	
	
	}

}
