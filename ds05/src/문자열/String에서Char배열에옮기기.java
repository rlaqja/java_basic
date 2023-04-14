package 문자열;

public class String에서Char배열에옮기기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "s205621";
		char c = s.charAt(0);
		String answer = "개발부서가 아닙니다";
		if(c == 's') {
			answer = "개발부서입니다.";
		}else {
			answer = "개발부서가 아닙니다.";
		}
		System.out.println(answer);
				
	}

}
