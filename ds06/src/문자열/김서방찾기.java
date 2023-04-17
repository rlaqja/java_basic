package 문자열;

import java.util.Arrays;
import java.util.List;

public class 김서방찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] seoul = {"Jane", "Kim"}; 
		String answer = "";
		
		int findindex = 0;
		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				findindex = i;
			}
		}
		answer = "김서방은 "+findindex+"에 있다";
		System.out.println(answer);
	}
}
