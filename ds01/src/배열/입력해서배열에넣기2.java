package 배열;

import java.util.Scanner;

public class 입력해서배열에넣기2 {
	
//	11.1
//	22.2
//	33.3
//	44.4
//	55.5

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double[] numbers = new double[5];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextDouble();
		}
		
		sc.close();
		for (double x : numbers) {
			System.out.println(x);
		}
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 33.3) {
				System.out.println("위치는" + i);
			}
			if (numbers[i] == 22.2) {
				System.out.println("위치는" + i);
			}
		}
		
		
	}

}
