package 인터페이스;

public class AppleComputer implements Computer {

	@Override
	public void 컴퓨터사용하기() {
		// TODO Auto-generated method stub
		System.out.println("리그오브레전드 실행.");
	}

	@Override
	public void 컴퓨터업그레이드하기() {
		// TODO Auto-generated method stub
		System.out.println("CPU업그레이드");
	}

}
