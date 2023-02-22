package 형변환;

import java.util.LinkedList;

public class 시험일정 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList day = new LinkedList();
		
		day.add("국어");
		day.add("수학");
		day.add("영어");
		day.add("컴퓨터");
		
		day.remove();
		System.out.println("1일차 시험본 후 남은 과목"+day);
		day.remove();
		System.out.println("2일차 시험본 후 남은 과목"+day);
		day.remove();
		System.out.println("3일차 시험본 후 남은 과목"+day);
		
		
		
	}

}
