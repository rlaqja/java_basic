package 컬렉션2;

import java.util.HashSet;
import java.util.Iterator;

public class Set반복자이터레이터2 {

	public static void main(String[] args) {
		HashSet<Integer> money = new HashSet<Integer>();
		//일주일간 받았던 용돈
		money.add(1000);
		money.add(2000);
		money.add(3000);
		money.add(2000);
		money.add(4000);
		money.add(2000);
		money.add(3000);
		
		System.out.println(money);
		
		Iterator<Integer> iter = money.iterator();
		System.out.println(iter.hasNext());
		
		
		for (int i = 0; i < money.size(); i++) {
			int x = iter.next();
			System.out.println(x);
		}
	}

}
