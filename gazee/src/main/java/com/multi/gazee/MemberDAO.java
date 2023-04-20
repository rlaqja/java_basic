package com.multi.gazee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Locale;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sun.org.apache.xpath.internal.operations.Mult;
import java.util.*;
//import 화면DB연결.MemberVO;
//스프링에 dao는 싱글톤으로 하나만 만들어서 사용할게!라고 설정해야함.
//2가지방법을 할 수 있음.
//어노테이션(표시)방법, XML방법
@Component
public class MemberDAO { // CRUD
//특정한 방법으로 실행하는 클래스(model, 방법) 
	
	@Autowired
	SqlSessionTemplate gazee;
	
	public void insert(MemberVO bag) {
		gazee.insert("member.create", bag);
	}
	
	public void delete(String id) {
		gazee.delete("member.del", id);
	}
	
	public void update(MemberVO bag) {
		gazee.update("member.up", bag);
	}

	public MemberVO one(String id) {
	MemberVO vo = gazee.selectOne("member.one", id);
	System.out.println(vo);
	return vo;
	}
	
	public List<MemberVO> list() {
		List<MemberVO> list = gazee.selectList("member.all");
		System.out.println(list.size());
		return list;
	}
}
