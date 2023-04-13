package 배열문제;

import java.util.*;


public class 배열두배로 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = {1,2,3,4,5};
		Solution sol = new Solution();
		int[] answer = sol.solution(numbers);
		System.out.println(Arrays.toString(answer));
	}

}


class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
			answer[i] = numbers[i] * 2;
		}
        return answer;
    }
}