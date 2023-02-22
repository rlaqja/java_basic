package 인터페이스;

public class 컴퓨터사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppleComputer apl = new AppleComputer();
		BananaComputer ba = new BananaComputer();
	
		apl.컴퓨터사용하기();
		apl.컴퓨터업그레이드하기();
		ba.컴퓨터사용하기();
		ba.컴퓨터업그레이드하기();
	}

}
