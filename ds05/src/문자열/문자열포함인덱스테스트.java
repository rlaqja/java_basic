package 문자열;

public class 문자열포함인덱스테스트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "ab6CDE443fgh22iJKlmn1o";
		String str2 = "6CD";
		
		Solution sol = new Solution();
		int answer = sol.solution(str1, str2);
		System.out.println(answer);
	}

}


class Solution {
    public int solution(String str1, String str2) {
        int answer = 2;
        
        if (str1.contains(str2)) {
			answer = 1;
		}
        return answer;
    }
}