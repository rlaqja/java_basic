package 생성자;

public class 마스크 {
	String color;
	int price;
	int count;
	
	public 마스크(String color, int price, int count) {
		this.color = color;
		this.price = price;
		this.count = count;
	}

	@Override
	public String toString() {
		return "마스크 [color=" + color + ", price=" + price + ", count=" + count + "]";
	}
	
	
}
