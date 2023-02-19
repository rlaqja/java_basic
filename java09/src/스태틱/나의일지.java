package 스태틱;

public class 나의일지 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day day1 = new Day("영화보기", 19, "롯데시네마");
		System.out.println(Day.count);
		System.out.println(Day.sum);
		Day day2 = new Day("간단한 맥주", 22, "역전할맥");
		System.out.println(Day.count);
		System.out.println(Day.sum);
		Day day3 = new Day("유튜브시청", 23, "집");
		System.out.println(Day.count);
		System.out.println(Day.sum);
		
		
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		
	}

}
