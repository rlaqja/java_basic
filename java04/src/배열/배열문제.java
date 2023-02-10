package 배열;

public class 배열문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[] week = {1, 2, 10, 4, 12, 6, 7};
	System.out.println(week);
	System.out.println(week[0]);
	System.out.println(week[1]);

	System.out.println("전체 공부시간"+week.length);
	
	week[3] = 10;
	System.out.println(week[3]);
	
	week[5] = 12;
	System.out.println(week[5]);
	
	
	int[] tour = new int[4];
	
	tour[0] = 20;
	tour[3] = 30;

	System.out.println(tour[0]);
	System.out.println(tour[3]);
	System.out.println(tour.length);
	}

}
