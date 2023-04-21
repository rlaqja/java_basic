package com.multi.mvc902;

//브라우저(클라이언트)가 입력해서 서버로 전송한 내용을 받는 역할 
public class OutputMessage2 extends Object {

	private String from;
	private String text;
	private String menu;
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	
	@Override
	public String toString() {
		return "OutputMessage2 [from=" + from + ", text=" + text + ", menu=" + menu + "]";
	}
	
	
}
