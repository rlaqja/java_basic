package 생성자;

public class 티비 {
	
	public int ch;
	public int vol;
	public boolean onOff;
	
//	public 티비() {
//		System.out.println("TV객체가 하나 생성됨.");
//	}
//	public 티비(int x,int y ,boolean z) {
//		ch=x;
//		vol=y;
//		onOff=z;
//	}

	public 티비(int ch, int vol, boolean onOff) {
		super();
		this.ch = ch;
		this.vol = vol;
		this.onOff = onOff;
	}

	public void 채널을_바꾸다() {
		int change =1;
		System.out.println(ch+"에서"+change +"로 꾸다.");
	}
	
	public void 유튜브() {
		System.out.println(vol +"을 키워서 동영상을 보다.");
	}
	
}
