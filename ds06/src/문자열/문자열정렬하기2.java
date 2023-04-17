package 문자열;

import java.util.Arrays;

public class 문자열정렬하기2 {

	public String main(String my_string) {
		// TODO Auto-generated method stub
		
		char[] c = my_string.toLowerCase().toCharArray();
		Arrays.sort(c);
		
		return new String(c);
		
	}

}
