package 자바DB연결;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

public class 반환값받아오기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			반환값연습 re = new 반환값연습();
			re.add2();
			
			int result1 =re.add(200, 100);
			System.out.println(result1);
			
			double result2 = re.add(22.2, 10);
			System.out.println(result2);
			
			String result4 = re.add(1, "번 천재");
			System.out.println(result4);
			
			String result5 = re.add("나는", "천재");
			System.out.println(result5);
			
			int[]  result6= re.add();
			result6[0] = 100;
			System.out.println(result6[0]);
			System.out.println(result6[1]);
			System.out.println(result6[2]);
			
			Date data = re.getDate();
			System.out.println(data.getMinutes());
			System.out.println(data.getSeconds());
			System.out.println(data.getDay());

			int result7 = re.getHour();
			System.out.println(result7+"시");
			
			int result8 = re.getRandom2();
			System.out.println(result8);
			
			ArrayList result9 = re.getList();
			System.out.println(result9.get(1)+" "+result9.get(0));
			result9.set(0, "양파");
			System.out.println(result9);
			
			HashSet result10 = re.getSet();
			System.out.println(result10);

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
