package 배열;

import java.util.Arrays;

public class 심화문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s5 = "[10, 20, 30, 40, 50]";
		
		s5 = s5.replace("[", "");
		s5 = s5.replace("]", "");
		System.out.println(s5);
		
		s5 = s5.trim();
		System.out.println(s5);
		
		String[] s55 = s5.split(", ");
		System.out.println(s55[0]);
		System.out.println(s55[1]);
		System.out.println(s55[2]);
		
		int sum = 0;
		for (String x : s55) {
			int x2 = Integer.parseInt(x);
			sum = sum + x2;
		}
		System.out.println(sum);
		
		System.out.println(s55.length);
		int[] newArray = new int[s55.length];
		
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = Integer.parseInt(s55[i]); 
		}
		System.out.println(Arrays.toString(newArray));
	}

}
