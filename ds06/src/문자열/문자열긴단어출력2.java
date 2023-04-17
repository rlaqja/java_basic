package 문자열;

import java.util.Scanner;

public class 문자열긴단어출력2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String[] total =sc.nextLine().split(" ");
		
		int maxlength = total[0].length();
		
		String maxString = total[0];
		
		for (String x : total) {
			if (x.length() > maxlength) {
				maxlength = x.length();
				maxString = x;
			}
		}
		System.out.println(maxString);
		sc.close();
		
	}

}
