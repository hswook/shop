package com.sh.shop.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.jsoup.Connection.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.sh.shop.domain.BoardCategory;
import com.sh.shop.domain.Product;
import com.sh.shop.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@RequestMapping(value = "")
	public String listAll(Model model) {
		List<Product> productList = productService.getByType("");
		model.addAttribute("productList", productList);
		model.addAttribute("type", "all");
		return "product/list";	
	}

	@RequestMapping(value = "{type}")
	public String listByType(@PathVariable String type
			, Model model) {
		List<Product> productList = productService.getByType(type.equals("all") ? "" : type);
		model.addAttribute("productList", productList);
		model.addAttribute("type", type);
		return "product/list";	
	}
	
	@RequestMapping(value = "{type}/{productId}")
	public String detail(@PathVariable("type") String type
			, @PathVariable("productId") Integer productId
			, Model model) {
		Product product = productService.getById(new BigDecimal(productId));
		product.setContent(product.getContent().replaceAll("~!@", "\""));
		model.addAttribute("type", type);
		model.addAttribute("product", product);
		return "product/detail";
	}
	
	@RequestMapping(value = "form", method = RequestMethod.GET)
	public String insertProductForm() {
		
		return "product/productForm";
	}

	@RequestMapping(value = "form", method = RequestMethod.POST)
	public String insertProduct(@RequestParam MultipartFile mainImg
			, HttpServletRequest request, HttpSession session, Model model) throws IOException {
		
		String mainImgFileName = mainImg.getOriginalFilename();
		String basePath = request.getServletContext().getRealPath("/");
		String filePath = basePath + File.separator + "upload" + File.separator + "product" + File.separator;
		
		File file = new File(filePath);
		if(!file.exists()) {
			file.mkdirs();
		}
		///////////////// 서버에 파일쓰기 ///////////////// 
		byte[] bytes = mainImg.getBytes();
		
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath + mainImgFileName));
		bos.write(bytes);
		bos.flush();
		bos.close();
		///////////////// 서버에 파일쓰기 /////////////////
		
		Product product = new Product();
		product.setName(request.getParameter("name"));
		product.setPrice(new BigDecimal(request.getParameter("price")));
		product.setMainImg(mainImgFileName);
		product.setContent(request.getParameter("content").replaceAll("\"", "~!@"));
		product.setType(request.getParameter("type"));
		
		int result = productService.insertSelective(product);
		if (result > 0){
			model.addAttribute("message", "상품 등록하였습니다.");
		} else {
			model.addAttribute("message", "상품 등록에 실패하였습니.");
		}

		
		return "forward:/product/" + product.getType();
	}
	
	@RequestMapping(value = "{productId}/form")
	public String updateProductForm(@PathVariable("productId") Integer productId
			, Model model) {
		Product product = productService.getById(new BigDecimal(productId));
		product.setContent(product.getContent().replaceAll("~!@", "'"));
		
		model.addAttribute("product", product);
		
		return "product/productForm";
	}
	
	@RequestMapping(value = "{productId}/form", method=RequestMethod.POST)
	public String updateProduct(@PathVariable("productId") Integer productId
			, @RequestParam MultipartFile mainImg
			, HttpServletRequest request, HttpSession session, Model model) throws IOException {
		
		String mainImgFileName = "";
		if (mainImg != null && !mainImg.isEmpty()) {
			mainImgFileName = mainImg.getOriginalFilename();
			String basePath = request.getServletContext().getRealPath("/");
			String filePath = basePath + File.separator + "upload" + File.separator + "product" + File.separator;
			
			File file = new File(filePath);
			if(!file.exists()) {
				file.mkdirs();
			}
			///////////////// 서버에 파일쓰기 ///////////////// 
			byte[] bytes = mainImg.getBytes();
			
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath + mainImgFileName));
			bos.write(bytes);
			bos.flush();
			bos.close();
			///////////////// 서버에 파일쓰기 /////////////////
		}
		
		Product product = new Product();
		product.setId(new BigDecimal(productId));
		product.setName(request.getParameter("name"));
		product.setPrice(new BigDecimal(request.getParameter("price")));
		if (!"".equals(mainImgFileName))
			product.setMainImg(mainImgFileName);
		product.setContent(request.getParameter("content").replaceAll("\"", "~!@"));
		product.setType(request.getParameter("type"));
		
		int result = productService.updateSelective(product);
		if (result > 0){
			model.addAttribute("message", "상품을 수정하였습니다.");
		} else {
			model.addAttribute("message", "상품 수정에 실패하였습니.");
		}
		
		product = productService.getById(new BigDecimal(productId));
		product.setContent(product.getContent().replaceAll("~!@", "\""));
		model.addAttribute("type", product.getType());
		model.addAttribute("product", product);
		return "product/detail";
	}

	@RequestMapping(value = "{productId}/delete")
	public String deleteProduct(@PathVariable("productId") Integer productId
			, Model model) {
		
		int result = productService.delete(new BigDecimal(productId));
		if (result > 0){
			model.addAttribute("message", "상품을 삭제하였습니다.");
		} else {
			model.addAttribute("message", "상품 삭에 실패하였습니다.");
		}		
		
		return "forward:/product";
	}
}
