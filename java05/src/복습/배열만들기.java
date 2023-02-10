package 복습;

public class 배열만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] hobby= {"run","book","swim"};
		
		System.out.println(hobby);
		System.out.println("0:"+hobby[0]);
		System.out.println("1:"+hobby[1]);
		System.out.println("2:"+hobby[2]);
		System.out.println(hobby.length);
		for (int i = 0; i < hobby.length; i++) {
			System.out.println(i+":"+hobby[i]);
		}
		
		
		
		
		
		
		
		
		String[] job = new String[5];
		System.out.println(job);
		job[0] = "백엔트 프로그래머";
		job[1] = "카페주인";
		
		System.out.println(job[0]);
		System.out.println(job[1]);
		System.out.println(job[4]);
		
	}

}
