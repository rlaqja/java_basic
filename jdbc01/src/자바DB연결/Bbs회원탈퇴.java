package 자바DB연결;

import java.util.Scanner;

public class Bbs회원탈퇴 {

	public static void main(String[] args) {
	
		//입력해보자.
		Scanner sc = new Scanner(System.in);
		System.out.println("탈퇴할 no를 입력하세요.");
		
		int no = sc.nextInt();
		
		BbsDAO dao = new BbsDAO();
		dao.delete(no);
	}

}