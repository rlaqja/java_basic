package 문자열;

import java.util.*;


public class String에서Char배열에옮기기3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "2056521";
		
		
		
		if(s.charAt(s.length()-1) == '1') {
			System.out.println("서대문구 출생");
		}else {
			System.out.println("다른 구에서 출생");
		}
		
		System.out.println(s.substring(4,6));
		
		char[] two =new char[2];
		s.getChars(4, 6, two, 0);
		
		int i1 = Character.getNumericValue(two[0]);
		int i2 = Character.getNumericValue(two[1]);
		
		int sum = i1+i2;
		if(sum < 10) {
			System.out.println("유효한 주민번호O");
		}else {
			System.out.println("유효한 주민번호X");
			
		}
		
		System.out.println(sum);
		System.out.println(Arrays.toString(two));
		
		String[] stringArray = s.split("");
		int count= 0;
		for (String x : stringArray) {
			if(x.equals("5")) {
				count++;
			}
		}
		System.out.println(count);
		
		
		
		//인덱스를 빨리 찾는 방법(함수)
		System.out.println(Arrays.binarySearch(stringArray, "5"));
		
		//배열에 특정한 값을 한꺼번에 변경할 수 있는 함수
		Arrays.fill(stringArray, 0, 3, "hoho");
		print(stringArray);
		
		//배열의 순서를 다 뒤집는 방법(함수) 
		Arrays.sort(stringArray); //정렬(오름차순)
		//Arrays로 내림차순을 할 수는 있으나 너무 복잡
		//==>컬렉션으로 변환해서 하면 더 간단.
		System.out.println(Arrays.toString(stringArray));
		
		List<String> list = Arrays.asList(stringArray);
		Collections.sort(list); //정렬(오름차순)
		Collections.reverse(list); //정렬(내림차순)
		
		
		//배열안에 데이터의 빈도수(횟수)구하는 방법(함수) 
		int count3 = Collections.frequency(list, "hoho");
		System.out.println(count3);

	}

	public static void print(String[] s) {
		System.out.println(Arrays.toString(s));
	}
}
