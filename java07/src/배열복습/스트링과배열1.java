package 배열복습;

public class 스트링과배열1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "나는 프로그래머프야";
		String s2 = "진짜!";
		System.out.println(s+s2);
		System.out.println(s.concat(s2));
		System.out.println(s.charAt(0));
		char c = s.charAt(0);
		System.out.println(s.endsWith("야"));
		boolean result = s.endsWith("야");
		String result2 = s.substring(3);
		String result3 = s.substring(3,8);
		boolean result4 = s.contains(s2);
		int index = s.lastIndexOf("프");
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.length());
		s.replace("나", "너");
		System.out.println(s);
		
	}

}
