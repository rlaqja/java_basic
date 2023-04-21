package com.multi.mvc902;

//브라우저(클라이언트)가 입력해서 서버로 전송한 내용을 받는 역할 
public class OutputMessage extends Object {

	private String from;
	private String text;
	private String time;
	
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
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	@Override
	public String toString() {
		return "OutputMessage [from=" + from + ", text=" + text + ", time=" + time + "]";
	}
	
	
}
