package 생성자;

public class 컴퓨터 {
	int money;
	String brand;
	String size;
	

	
	public 컴퓨터(int money, String brand, String size) {
		this.money = money;
		this.brand = brand;
		this.size = size;
	}

	@Override
	public String toString() {
		return "컴퓨터 [money=" + money + ", brand=" + brand + ", size=" + size + "]";
	}
	
	
	
	
	
}
