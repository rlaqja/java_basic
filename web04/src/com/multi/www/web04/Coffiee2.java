package com.multi.www.web04;

public class Coffiee2 {

	String name;
	int price;
	public static Coffiee2 c1;

	public static Coffiee2 getInstance1() {
		if (c1 == null) {
			c1 = new Coffiee2("아메리카노", 50120);
		}
		return c1;
	}

	public static Coffiee2 c2;

	public static Coffiee2 getInstance() {
		if (c2 == null) {
			c2 = new Coffiee2("라떼", 1000);
		}
		return c2;
	}
	private Coffiee2() {
	}

	public Coffiee2(String name, int price) {
		this.name = name;
		this.price = price;
	}

	
//	@Override
//	public String toString() {
//		return "Coffiee2 [name=" + name + ", price=" + price + "]";
//	}

	
	 
	 

}
