package 형변환;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class 확인문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet tour = new HashSet();
		tour.add("일본");
		tour.add("유럽");
		tour.add("방콕");
		tour.add("중국");
		tour.add("미국");
		System.out.println(tour);
		
		
		System.out.println("================================");
		HashMap place2 = new HashMap();
		place2.put("안방","TV");
		place2.put("거실","쇼파");
		place2.put("부엌","냉장고");
		place2.put("현관","신발");
		
		System.out.println(place2);
		System.out.println("현관에는 뭐가있나요?"+place2.get("현관"));
		place2.replace("거실", "책상");
		System.out.println(place2);
		
		System.out.println("================================");
		ArrayList list = new ArrayList();
		list.add("공부");
		list.add("게임");
		list.add("운동");
		list.add("산책");
		list.add("식사");
		
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(4));
		list.set(1, "청소");
		System.out.println(list);
		

	}

}
