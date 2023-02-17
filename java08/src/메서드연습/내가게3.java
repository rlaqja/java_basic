package 메서드연습;

public class 내가게3 {
	public static void main(String[] args) {
		계산기3 cal3 = new 계산기3();
		int price = 7000;
		int count1 = 5;
		int count2 = 4;
		
		int result1 = cal3.add(count1, count2);
		int result2 = cal3.minus(count1, count2);
		int result3 = cal3.mul(count1, price);
		int result4 = cal3.mul(count2, price);
		int result5 = cal3.add(result3, result4);
		int result6 = cal3.div(result5, result1);
		
		System.out.println("오늘 온 손님의 총 합:"+result1+"명");
		System.out.println("오전과 오후 손님수 차이: "+result2+"명");
		System.out.println("오전에 들어온 손님의 결제금액: "+result3+"원");
		System.out.println("오후에 들어온 손님의 결제금액:"+result4+"원");
		System.out.println("오전 오후 들어온 손님의 총 결제금액:"+result5+"원");
		System.out.println("1인당 결제금액은:"+result6+"원");
	}
	
}
