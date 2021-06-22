package ksmart39.mybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart39.mybatis.domain.Member;
import ksmart39.mybatis.service.MemberService;

@Controller
public class MemberController {

	/**
	 * 필드 주입방식 (DI)
	 * MemberService memberService = new MemberService();
	 * 
	 * setter 주입방식
	 * setter 메소드 memberService
	 * 
	 * 생성자메소드 주입방식
	 * 생성자메소드 memberService
	 */
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/memberList")
	public String getMemberList(Model model) {
		
		List<Member> memberList = memberService.getMemberList();
		
		System.out.println("=========================================");
		System.out.println("memberList : " + memberList);
		System.out.println("=========================================");
		
		model.addAttribute("title", "회원목록");
		model.addAttribute("memberList", memberList);
		
		return "member/memberList";
	}
}
