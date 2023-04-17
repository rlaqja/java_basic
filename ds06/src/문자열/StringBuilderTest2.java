package 문자열;


import java.util.*;


public class StringBuilderTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb1 = new StringBuilder();
		sb1.append("honghong");
		System.out.println(sb1);

		StringBuilder sb2 = new StringBuilder("honghong");
		System.out.println(sb2);
		
		

		System.out.println(sb1 == sb2);
		sb1.append("hahaha");
		System.out.println(sb1);
		sb1.replace(0, 8, "hohohoho");
		System.out.println(sb1);
		sb1.delete(0, 8);
		System.out.println(sb1);
		sb1.deleteCharAt(0);
		System.out.println(sb1);
		
		
		String sb3= sb1.toString();
		String[] sb4 = sb3.split("");
		
		List<String> list = Arrays.asList(sb4);
		
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
	}

}
