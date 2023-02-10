package 배열응용;

public class 여러개배열사용하기2 {

	public static void main(String[] args) {
		String[] names = { "홍길동", "이순신", "뉴진스", "방탄", "블랙핑크" };
		int[] term1 = { 77, 88, 99, 55, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };

		int count = 0;
		int count2 = 0;
		int count3 = 0;
		for (int i = 0; i < term1.length; i++) {
			if (term2[i] > term1[i]) {
				count++;

			} else if (term1[i] == term2[i]) {
				count2++;
			}
		}
		System.out.println("2학기 성적이오른 학생 수 :" + count);
		System.out.println("1-2학기 동일한 학생 수 :" + count2);

		for (int i = 0; i < term2.length; i++) {
			if (term2[i] == 100) {
				System.out.println("2학기 학생 중 만점인 학생 이름:" + names[i] + "\t" + i + "번");
				count3++;
			}
		}
		int sum = 0;
		int sum1 = 0;

		for (int i = 0; i < term2.length; i++) {
			sum = sum + term1[i];
			sum1 = sum1 + term2[i];
		}
		double avg1 = (double)sum / term1.length;
		double avg2 = (double)sum1 / term2.length;
		if (avg1 > avg2) {
			System.out.println("1학기 평균이 더 높았습니다");
		}else if (avg1 < avg2) {
			System.out.println("2학기 평균이 더 높았습니다");
			
		}else
			System.out.println("1학기 2학기 평균이 동일합니다");
		
		
		for (int i = 0; i < term2.length; i++) {
			if (names[i].equals("뉴진스")) {
				System.out.println("뉴진스의 1학기 성적은" + term1[i]);
				System.out.println("뉴진스의 2학기 성적은" + term2[i]);
				System.out.println("뉴진스의 위치는" + i);
			}
		}
		
	}

}