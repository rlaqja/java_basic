package 조건문;

public class IF문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "2055111";
		
//		if (ssn.equals(2055111)) {
//			System.out.println("동일한 지역에서 태어나셨군요!");	
//		} else {
//			System.out.println("동일한 지역에서 태어나신게 아니시군요!");	
//		}
		
		char gender = ssn.charAt(0);
		switch (gender) {
		case 1:case 3:
			System.out.println("남자");
			break;
		case 2:case 4:
			System.out.println("여자");
			break;

		default:
			break;
		}
	}
}