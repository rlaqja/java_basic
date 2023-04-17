package 컬렉션2;

import java.util.HashSet;
import java.util.Iterator;

public class Set반복자이터레이터 {

	public static void main(String[] args) {
		HashSet<String> bag= new HashSet<>();
		bag.add("휴대폰");
		bag.add("휴지");
		bag.add("볼펜");
		bag.add("노트북");
		bag.add("노트북");
		System.out.println(bag.size());
		System.out.println(bag);

	
		
		Iterator<String> it = bag.iterator();
		System.out.println(it.hasNext());
		System.out.println(it.hasNext());
		System.out.println(it.hasNext());
		System.out.println(it.hasNext());
		
		for (int i = 0; i < bag.size(); i++) {
			String x =it.next();
			System.out.println(x);
		}
		System.out.println("=================");
		Object[] bag2 = bag.toArray();
		for (Object x : bag2) {
			System.out.println(x);
		}
	}

}
