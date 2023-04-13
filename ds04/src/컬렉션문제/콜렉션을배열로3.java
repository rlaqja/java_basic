package 컬렉션문제;
import java.awt.List;
import java.util.*;

public class 콜렉션을배열로3 {

	public static void main(String[] args) {
		String[] s2 = {"aaa", "bbb", "ccc", "aaa"};
		
		stringPrint(s2);
		
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(s2));
		
		System.out.println(list.contains("aaa"));
		System.out.println(list.add("fff"));
		System.out.println(list);
		list.add(1, "ggg");
		System.out.println(list.remove("ccc"));
		
		String[] s3 = new String[list.size()];
		for (int i = 0; i < s3.length; i++) {
			s3[i] = list.get(i);
		}
		stringPrint(s3);
	}
	
	public static void intPrint(int[] array) {
		System.out.println(Arrays.toString(array));
	}
	public static void stringPrint(String[] array) {
		System.out.println(Arrays.toString(array));
	}
}