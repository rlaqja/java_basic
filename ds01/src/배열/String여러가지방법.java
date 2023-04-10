package 배열;

public class String여러가지방법 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "나는 프로그래머프야";
		String s2 = "진짜로!";
		System.out.println(s + s2);
		System.out.println(s.concat(s2));
		System.out.println(s.charAt(0));
		System.out.println(s2.endsWith("!"));
		System.out.println(s.substring(3));
		System.out.println(s.substring(3, 8));
		System.out.println(s.contains(s2));
		System.out.println(s.lastIndexOf("프"));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.length());
		System.out.println(s.replace("나", "너"));
		
	}

}
