package com.sh.shop.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginForm(HttpServletRequest request, Model model) {
		if (request.getSession().getAttribute("member") != null) {
			model.addAttribute("message", "이미 로그인한 상태입니다..");
			return "forward:/";
		}
		
		return "member/login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginProc(HttpServletRequest request, Model model, HttpSession session) {
		Member member = memberService.getById(request.getParameter("email"));
		if (member == null) {
			model.addAttribute("message", "이메일이 존재하지 않습니다.");
			return "member/login";
		} else if (!member.getPw().equals(request.getParameter("pw"))){
			model.addAttribute("message", "패스워드가 일치하지 않습니다.");
			return "member/login";
		} else {
			session.setAttribute("member", member);
			return "forward:/";
		}
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request, Model model) {
		request.getSession().removeAttribute("member");
		
		return "forward:/";
	}

	
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String joinForm(HttpServletRequest request, Model model) {
		if (request.getSession().getAttribute("member") != null) {
			model.addAttribute("message", "로그아웃 이후에 회원가입 하실 수 있습니.");
			return "forward:/";
		}

		return "member/join";
	}

	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String joinProc(HttpServletRequest request, Model model) {
		
		System.out.println(request.getParameter("name"));
		System.out.println(request.getParameter("email"));
		System.out.println(request.getParameter("pw"));

		Member member = memberService.getById(request.getParameter("email"));
		if (member != null) {
			model.addAttribute("message", "이미 존재하는 이메일입니다.");
			return "member/join";
		} else {
			member = new Member();
			member.setEmail(request.getParameter("email"));
			member.setName(request.getParameter("name"));
			member.setPw(request.getParameter("pw"));
			
			int result = memberService.insertSelective(member);
			
			System.out.println(result);
			
			if (result > 0 ) {
				model.addAttribute("message", "회원가입이 완료되었습니다.");
				return "/member/login";
			} else {
				model.addAttribute("message", "오류가 발생하였습니다.");
				return "member/join";
			}
		}
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public void insertOrUpdateMember(HttpServletRequest request, Model model) {
		Member member = new Member();
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
