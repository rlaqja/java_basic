package com.multi.gazee.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Locale;

import javax.servlet.http.HttpSession;

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
	
	/*
	 * public MemberVO login(MemberVO bag) {
	 * 
	 * System.out.println("DAO가방"+bag); MemberVO result =
	 * gazee.selectOne("member.login", bag); System.out.println("DAO"+result);
	 * return result; }
	 */
	
	public MemberVO logincheck(String id) {
		
		MemberVO result = gazee.selectOne("member.logincheck", id);
		return result;
	}
	
	public void insert(MemberVO bag) {
		System.out.println(bag);
		gazee.insert("member.create", bag);
	}
	
	public void delete(String id) {
		gazee.delete("member.del", id);
	}
	
//	public void update(MemberVO bag) {
//		gazee.update("member.up", bag);
//	}
	
	public void tracknumber(MemberVO bag) {
		gazee.update("member.tracknumber", bag);
	}
	
	public MemberVO one(String id) {
	MemberVO vo = gazee.selectOne("member.one", id);
	System.out.println(vo);
	return vo;
	}
	
	public int seed(String id) {
		int seed = gazee.selectOne("member.seed", id);
		System.out.println(seed);
		return seed;
	}
	// 05-15 23:40 추가
	public List<OrderVO> purchslist(String id) {
		List<OrderVO> list = gazee.selectList("member.purchslist", id);
		System.out.println("DAO"+list.size());
		return list;
	}

	public List<OrderVO> selllist(String id) {
		List<OrderVO> list = gazee.selectList("member.selllist", id);
		System.out.println("DAO"+list.size());
		return list;
	}
	
	
	
	public List<OrderVO> basket(String id) {
		List<OrderVO> list = gazee.selectList("member.basket", id);
		System.out.println("DAO"+list.size());
		return list;
	}
	

//	public MemberVO one3(int seed) {
//		MemberVO vo = gazee.selectOne("member.one3", seed);
//		System.out.println(vo);
//		return vo;
//	}
	
	public MemberVO one2(String name) {
		MemberVO vo2 = gazee.selectOne("member.one2", name);
		System.out.println(vo2);
		return vo2;
	}
	
	public List<MemberVO> list() {
		List<MemberVO> list = gazee.selectList("member.all");
		System.out.println(list);
		return list;
	}
}
