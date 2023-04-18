package 컬렉션2;

import java.util.HashMap;

public class 우승자트표찾기_map3 {

	public static void main(String[] args) {
		String[] all = {"apple","banana","apple","banana","melon","apple"};
		String[] find = {"apple","banana","melon"};
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for (String x : find) {
			map.put(x, 0);
		}
		//System.out.println(map);
		//System.out.println(map.get("apple"));
		
		for (String x : all) {
			//System.out.println(map.get(x));
			map.put(x, map.get(x)+ 1);
		}
		//System.out.println(map);
		int count = 0;
		for(String x : map.keySet()) {
			System.out.println(x+" : "+ map.get(x));
			if (map.get(x) > count) {
				count = map.get(x);
				System.out.println("현재 인기과일:"+ x);
			}
		}
		System.out.println(map.keySet());
	}

}
