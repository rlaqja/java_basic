package 컬렉션2;

import java.util.Arrays;
import java.util.Scanner;

public class k번째큰수 {

	public static void main(String[] args) {
		int[] num = {3,4,5,1,2};
		int k = 2;
		
		Arrays.sort(num);
		for (int x : num) {
			System.out.println(x +" ");
		}
		String num2 = Arrays.toString(num);
		System.out.println(num2);
		
		System.out.println("제일큰수 :"+ num[num.length -1]);
		System.out.println("제일큰수 :"+ num[4]);
		System.out.println(num[num.length -k]);
		
		
	}

}
