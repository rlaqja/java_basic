package 상속;

import java.util.Date;

public class 타이머스레드 extends Thread {
		
	@Override
	public void run() {
		for (int i = 1000; i > 0; i--) {
			Date data = new Date();
			System.out.println("지금 몇시지? 배고픈데" + data);
			try {
				Thread.sleep(8000);
			} catch (Exception e) {
				System.out.println("내 배에 문제가 생겼음!");
			}
		}
	}
}
