package 문자열;

public class 문자반복출력하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String my_string = "hello";
		int n = 3;
		Solution1 sol = new Solution1();
		String answer = sol.solution(my_string, n);
		
		System.out.println(answer);
		
		
	}

}

class Solution1 {
    public String solution(String my_string, int n) {
        char[] c = my_string.toCharArray();
    	String answer = "";
        for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < n; j++) {
				answer += c[i];
			}
		}
        return answer;
    }
}