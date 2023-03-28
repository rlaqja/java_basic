package com.multi.mvc01;

public class BbsVO {
	private String no;
	private String title;
	private String content;
	private String writer;
	
	
	//Getters/Setters만들어주세요.
	
	
	//toString도 만들어주세요.






	public String getNo() {
		return no;
	}





	@Override
	public String toString() {
		return "BbsVO [no=" + no + ", title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}





	public void setNo(String no) {
		this.no = no;
	}





	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}
}
