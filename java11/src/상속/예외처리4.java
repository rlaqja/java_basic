
package 상속;

public class 예외처리4 {

	public static void main(String[] args) {
		int[] num = new int[3];
			try {
				num[3] = 2;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		System.out.println(num.length);
		}
}
