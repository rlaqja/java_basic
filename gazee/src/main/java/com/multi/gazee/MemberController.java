package com.multi.gazee;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller 
public class MemberController {
	
	@Autowired
	MemberDAO dao; 
	
	@RequestMapping("login")
	public String login(MemberVO bag,HttpSession session,Model model) {
		System.out.println(bag);
		MemberVO result = dao.login(bag);
		if(result != null) {
			session.setAttribute("id", bag.getId());
			return "redirect:main.jsp";
		}else {
			model.addAttribute("result",0);
			return "redirect:member.jsp";
		}
	}
		
	@RequestMapping("insert")
	public String insert(MemberVO bag) {
		System.out.println(bag);
		dao.insert(bag);
		return "redirect:member.jsp";
	}

	@RequestMapping("delete")
	public void delete(String id) {
		System.out.println(id);
		dao.delete(id);
	}
	@RequestMapping("update")
	public void update(MemberVO bag) {
		System.out.println(bag);
		dao.update(bag);
	}
	@RequestMapping("one")
	public void one(String id, Model model) {
		System.out.println(id);
		MemberVO bag = dao.one(id);
		model.addAttribute("bag", bag);
	}

	@RequestMapping("one2")
	public void one2(String name, Model model) {
		System.out.println(name);
		MemberVO bag = dao.one2(name);
		model.addAttribute("bag", bag);
	}
	
	@RequestMapping("list")
	public void list(Model model) {
		List<MemberVO> list = dao.list();
		model.addAttribute("list", list);
	}
}