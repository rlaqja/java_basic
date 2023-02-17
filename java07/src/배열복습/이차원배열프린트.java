package 배열복습;

public class 이차원배열프린트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] n1 = {
				{1,2,3},
				{4,5,6}
		};
		System.out.println(n1.length);
		System.out.println(n1[0][0]);
		System.out.println(n1[1][2]);
		for (int i = 0; i < n1.length; i++) {
			for (int j = 0; j < n1[i].length; j++) {
				System.out.println(n1[i][j]);
			}
		}
		
	}

}
