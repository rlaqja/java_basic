package 프로그래머스;

import java.util.Arrays;


public class 배열의연산4 {

	public static void main(String[] args) {
		Solution7 sol = new Solution7();
		//{4, 3, 2, 7, 5, 10, 8, 9}
		//int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		//int[] numbers = {1, 2, 3, 4, 5, 9, 10};
		int[] numbers = {-20, -30, 3, 4, 5, 9, 10};
		int answer = sol.solution(numbers); // int[]
		System.out.println(answer);
	
	}
}

class Solution7 {
	public int solution(int[] numbers) {
		Arrays.sort(numbers);
		int post = numbers[numbers.length-2]*numbers[numbers.length-1] ; 
		int pre = numbers[0]*numbers[1] ; 
		int answer = 0;
		if( post > pre) {
			answer = post;
		}else {
			answer = pre;
		}
		
		
		return answer;
	}
}