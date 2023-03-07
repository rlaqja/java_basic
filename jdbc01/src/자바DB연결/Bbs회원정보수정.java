package 자바DB연결;

import java.util.Scanner;

public class Bbs회원정보수정 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("no/writer순으로 입력하세요.");
		
		int no = sc.nextInt();
		String writer = sc.next();
		
		BbsDAO dao = new BbsDAO();
		dao.update(no,writer);
	}

}
