package 배열;

public class 배열최솟값구하기1번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s = {90,80,20,60,70};
		
		int min =s[0];
		for (int x : s) {
			if (x < min)min = x;
			} 
		System.out.println("최솟값은" + min);
		}
}

