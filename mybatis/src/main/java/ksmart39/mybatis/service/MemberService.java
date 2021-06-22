package ksmart39.mybatis.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart39.mybatis.dao.MemberMapper;
import ksmart39.mybatis.domain.Member;

@Service
public class MemberService {
	/**
	 * 필드 주입방식 (DI)
	 * MemberMapper memberMapper = new MemberMapper();
	 * setter 메소드 memberMapper
	 * 생성자메소드 memberMapper
	 */
	@Autowired
	private MemberMapper memberMapper;

	@PostConstruct
	public void memberServiceInit() {
		System.out.println("====================================");
		System.out.println("MemberService 객체 생성");
		System.out.println("====================================");
	}
	
	public List<Member> getMemberList(){
		
		List<Member> memberList = memberMapper.getMemberList();
		
		return memberList;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
