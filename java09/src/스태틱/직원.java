package 스태틱;

public class 직원 {
	static String im;
	int age;
	String gender;
	static int count;
	static int sum;
	
	public static void getAvg() {
		System.out.println(im);
		System.out.println(sum / count);
	}
	
	public 직원(String im, int age, String gender) {
		count++;
		sum = sum + age;
		this.im = im;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "직원 [im=" + im + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
	
	
}
