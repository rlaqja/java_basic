package 형변환확인문제;

import java.util.ArrayList;

public class 형변확인문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList info = new ArrayList();
		info.add(1000);
		info.add(180.2);
		info.add(false);
		info.add('남');
		
		System.out.println(info);
		int money = (int)info.get(0)+2000;
		System.out.println("현재 잔액 : " + money);
		
		double high = (double)info.get(1)+10;
		System.out.println("현재 내 키 : "+ high);
		
		Boolean eat =(Boolean)info.get(2);
		if (eat) {
			System.out.println("배불러요");
		}else {
			System.out.println("배고파요");
		}
		char gen = (char)info.get(3);
		if (gen == '남') {
			System.out.println("남자라면 1,3");
		} else {
			System.out.println("아니라면 2,4");
		}
		
	}

}
