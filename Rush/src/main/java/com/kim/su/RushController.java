package com.kim.su;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kim.su.mapper.MemberMapper;

@RestController
public class RushController {
	
	private MemberMapper mapper;
	
	public RushController(MemberMapper mapper) {
		this.mapper = mapper;
	}
	
	@GetMapping("/member/{id}")
	public RushVO getmember(@PathVariable("id") String id) {
		return mapper.getMember(id);
	}
	
	@GetMapping("/member/all")
	public List<RushVO> getMemberList(){
		return mapper.getMemberList();
	}
	
	@PutMapping("/member/{id}")
	public void PutMember(@PathVariable("id")String id,@RequestParam("name") String name,@RequestParam("phone") String phone,@RequestParam("age") int age) {
		mapper.insertMember(id, phone, name, age);
	}
	@PostMapping("/member/{id}")
	public void postMember(@PathVariable("id")String id,@RequestParam("name") String name,@RequestParam("phone") String phone,@RequestParam("age") int age) {
		mapper.updatemember(id, phone, name, age);
	}
	
	@DeleteMapping("/member/{id}")
	public void deleteMember(@PathVariable("id") String id) {
		mapper.deletemember(id);
	}
	
		
}
