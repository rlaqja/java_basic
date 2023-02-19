package 생성자;

public class 수강신청 {
	int nu;
	String su;
	String time;
	String name;
	public 수강신청(int nu, String su, String time, String name) {

		this.nu = nu;
		this.su = su;
		this.time = time;
		this.name = name;
	}
	@Override
	public String toString() {
		return "수강신청 [nu=" + nu + ", su=" + su + ", time=" + time + ", name=" + name + "]";
	}
	
	

	
}
