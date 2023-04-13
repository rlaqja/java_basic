package 배열문제;

import java.util.*;


public class 숫자찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 29183;
		int k = 1;
		Solution3 sol = new Solution3();
		int answer = sol.solution(num,k);
		System.out.println(answer);
	}

}

	class Solution3 {
		public int solution(int num, int k) {
	        ArrayList<String> n = new ArrayList<String>(num);
	        ArrayList<String> n1 = new ArrayList<String>(k);
		
			int answer = 0;
			if (n.indexOf(n1) == -1) {
				answer =-1;
			}else {
				answer = n.indexOf(n1) + 1;
			}
				
			
			
	        return answer;
	    }
	}
