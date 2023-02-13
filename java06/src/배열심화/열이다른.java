package 배열심화;

public class 열이다른 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] n2 = {
				{1,2,3},
				{1,2,3,4},
				{1,2,3,4,5}
		};
		for (int i = 0; i < n2.length; i++) {
			for (int j = 0; j < n2.length; j++) {
				System.out.println(n2[i][j]+ " ");
			}
			System.out.println();
		}
		int[][] n1 = new int[3][4];
		System.out.println("2차원 배열의 행 개수: "+ n1.length);
		System.out.println("0행의 배열의 행 개수: "+ n1[0].length);
		System.out.println("1행의 배열의 행 개수: "+ n1[1].length);
		System.out.println("2행의 배열의 행 개수: "+ n1[2].length);
		for (int i = 0; i < n1.length; i++) {
			for (int j = 0; j < n1.length; j++) {
				System.out.println(n1[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
