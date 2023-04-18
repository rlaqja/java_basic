package 컬렉션2;

import java.util.HashMap;

public class 우승자트표찾기_map2 {

	public static void main(String[] args) {
		String[] all = {"홍길동","김길동","정길동","홍길동","김길동","홍길동"};
		//String[] find = {"홍길동","김길동","정길동"};
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for (String x : all) {
			map.put(x, map.getOrDefault(x, 0)+ 1);
		}
		System.out.println(map);
		
		int max = 0;
		System.out.println(map);
		for (String x : map.keySet()) {
			System.out.println(x+" : "+map.get(x));
			if(map.get(x) > max) {
				max = map.get(x);
				System.out.println("현재까지 우승자:" + x);
			}
		}
	}

}
