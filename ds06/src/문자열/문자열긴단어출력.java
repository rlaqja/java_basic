package 문자열;

public class 문자열긴단어출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "i am a boy";
		
		String[] s2 =s.split(" ");
		
		int max = s2[0].length();
		
		String maxString = s2[0];
		
		for (String x : s2) {
			if (x.length() > max) {
				max = x.length();
				maxString = x;
			}
		}
		System.out.println(maxString);
		
	}

}
