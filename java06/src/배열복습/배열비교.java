package 배열복습;

import java.util.Random;

public class 배열비교 {

	public static void main(String[] args) {
		//입력
		int[] 답안지 = new int[990]; 
		int[] 내답안 = new int[990];
		
//		System.out.println(답안지.length);
//		System.out.println(내답안.length);
//		System.out.println(답안지);
//		System.out.println(내답안);
		Random r = new Random(42);
		for (int i = 0; i < 내답안.length; i++) {
			답안지[i] =r.nextInt(4)+1;
			내답안[i] =r.nextInt(4)+1;
		}
		System.out.println("번호:\t답안\t\t내답");		
		for (int i = 0; i < 내답안.length; i++) {
			System.out.println(i+"0\t:\t" + 답안지[i] + "\t<->\t" + 내답안[i]);
		}
		int jumsu =0;
		for (int i = 0; i < 내답안.length; i++) {
			if (내답안[i] == 답안지[i]) {
				jumsu++;				
			}
		}
		System.out.println("토익점수는 "+jumsu+"점");
	}

}
