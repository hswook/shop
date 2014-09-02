package com.sh.shop.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sh.shop.domain.Member;
import com.sh.shop.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@Autowired
	private Member member;
	
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String loginForm(HttpServletRequest request, Model model) {
		return "login/form";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String loginProc(HttpServletRequest request, Model model) {
		
		return null;
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public void insertOrUpdateMember(HttpServletRequest request, Model model) {
		member.setEmail(request.getParameter("email"));
		member.setPw(request.getParameter("pw"));
		member.setName(request.getParameter("name"));

		Integer memCnt = memberService.getCountById(member.getEmail());
		if (memCnt == 0) {
			member.setType("M");
			member.setUseYn("Y");

			memberService.insert(member);
		} else {
			memberService.updateSelective(member);
		}
		
		System.out.println("member insert!");
	}
}
