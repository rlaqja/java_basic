package com.multi.gazee.member;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import org.mindrot.jbcrypt.BCrypt;

@Controller 
public class MemberController {
	
	@Autowired
	MemberDAO dao; 
	
	
	//비밀번호 암호화
	@RequestMapping("member/login")
	
	public String login(@RequestParam("id") String id,@RequestParam("pw")String pw, HttpSession session) {
		MemberVO check = dao.logincheck(id);
		System.out.println(id);
		System.out.println(pw);
		System.out.println(check);
		
		String hasedpw = check.getPw();
		if (check != null) {
			if (BCrypt.checkpw(pw, hasedpw) == true) {
				session.setAttribute("id", check.getId());
				session.setAttribute("nickname",check.getNickname());				
				return "redirect:mypage.jsp";
			}else {
				return "redirect:member.jsp";
			}
		}else {
			return "redirect:member.jsp";
		}
	}	

		
		/*
		 * MemberVO result = dao.login(id2); if (result != null) { return "ok"; } else {
		 * return "no"; }
		 */
	

	
	@RequestMapping("member/insert")
	public String insert(MemberVO bag) {
		System.out.println("멤버컨트롤러"+bag);
		Bcrypt bcry = new Bcrypt();
		
		String pw = bag.getPw();
		String bcryPw = bcry.encrypt(pw);
		bag.setPw(bcryPw);
		dao.insert(bag);	
				
		return "redirect:member.jsp";
	}
	
	@RequestMapping("member/delete")
	public void delete(String id) {
		System.out.println(id);
		dao.delete(id);
	}
//	@RequestMapping("member/update")
//	public void update(MemberVO bag) {
//		System.out.println(bag);
//		dao.update(bag);
//	}
	
	@RequestMapping("member/update")
	public void tracknumber(MemberVO bag) {
		System.out.println(bag);
		dao.tracknumber(bag);
	}
	@RequestMapping("member/one")
	public void one(String id, Model model) {
		System.out.println(id);
		MemberVO bag = dao.one(id);
		model.addAttribute("bag", bag);
	}
//	@RequestMapping("member/one3")
//	public void one3(int seed, Model model,HttpSession session) {
//		System.out.println(seed);
//		MemberVO bag = dao.one3(seed);
//		System.out.println(bag);
//		model.addAttribute("bag", bag);
//		session.setAttribute("seed",bag.getSeed());
//	}

	@RequestMapping("member/one2")
	public void one2(String name, Model model) {
		System.out.println(name);
		MemberVO bag = dao.one2(name);
		model.addAttribute("bag", bag);
	}
	
//	@RequestMapping("member/mypage")
//	public void mypage(Model model,HttpSession session) {
//		String id = (String)session.getAttribute("id");
//		int seed = dao.seed(id);
//		model.addAttribute("seed", seed);
//		
//		//구매목록
////		String buy = (String)session.getAttribute("id");
////		String list = dao.
//		
//		
//		//판매목록
//	}
	
	@RequestMapping("member/seed")
	public void seed(String id, Model model,HttpSession session) {
		int seed = dao.seed(id);
		List<OrderVO> list = dao.purchslist(id);
		List<OrderVO> list2 = dao.purchslist(id);
		System.out.println(seed);
		System.out.println(list);
		System.out.println(list2);
		model.addAttribute("seed", seed);
		model.addAttribute("purchslist", list);
		model.addAttribute("selllist", list2);
	}
	
	@RequestMapping("member/list")
	public void list(Model model) {
		List<MemberVO> list = dao.list();
		model.addAttribute("list", list);
	}
	
	// 05-15 23:40 add
	@RequestMapping("member/purchslist")
	public void purchslist(String id,Model model) {
		
		List<OrderVO> list = dao.purchslist(id);
		System.out.println("컨트롤러"+list.size());
		
		model.addAttribute("purchslist", list);
	}
	
	@RequestMapping("member/selllist")
	public void selllist(String id,Model model) {
		
		List<OrderVO> list = dao.purchslist(id);
		System.out.println("컨트롤러sell"+list.size());
		
		model.addAttribute("selllist", list);
	}
	
	@RequestMapping("member/basket")
	public String basket(String id,Model model) {
		List<OrderVO> list = dao.purchslist(id);
		System.out.println("컨트롤러sell"+list.size());
		model.addAttribute("list", list);
		
		return "member/basket";
	}
}