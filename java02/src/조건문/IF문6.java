package 조건문;

import java.util.Date;

public class IF문6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		
		int year =  (date.getYear() + 2000);
		
		
		if (year >= 2000) {
			System.out.println("밀레니엄 세대시군요");
		} else {
			System.out.println("밀레니엄 세대가 아니시군요");
		}
		
		int day = date.getDay();
		if (date.getDay() == 0 || date.getDay() ==6 ){
			System.out.println("쉬~~~~~~~~~자");
		} else {
			System.out.println("열심히 공부하자");
		}
		
		int month = date.getMonth() + 1;
		System.out.println(month);
		switch (month) {
		case 2:
			System.out.println("28일까지");
			break;
		case 4: case 6: case 9:case 11:
			System.out.println("30일까지");
			break;
		default:
			System.out.println("31일까지");
			break;
		}
		
	}
}