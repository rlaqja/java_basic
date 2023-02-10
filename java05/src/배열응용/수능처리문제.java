package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 수능처리문제 {

	public static void main(String[] args) {
//		수능 10000명의 점수를 처리!
		int[] test = new int[10000];
		
		
//		랜덤으로 10000명의 넣어주세요.
//		0~450
		Random r = new Random(42);
		for (int i = 0; i < test.length; i++) {
			test[i] = r.nextInt(451);
		}
		
		for (int i = 0; i < test.length; i++) {
			System.out.println(i+ ": "+ test[i]);
		}
		System.out.println("========================");
		
//		1) 만점자가 몇 명인지?? 누구인지(인덱스)
//		2) 0점이 몇 명인지??
		int maxCount = 0;
		int zeroCount = 0;
		for (int x : test) {
			if (x == 450) {
				maxCount++;
				
			}if (x == 0) {
				zeroCount++;
			}
		} 
		System.out.println("만점자 :" + maxCount + "명");
		System.out.println("0점자 :" + zeroCount+ "명");
		
//		3) 평균은 어떻게 되었는지?? 합계를 먼저 구해야함.
		int sum = 0;
		for (int x : test) {
			sum = sum + x;
		}
		double avg = (double)sum /test.length;
		System.out.println("전체 수험생의 평균"+ avg);	
	
//		4) 심화)) 평균보다 +-50점 인 학생 카운트(포함)
		int avgPlusMinus = 0;
		for (int x : test) {
			if ((avg-50<= x) && (x <=avg+50)) {
				avgPlusMinus++;
			}
		}
		System.out.println("평균보다 +-50점인 수험생: "+ avgPlusMinus+"명");
		
		Arrays.sort(test);
		
	}
}

			   

		
