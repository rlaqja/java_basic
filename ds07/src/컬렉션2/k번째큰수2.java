package 컬렉션2;

import java.util.Arrays;
import java.util.Scanner;

public class k번째큰수2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int k = sc.nextInt();
		int[] num = new int[size];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(num));
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		
		System.out.println(num[num.length -k]);
		
		sc.close();
	}

}
