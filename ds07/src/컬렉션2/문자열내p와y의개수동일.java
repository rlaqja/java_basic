package 컬렉션2;

import java.util.HashMap;

public class 문자열내p와y의개수동일 {

	public static void main(String[] args) {
		String s = "pPooooyYyy";

		//System.out.println(s2);
		
		String s2 = s.toLowerCase();
		String[] s3 = s2.split("");
		HashMap<String, Integer> map = new HashMap<>();
		for (String x : s3) {
			map.put(x, map.getOrDefault(x, 0) + 1);

		}
		System.out.println(map);
		System.out.println(map.get("p") == map.get("y"));
	}

}
