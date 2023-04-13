package 컬렉션문제;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class 배열의유사도 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s1 = {"a","b","c"};
		String[] s2 = {"com","b","d","p","c"};
		Solution sol = new Solution();
		int answer = sol.solution(s1, s2);
		System.out.println(answer);
		
	}
}

	class Solution {
    public int solution(String[] s1, String[] s2) {
      
    	List<String> list2 = Arrays.asList(s2);
    	int answer = 0;        
       
    	for (String x : s1) {
			if(list2.contains(x)) {
				answer++;
			}
		}
        return answer;
    }
}
