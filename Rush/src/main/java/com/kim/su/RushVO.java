package com.kim.su;

public class RushVO {
	
	private String id;
	private String phone;
	private String name;
	private int age;
	
	public RushVO(String id,String phone,String name,int age) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.age = age;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "RushVO [id=" + id + ", name=" + name + ", phone=" + phone + ", age=" + age + "]";
	}
	
	
	
}
