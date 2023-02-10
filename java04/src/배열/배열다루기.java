package 배열;

public class 배열다루기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] x =new int[10];
//		x[0]= 10;
//		x[1]= 20;
//		System.out.println(x.length);
//		for (int i = 0; i < 10; i++) {
//			System.out.print(x[i]+" ");
//		}

//		System.out.println(x[0]);
//		System.out.println(x[1]);
//		System.out.println(x[3]);

		char[] gender = { '남', '여', '여', '남' };
		for (int i = 0; i < 10; i++) {
			System.out.print(gender[i] + " ");
//			System.out.println(gender[0]);
//			System.out.println(gender[1]);
//			System.out.println(gender[2]);
//			System.out.println(gender[3]);
		}
		String[] name = { "H", "G", "D" };
		for (int i = 0; i < 10; i++) {
			System.out.print(name[i] + " ");
//		System.out.println(name[0]);
//		System.out.println(name[1]);
//		System.out.println(name[2]);
		}
		double[] eye = { 1.0, 0.7, 16.1 };
		for (int i = 0; i < 10; i++) {
			System.out.print(eye[i] + " ");
//		System.out.println(eye[0]);
//		System.out.println(eye[1]);
//		System.out.println(eye[2]);
		}
		System.out.println();
		boolean[] lunch = { true, false };
		for (int i = 0; i < lunch.length; i++) {
			System.out.print(eye[i] + " ");
//			System.out.println(lunch[0]);
//			System.out.println(lunch[1]);
		}
	}

}
