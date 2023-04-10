package 배열;

import java.util.Scanner;

public class 정리문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] n = new int[5];
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
		}

		sc.close();

		int min = n[0];
		for (int x : n) {
			if (x < min)min = x;{
			}
		}
		System.out.println(min);
	}
}
