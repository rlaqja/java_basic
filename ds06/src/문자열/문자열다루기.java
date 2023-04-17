package 문자열;

import java.util.Arrays;

public class 문자열다루기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "a234";
		Boolean answer = true;
		int size = s.length();
		if (size == 4 || size == 6) {
			
		
		char[] c = s.toCharArray();
		System.out.println(Arrays.toString(c));
		
		for (char x : c) {
			if(x < '0' && x > '9') {
				answer = true;
			}
		}
		}else {
			answer = false;
		}
		System.out.println(answer);
	}
}
