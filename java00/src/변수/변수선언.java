package 변수;

public class 변수선언 {

	public static void main(String[] args) {
		//자바는 변수를 만들 때, 어떤 타입의 데이터를 넣을지 미리 결정
		//선언 타입 변수명 ==> 변수가 생성됨!
		int num = 100; //정수변수
		Double num2 = 22.2; //실수 변수, 22.0 22(정수를 넣을 수 있음.)
		char c = '한'; //1글자 ==>''
		Boolean b = true; //false
		num = 200;
		System.out.println("정수값은"+num);
		System.out.println("실수값은"+num2);
		System.out.println("문자1개값은"+c);
		System.out.println("부울렌 값은"+b);
	}

}
