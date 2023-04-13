package 배열문제;

import java.util.*;


public class 배열뒤집기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num_list = {1,2,3,4,5};
		Solution1 sol = new Solution1();
		int[] answer = sol.solution(num_list);
		System.out.println(Arrays.toString(answer));
	}

}

	class Solution1 {
	    public int[] solution(int[] num_list) {
	        int[] answer = new int[num_list.length];
	        int j = num_list.length-1;
	        for (int i = 0; i < num_list.length; i++) {
				answer[j] = num_list[i];
				j--;
			}
	        return answer;
	    }
	}
