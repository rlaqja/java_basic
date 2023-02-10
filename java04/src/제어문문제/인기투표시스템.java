package 제어문문제;

import java.util.Scanner;

public class 인기투표시스템 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iu =0, bts =0, newjeans =0;
		Scanner sc= new Scanner(System.in);
		System.out.println("인기투표 시스템\n===========");
		while (true) {
			System.out.print("1)아이유 2)방탄 3) 뉴진스 4)종류 >>>");
			int choice = sc.nextInt();
			if (choice == 4) {
				System.out.println("시스템을 종료합니다");
				break;
			} else if (choice == 1) {
				iu++;
			} else if (choice == 2) {
				bts++;
			} else if (choice == 3) {
				newjeans++;
			} else {
				System.out.println("해당 번호가 없어요 ㅠ우ㅠ");
			}
		}
		sc.close();
		
		System.out.println("1)아이유:"+iu +"표  2)방탄 :"+bts+ "표 3) 뉴진스: " + newjeans+"표");
	}

}
