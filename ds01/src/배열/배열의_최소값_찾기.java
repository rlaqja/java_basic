package 배열;

import java.util.Random;

public class 배열의_최소값_찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random(100);
		
		int[] s = new int[1000];
		for (int i = 0; i < s.length; i++) {
		  s[i] = r.nextInt(1000);
		}
		
		int max = s[0];
		for (int x : s) {
			if (max < x)max = x; {
			}
		}
		System.out.println(max);
		
		
	}
}

