package 반복문;

public class 반복문안에서스킵하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 10; i++) {
//			if (i == 8) {
//				break;
////				System.exit(0);
//			}
			if (i + 2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
