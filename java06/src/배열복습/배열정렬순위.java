package 배열복습;

import java.util.Arrays;
import java.util.Random;

public class 배열정렬순위 {

	public static void main(String[] args) {
		// 정렬을 할 때는 arrays
		Random r = new Random();
		int[] jumsu =new int[10000];
		//for;입력용,출력용,i활용 가능
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] =r.nextInt(1000) +1;
		}
		//for-each:알아서 위치값을 옮겨주면서 하나씩 꺼내오기
		// 출력욕
		for (int x : jumsu) {
			System.out.println(x);
		}
		Arrays.sort(jumsu);
		System.out.println("=====================");
		for (int x : jumsu) {
			System.out.println(x);
		}
		System.out.println("최소값:"+jumsu[0]);
		System.out.println("최대값:"+jumsu[jumsu.length-1]);
		
		int sum30 = 0;
		for (int i = 7000; i < jumsu.length; i++) {
			sum30 =sum30+jumsu[i];
		}
		
		System.out.println("=====================");
	System.out.println("상위 30% 평균 : " + (sum30 / 3000.0));
	
	int sum0 = 0;
	for (int i = 0; i < 3000; i++) {
		sum0+= jumsu[i];
	}
	System.out.println("하위 평균 30% :"+ (sum0 /3000.0));
	String result = Arrays.toString(jumsu);
	System.out.println(result);
	}	

}
