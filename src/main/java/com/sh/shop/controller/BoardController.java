package com.sh.shop.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sh.shop.domain.BoardCategory;
import com.sh.shop.domain.BoardCategoryExample;
import com.sh.shop.domain.BoardConfig;
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
	private BoardPostService BoardPostService;
	
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
	
	@RequestMapping(value = "category/{categoryId}/{configId}", method = RequestMethod.GET)
	public String config(@PathVariable("categoryId") Integer categoryId, @PathVariable("configId") Integer configId, Model model) {
		BoardConfig boardConfig = boardConfigService.getById(new BigDecimal(configId));
		BoardCategory boardCategory = boardCategoryService.getById(boardConfig.getCategoryId());
		List<BoardConfig> boardConfigs = boardConfigService.getsByCategory(boardConfig.getCategoryId());
		model.addAttribute("boardConfig", boardConfig);
		model.addAttribute("boardCategory", boardCategory);
		model.addAttribute("boardConfigs", boardConfigs);
		return "board/category";
	}
}