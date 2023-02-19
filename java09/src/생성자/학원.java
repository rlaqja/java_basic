package 생성자;

public class 학원 {

	public static void main(String[] args) {
		수강신청 st1 = new 수강신청(1,"자바","14:30","홍길동");
		수강신청 st2 = new 수강신청(2,"디비","9:30","박길동");
		
		System.out.println(st1);
		System.out.println("");
		System.out.println(st2);
		
		
		

	}

}
