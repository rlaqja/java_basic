package 자바DB연결;

import java.util.Scanner;

public class Bbs회원가입 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("no/title/content/writer순으로 입력하세요.");
		int no = sc.nextInt();
		String title = sc.next();
		String content = sc.next();
		String writer = sc.next();
		
		BbsDAO dao = new BbsDAO();
		dao.insert(no,title,content,writer);
		
		
	}

}
