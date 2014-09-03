package com.sh.shop.controller;

import java.math.BigDecimal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sh.shop.domain.BoardCategory;
import com.sh.shop.domain.BoardCategoryExample;
import com.sh.shop.domain.BoardConfig;
import com.sh.shop.domain.BoardPost;
import com.sh.shop.domain.Member;
import com.sh.shop.service.BoardCategoryService;
import com.sh.shop.service.BoardConfigService;
import com.sh.shop.service.BoardFileService;
import com.sh.shop.service.BoardPostService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardCategoryService boardCategoryService;
	
	@Autowired
	private BoardConfigService boardConfigService;
	
	@Autowired
	private BoardPostService boardPostService;
	
	@Autowired
	private BoardFileService BoardFileService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String main(Model model) {
		List<BoardCategory> boardCategories = boardCategoryService.gets();
		model.addAttribute("boardCategories", boardCategories);
		return "board/main";	
	}
	
	@RequestMapping(value = "category/{id}", method = RequestMethod.GET)
	public String category(@PathVariable Integer id, Model model) {
		BoardCategory boardCategory = boardCategoryService.getById(new BigDecimal(id));
		List<BoardConfig> boardConfigs = boardConfigService.getsByCategory(boardCategory.getId());
		model.addAttribute("boardCategory", boardCategory);
		model.addAttribute("boardConfigs", boardConfigs);
		return "board/category";
	}
	
	@RequestMapping(value = "config/{id}", method = RequestMethod.GET)
	public String config(@PathVariable Integer id, Model model) {
		BoardConfig boardConfig = boardConfigService.getById(new BigDecimal(id));
		List<BoardPost> boardPosts = boardPostService.getsByConfig(boardConfig.getId());
		model.addAttribute("boardConfig", boardConfig);
		model.addAttribute("boardPosts", boardPosts);
		return "board/config";
	}
	
	@RequestMapping(value = "post/{id}", method = RequestMethod.GET)
	public String post(@PathVariable Integer id, Model model){
		BoardPost boardPost = boardPostService.getById(new BigDecimal(id));
		model.addAttribute("boardPost", boardPost);
		return "board/post";
	}
	
	@RequestMapping(value = "post/form", method = RequestMethod.GET)
	public String postInsertForm(HttpServletRequest request, HttpSession session, Model model) {
		if (session.getAttribute("member") == null) {
			model.addAttribute("message", "로그인 한 후에 글을 쓰실 수 있습니다.");
			return "forward:/board/config/"+request.getParameter("configId");
		}
		model.addAttribute("configId", request.getParameter("configId"));
		return "board/postForm";
	}

	@RequestMapping(value = "post/form", method = RequestMethod.POST)
	public String postInsert(HttpServletRequest request, HttpSession session, Model model) {
		System.out.println(request.getParameter("title"));
		System.out.println(request.getParameter("content"));
		System.out.println(((Member)session.getAttribute("member")).getEmail());
		System.out.println(new BigDecimal(Integer.parseInt(request.getParameter("configId"))));
		
		BoardPost boardPost = new BoardPost();
		boardPost.setTitle(request.getParameter("title"));
		boardPost.setContent(request.getParameter("content"));
		boardPost.setMemberEmail(((Member)session.getAttribute("member")).getEmail());
		boardPost.setConfigId(new BigDecimal(Integer.parseInt(request.getParameter("configId"))));
		
		int result = boardPostService.insertSelective(boardPost);
		if (result > 0){
			model.addAttribute("message", "게시글을 등록하였습니다.");
		} else {
			model.addAttribute("message", "게시글을 등록에 실패하였습니.");
		}
		
		return "forward:/board/config/"+boardPost.getConfigId();
	}

	@RequestMapping(value = "post/{id}/form", method = RequestMethod.GET)
	public String postUpdateForm(@PathVariable Integer id, Model model) {
		BoardPost boardPost = boardPostService.getById(new BigDecimal(id));
		model.addAttribute("boardPost", boardPost);
		
		return "board/postForm";
	}

	@RequestMapping(value = "post/{id}/form", method = RequestMethod.POST)
	public String postUpdate(@PathVariable Integer id, HttpServletRequest request, HttpSession session, Model model) {
		BoardPost boardPost = new BoardPost();
		boardPost.setId(new BigDecimal(id));
		boardPost.setTitle(request.getParameter("title"));
		boardPost.setContent(request.getParameter("content"));
		boardPost.setMemberEmail(((Member)session.getAttribute("member")).getEmail());
		
		int result = boardPostService.updateSelective(boardPost);
		if (result > 0){
			model.addAttribute("message", "게시글을 수정이 완료되였습니다.");
		} else {
			model.addAttribute("message", "게시글을 수정에 실패하였습니.");
		}

		return "forward:/board/post/"+id;
	}
	
	@RequestMapping(value = "post/{id}/delete", method = RequestMethod.GET)
	public String postDelete(@PathVariable Integer id, Model model) {

		return "forward:/board/config/"+id;
	}
}