package 배열;

import java.util.Random;
import java.util.Scanner;

public class 정리문제3 {

	public static void main(String[] args) {
		
		String s1 = "참좋다";
		String s2 = "진짜좋다";
		
		System.out.println(s1.equals(s2));
		
		int n1 = s1.length();
		int n2 = s2.length();
		
		if (n1 > n2) {
			System.out.println("s1이 더 크다.");
		} else {
			System.out.println("s2가 더 크다.");
		}
	}
}
