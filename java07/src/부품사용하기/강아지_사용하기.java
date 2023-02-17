package 부품사용하기;

import 부품만들기.강아지;

public class 강아지_사용하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		강아지 dog1 = new 강아지();
		dog1.cute=1;
		dog1.size="normal";
		dog1.강아지_사이즈();
		System.out.println("키우는 강아지 수:"+dog1.cute);
		System.out.println("키우는 강아지 크기:"+dog1.size);
	
		
		강아지 dog2 = new 강아지();
		dog2.cute =100;
		dog2.size ="big";
		dog2.강아지귀엽다();
		System.out.println("강아지 귀여움지수"+dog2.cute);
		System.out.println("강아지 크기"+dog2.size);
	
	}

}
