package 컬렉션2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class 한번만등장하는문자 {

	public static void main(String[] args) {
		String s = "abcabcadc";

		HashSet<String> set = new HashSet<>();
		String[] s2 = s.split("");
		System.out.println(Arrays.toString(s2));
		// [a, b, c, a, b, c, a, d, c]
		for (String x : s2) {
			set.add(x);
		}
		System.out.println(set.size());// 4
		System.out.println(set);// [a, b, c, d]

		// 배열안에 set에 들어있는 요소가 1인 것만 찾기
		Object[] set2 = set.toArray();// {a, b, c, d}
		List<String> list = Arrays.asList(s2);
		// Collections.frequency(list,"a")
		String answer = "";
		for (Object x : set2) {
			if (Collections.frequency(list, x) == 1){
			answer += x;
			}
		}
		System.out.println(answer);
	}

}
