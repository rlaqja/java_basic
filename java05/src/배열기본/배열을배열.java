package 배열기본;

import java.util.Scanner;

public class 배열을배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = new int[5];
		Scanner sc= new Scanner(System.in);
		
		for (int i = 0; i < n.length; i++) {
			System.out.println("값을 넣어주세요");
			n[i] = sc.nextInt();
		}
		System.out.println("두 수의 합은" + (n[0] + n[2]));

		
		String[] st = new String[3];
		
		for (int i = 0; i < st.length; i++) {
			System.out.println("값을 넣어주세요");
			st[i] = sc.next();
		}
		System.out.println((st[0])+ " 보다는 " + (st[1]));
		
		sc.close();
	}

}
