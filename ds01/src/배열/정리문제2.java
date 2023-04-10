package 배열;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 정리문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random(5);
		int[] num = new int[20];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(900);
		}
		
		int max = num[0];
		for (int x : num) {
			if (max < x)max = x; {
			}
		}
		Arrays.sort(num);
		System.out.println("최댓값 :"+num[19]);
	}
}
