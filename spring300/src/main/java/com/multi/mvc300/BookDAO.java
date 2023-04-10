package com.multi.mvc300;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//import 화면DB연결.BookVO;
//import 화면DB연결.BookVO;
//import java.sql.PreparedStatement;
//테이블 하나당 DAO 하나! ==>
@Component
public class BookDAO 
{
	@Autowired
	SqlSessionTemplate my;
	
	public List<BookVO> all() {
		return my.selectList("book.all");

	}
	
	public int insert(BookVO bag) {
	System.out.println("-----"+my);
	int result = my.insert("book.create", bag);
	return result;
	}
	public int update(BookVO bag) {
		System.out.println("-----"+my);
		int result = my.update("book.up", bag);
		return result;
	}
	public int delete(int id) {
		System.out.println("-----"+my);
		int result = my.delete("book.del", id);
		return result;
	}
	
	public BookVO one(int id) {
		BookVO bag = my.selectOne("book.one", id);
		return bag;
	}
}