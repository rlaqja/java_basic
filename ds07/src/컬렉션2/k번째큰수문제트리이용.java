package 컬렉션2;

import java.util.*;

public class k번째큰수문제트리이용 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();

		TreeSet<Integer> tree = new TreeSet<Integer>();

		while (true) {
			int data = sc.nextInt();
			if (data == 0) {
				break;
			} else {
				tree.add(data);
			}
		}
	
		Object[] arr = tree.toArray();
		
		

		System.out.println("첫번째로 작은 수" + arr[0]);
		System.out.println("두번째로 작은 수" + arr[1]);
		System.out.println(k + "번째로 작은 수" + arr[k-1]);

		sc.close();
	}

}
