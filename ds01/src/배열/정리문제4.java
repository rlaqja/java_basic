package 배열;

import java.util.Random;
import java.util.Scanner;

public class 정리문제4 {

	public static void main(String[] args) {
		
		String s3 = "나는 진짜 java programmer가 되었어";
		
		String result = s3.substring(5,21);
		System.out.println(result);
		System.out.println(result.toUpperCase());
		
		String s4 = "2056521";
			if (s4.charAt(0) == '2') {
				System.out.println("여자");
			}else {
				System.out.println("남자");
			}		
	}
}
