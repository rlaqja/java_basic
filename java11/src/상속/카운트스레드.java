package 상속;

public class 카운트스레드 extends Thread {
		
	public void run() {
		for (int i = 0; i <50; i++) {
			System.out.println("몇개시킬까??"+ i +"개");
			
			try {
				Thread.sleep(6000);
			} catch (Exception e) {
				System.out.println("cpu에 문제가 생겼음!");
			}
		}
	}
}
