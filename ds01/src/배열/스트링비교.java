package 배열;

public class 스트링비교 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="정길동";
		String s2 ="정길동";
		
		System.out.println(s);
		System.out.println(s2);
		
		System.out.println(s.equals(s2));
		s = "김범수";
		System.out.println(s == s2);
		
		
		StringBuilder builder = new StringBuilder();
		builder.append("송길동");
		System.out.println(builder);
		
		
	}

}
