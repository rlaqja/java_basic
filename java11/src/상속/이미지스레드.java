package 상속;

public class 이미지스레드 extends Thread {
		
	public void run() {
		String[] images = {"문상훈1.png","문상훈2.png","문상훈3.png","문엄마.png",
				"문상훈1.png","문상훈2.png","문상훈3.png","문엄마.png",
				"문상훈1.png","문상훈2.png","문상훈3.png","문엄마.png",
				"문상훈1.png","문상훈2.png","문상훈3.png","문엄마.png",
				"문상훈1.png","문상훈2.png","문상훈3.png","문엄마.png",
				"문상훈1.png","문상훈2.png","문상훈3.png","문엄마.png",
				"문상훈1.png","문상훈2.png","문상훈3.png","문엄마.png",
				"문상훈1.png","문상훈2.png","문상훈3.png","문엄마.png",
				"문상훈1.png","문상훈2.png","문상훈3.png","문엄마.png",
				"문상훈1.png","문상훈2.png","문상훈3.png","문엄마.png",};
				

		for (int i = 0; i < images.length; i++) {
			System.out.println("이런 메뉴 어떨까요>>" + images[i]);
			
			try {
				Thread.sleep(8000);
			} catch (Exception e) {
				System.out.println("cpu에 문제가 생겼음!");
			}
		}
	}
}
