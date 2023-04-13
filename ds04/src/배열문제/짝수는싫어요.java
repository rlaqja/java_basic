package 배열문제;

import java.util.*;


public class 짝수는싫어요 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 15;
		Solution2 sol = new Solution2();
		int[] answer = sol.solution(n);
		System.out.println(Arrays.toString(answer));
	}

}

	class Solution2 {
		public int[] solution(int n) {
	    	int[] answer = new int[(n+1)/2];
	    	int j = 0;
	    	for (int i = 1; i <= n; i++) {
	    		if (i%2 != 0) {
	    			answer[j] = i;
					j++;
				}
			}
	        return answer;
	    }
	}
