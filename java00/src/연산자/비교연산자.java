package 연산자;

public class 비교연산자 {

	public static void main(String[] args) {
		// 비교연산자 (==,!=.>,>=)
		int id =1111;
		int id2 =2222;
		
		int pw =3333;
		int pw2 =3333;
		System.out.println("같은지 비교"+(id == id2));
		System.out.println("같지 않은지 비교"+(id !=id2));
		System.out.println("큰지 비교"+(id > id2));
		System.out.println("크거나 같은지 비교"+(id >= id2));
		
		System.out.println("같은지 비교"+(pw == pw2));
		System.out.println("같지 않은지 비교"+(pw!=pw2));
		System.out.println("큰지 비교"+(pw> pw2));
		System.out.println("크거나 같은지 비교"+(pw >= pw2));
	}

}
