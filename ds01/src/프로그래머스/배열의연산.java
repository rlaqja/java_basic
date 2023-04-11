package 프로그래머스;


public class 배열의연산 {

	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int answer = sol.solution(numbers); // int[]
		System.out.println(answer);
	
	}
}

class Solution4 {
	public int solution(int[] numbers) {
		//System.out.println(numbers.length);
		//int answer = numbers[7]+ numbers[8]+numbers[9];
		int answer = numbers[numbers.length-3]+ numbers[numbers.length-2]+numbers[numbers.length - 1];
		return answer;
	}
}