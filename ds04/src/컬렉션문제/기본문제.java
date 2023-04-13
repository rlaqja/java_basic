package 컬렉션문제;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class 기본문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = "happy birthday!";
		
		Solution1 sol = new Solution1();
		int answer = sol.solution(message);
		System.out.println(answer);
		
	}
}

	class Solution1 {
    public int solution(String message) {
    	
    	int answer = message.length();
 
    	answer = message.length() * 2;
		
        return answer;
    }
}
