package com.multi.www.web04;

public class Car {
	
	String color;
	int price;
	int speed;
	
	
	
	public Car(String color, int price, int speed) {
		this.color = color;
		this.price = price;
		this.speed = speed;
	}
	
	
	
	@Override
	public String toString() {
		return "Car [color=" + color + ", price=" + price + ", speed=" + speed + "]";
	}
	
	
	
	
	
	
}	
