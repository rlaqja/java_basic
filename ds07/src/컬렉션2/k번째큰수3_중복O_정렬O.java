package 컬렉션2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class k번째큰수3_중복O_정렬O {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int k = sc.nextInt();
		TreeSet<Integer> set = new TreeSet<>();
		
		
		for (int i = 0; i < size; i++) {
				set.add(sc.nextInt());
		}
		System.out.println(set);
		Object[] result = set.toArray();
		System.out.println(result[result.length - k]);
		sc.close();
	}

}
