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
	
	@RequestMapping(value = "{categoryId}", method = RequestMethod.GET)
	public String category(@PathVariable Integer categoryId, Model model) {
		BoardCategory boardCategory = boardCategoryService.getById(new BigDecimal(categoryId));
		List<BoardConfig> boardConfigs = boardConfigService.getsByCategory(boardCategory.getId());
		model.addAttribute("boardCategory", boardCategory);
		model.addAttribute("boardConfigs", boardConfigs);
		return "board/category";
	}
	
	@RequestMapping(value = "{categoryId}/{configId}")
	public String config(@PathVariable("categoryId") Integer categoryId
			, @PathVariable("configId") Integer configId
			, Model model) {
		BoardConfig boardConfig = boardConfigService.getById(new BigDecimal(configId));
		BoardCategory boardCategory = boardCategoryService.getById(boardConfig.getCategoryId());
		List<BoardPost> boardPosts = boardPostService.getsByConfig(boardConfig.getId());
		model.addAttribute("boardConfig", boardConfig);
		model.addAttribute("boardCategory", boardCategory);
		model.addAttribute("boardPosts", boardPosts);
		return "board/config";
	}

	@RequestMapping(value = "{categoryId}/{configId}/{postId}", method = RequestMethod.GET)
	public String post(@PathVariable("categoryId") Integer categoryId
			, @PathVariable("configId") Integer configId
			, @PathVariable("postId") Integer postId
			, Model model){
		BoardPost boardPost = boardPostService.getById(new BigDecimal(postId));
		BoardConfig boardConfig = boardConfigService.getById(boardPost.getConfigId());
		BoardCategory boardCategory = boardCategoryService.getById(boardConfig.getCategoryId());
		model.addAttribute("boardPost", boardPost);
		model.addAttribute("boardConfig", boardConfig);
		model.addAttribute("boardCategory", boardCategory);
		return "board/post";
	}
	
	@RequestMapping(value = "{categoryId}/{configId}/form", method = RequestMethod.GET)
	public String postInsertForm(@PathVariable("categoryId") Integer categoryId
			, @PathVariable("configId") Integer configId
			, HttpServletRequest request, HttpSession session, Model model) {
		if (session.getAttribute("member") == null) {
			System.out.println("!");
			model.addAttribute("message", "로그인 한 후에 글을 쓰실 수 있습니다.");
			return "forward:/board/"+categoryId+"/"+configId;
		}
		model.addAttribute("configId", request.getParameter("configId"));
		return "board/postForm";
	}

	@RequestMapping(value = "{categoryId}/{configId}/form", method = RequestMethod.POST)
	public String postInsert(@PathVariable("categoryId") Integer categoryId
			, @PathVariable("configId") Integer configId
			, HttpServletRequest request, HttpSession session, Model model) {
		BoardPost boardPost = new BoardPost();
		boardPost.setTitle(request.getParameter("title"));
		boardPost.setContent(request.getParameter("content"));
		boardPost.setMemberEmail(((Member)session.getAttribute("member")).getEmail());
		boardPost.setConfigId(new BigDecimal(configId));
		
		int result = boardPostService.insertSelective(boardPost);
		if (result > 0){
			model.addAttribute("message", "게시글을 등록하였습니다.");
		} else {
			model.addAttribute("message", "게시글을 등록에 실패하였습니.");
		}
		
		return "forward:/board/"+categoryId+"/"+configId;
	}

	@RequestMapping(value = "{categoryId}/{configId}/{postId}/form", method = RequestMethod.GET)
	public String postUpdateForm(@PathVariable("categoryId") Integer categoryId
			, @PathVariable("configId") Integer configId
			, @PathVariable("postId") Integer postId
			, Model model) {
		BoardPost boardPost = boardPostService.getById(new BigDecimal(postId));
		model.addAttribute("boardPost", boardPost);
		
		return "board/postForm";
	}

	@RequestMapping(value = "{categoryId}/{configId}/{postId}/form", method = RequestMethod.POST)
	public String postUpdate(@PathVariable("categoryId") Integer categoryId
			, @PathVariable("configId") Integer configId
			, @PathVariable("postId") Integer postId
			, HttpServletRequest request, HttpSession session, Model model) {
		BoardPost boardPost = new BoardPost();
		boardPost.setId(new BigDecimal(postId));
		boardPost.setTitle(request.getParameter("title"));
		boardPost.setContent(request.getParameter("content"));
		boardPost.setMemberEmail(((Member)session.getAttribute("member")).getEmail());
		
		int result = boardPostService.updateSelective(boardPost);
		if (result > 0){
			model.addAttribute("message", "게시글을 수정이 완료되였습니다.");
		} else {
			model.addAttribute("message", "게시글을 수정에 실패하였습니.");
		}

		return "forward:/"+categoryId+"/"+configId+"/"+postId;
	}
	
	@RequestMapping(value = "{categoryId}/{configId}/{postId}/delete", method = RequestMethod.GET)
	public String postDelete(@PathVariable("categoryId") Integer categoryId
			, @PathVariable("configId") Integer configId
			, @PathVariable("postId") Integer postId
			, Model model) {
		
		int result = boardPostService.delete(new BigDecimal(postId));
		if (result > 0){
			model.addAttribute("message", "게시글을 삭제하였습니다.");
		} else {
			model.addAttribute("message", "게시글 삭제에 실패하였습니.");
		}

		return "forward:/board/"+categoryId+"/"+configId;
	}
	
}