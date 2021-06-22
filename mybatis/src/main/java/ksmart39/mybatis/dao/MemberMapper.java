package ksmart39.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart39.mybatis.domain.Member;

@Mapper
public interface MemberMapper {

	//회원 목록 조회
	public List<Member> getMemberList();
}
