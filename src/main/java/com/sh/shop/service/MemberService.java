package com.sh.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sh.shop.domain.Member;
import com.sh.shop.persistence.MemberMapper;

@Service
@Transactional
public class MemberService {
	
	@Autowired
	private MemberMapper memberMapper;
	
	public Integer insert(Member member) {
		return memberMapper.insert(member);
	}

	public Integer insertSelective(Member member) {
		return memberMapper.insertSelective(member);
	}

	public Integer update(Member member) {
		return memberMapper.updateByPrimaryKey(member);
	}
	
	public Integer updateSelective(Member member) {
		return memberMapper.updateByPrimaryKeySelective(member);
	}
	
	@Transactional(readOnly = true)
	public Member getById(String email) {
		return memberMapper.selectByPrimaryKey(email);
	}
	
	@Transactional(readOnly = true)
	public Integer getCountById(String email) {
		return memberMapper.getCountById(email);
	}

	
//	@Transactional(readOnly = true)
//	public List<Member> getListByContext(SearchContext searchContext) {
//		searchContext.calculateRowNum();
//		
//		List<Member> memberList = memberMapper.getListByContext(searchContext);
//		
//		if (memberList != null && memberList.size() > 0) {
//			searchContext.setP_totalcount(memberList.get(0).getCnt());
//		}
//		
//		return memberList;
//	}

}
