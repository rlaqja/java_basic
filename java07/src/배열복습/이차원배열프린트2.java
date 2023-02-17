package 배열복습;

public class 이차원배열프린트2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] s = {
				{"여행가기","맛있는거 먹기","영화보기"},
				{"번지점프해보기","친구들많이 사귀기","운동하기"},
				{"스카이다이빙 해보기","국내 다 돌아다녀보기","멍멍이 간식 만들어보기"}
				};
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				System.out.println(s[i][j]);
			}
		}
	}

}
