package 문자열;


import java.util.*;

public class 문자열내림차순배치 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Zbcdefg";
		String answer = "";
		
		
		String[] s2 =s.split("");
			
		List<String> list = Arrays.asList(s2);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
		for (String x : list) {
			answer = answer +x;
		}
		
		System.out.println(answer);
	
	}

}
