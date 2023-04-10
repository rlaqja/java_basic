package com.multi.mvc300;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
	
	@Autowired
	BookDAO dao;//100
	@RequestMapping("list3")
	public void all(Model model) {
		List<BookVO> list = dao.all();
		model.addAttribute("list", list);
	}
	
//	@RequestMapping("one3.multi")
//	public void one3(String id, Model model) {
//		BookVO bag =  dao.one(id); //bag에 검색결과가 들어있을 것임.
//		model.addAttribute("bag", bag);
//	}
//	@RequestMapping("list3")
//	public void list3(Model model) {
//		ArrayList<BookVO> list = dao.list();
//		model.addAttribute("list", list);
//	}
	@RequestMapping("insert3.multi")
	public void list3(BookVO bag) {
		System.out.println("insert요청");
		System.out.println(bag);
		System.out.println(dao);
		dao.insert(bag);
		
	}
	@RequestMapping("update3.multi")
	public void update(BookVO bag) {
		System.out.println("insert요청");
		System.out.println(bag);
		System.out.println(dao);
		dao.update(bag);
		
	}
	@RequestMapping("delete3.multi")
	public void delete(int id) {
		System.out.println("insert요청");
		System.out.println(id);
		System.out.println(dao);
		dao.delete(id);
		
	}
	@RequestMapping("one3.multi")
	public void one(int id,Model model) {
		System.out.println("one요청");
		System.out.println(id);
		System.out.println(dao);
		BookVO bag = dao.one(id);
		model.addAttribute("bag", bag);
	}
}
