package com.sh.shop.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sh.shop.domain.Cart;
import com.sh.shop.domain.Member;
import com.sh.shop.domain.Orders;
import com.sh.shop.domain.Product;
import com.sh.shop.domain.ProductOrders;
import com.sh.shop.service.OrdersService;
import com.sh.shop.service.ProductOrdersService;
import com.sh.shop.service.ProductService;

@Controller
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrdersService ordersService;
	
	@Autowired
	private ProductOrdersService productOrdersService;
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("{productId}/now")
	public String orderNow(@PathVariable("productId") Integer productId
			, Model model, HttpServletRequest request, HttpSession session) {
		
		Member member = (Member)session.getAttribute("member");
		if (member == null) {
			// 세션에 회원정보 없을 경우 예외 처리. 나중에 SpringSecurity 로 대체
		}
		
		Product product = productService.getById(new BigDecimal(productId));
		
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		int orderPrice = product.getPrice().intValue(); // 나중에 할인율 같은 정책이 적용되면 바뀜
		int totalPrice = orderPrice * quantity;
		
		Orders orders = new Orders();
		orders.setMemberEmail(member.getEmail());
		orders.setState("배송준비");
		orders.setTotalPrice(new BigDecimal(totalPrice));
		int ordersId = ordersService.insert(orders);
		System.out.println(ordersId);
		
		ProductOrders productOrders = new ProductOrders();
		productOrders.setOrderPrice(new BigDecimal(orderPrice));
		productOrders.setOrdersId(new BigDecimal(ordersId));
		productOrders.setProductId(new BigDecimal(productId));
		productOrders.setQuantity(new BigDecimal(quantity));
		int result = productOrdersService.insert(productOrders);
		
		return "";
	}
	
	@RequestMapping("cart")
	public String showCart( Model model
			, HttpServletRequest request
			, HttpSession session) {
		
		Member member = (Member) session.getAttribute("member");
		if (member == null) {
			model.addAttribute("message", "로그인 후에 사용하실 수 있습니다.");
			return "member/login";
		}
		
		List<Cart> cartList = ordersService.getCarts(member.getEmail());
		List<Orders> ordersList = ordersService.getCartsByMemberEmail(member.getEmail());

		if (ordersList != null && ordersList.size() > 0)
			model.addAttribute("orders", ordersList.get(0));
		model.addAttribute("cartList", cartList);
		return "order/cart";
	}
	
	@RequestMapping(value = "cart", method = RequestMethod.POST)
	public String addToCart( Model model
			, HttpServletRequest request
			, HttpSession session) {
		
		Member member = (Member) session.getAttribute("member");
		if (member == null) {
			model.addAttribute("message", "로그인 후에 사용하실 수 있습니다.");
			return "member/login";
		}
		
		BigDecimal productId = new BigDecimal(Integer.parseInt(request.getParameter("productId")));
		BigDecimal quantity = new BigDecimal(Integer.parseInt(request.getParameter("quantity")));
		Product product = productService.getById(productId);

		//멤버 이메일로 장바구니 가져옴
		List<Cart> cartList = ordersService.getCarts(member.getEmail());
		Orders orders = new Orders();
		
		if (cartList == null || cartList.size() == 0) {
			//만약 기존 장바구니 없을 경우 모두 새로 만듬
			orders = new Orders();
			orders.setMemberEmail(member.getEmail());
			orders.setState("장바구니");
			orders.setTotalPrice(product.getPrice().multiply(quantity));
			int result = ordersService.insert(orders);
			
			orders = ordersService.getByMemberEmail(member.getEmail()).get(0);
			
			ProductOrders productOrders = new ProductOrders();
			productOrders.setOrdersId(orders.getId());
			productOrders.setProductId(productId);
			productOrders.setOrderPrice(product.getPrice());
			productOrders.setQuantity(quantity);
			result = productOrdersService.insert(productOrders);
		} else {
			//만약 장바구니 있을 경우, 기존 장바구니에 총금액만 일단 업데이트 함
			orders = ordersService.getCartsByMemberEmail(member.getEmail()).get(0);
			orders.setTotalPrice(orders.getTotalPrice().add(product.getPrice()));
			int result = ordersService.updateSelective(orders);
			
			//기존 장바구니 안에 현재 선택된 상품이 있나 체크하기 위해.
			List<ProductOrders> productOrdersList = productOrdersService.getByOrderIdAndProductId(orders.getId(), productId);
			if (productOrdersList == null || productOrdersList.size() == 0) {
				//기존 장바구니 안에 현재 선택된 상품이 없으면 새로 넣음
				ProductOrders productOrders = new ProductOrders();
				productOrders.setOrdersId(orders.getId());
				productOrders.setProductId(productId);
				productOrders.setOrderPrice(product.getPrice());
				productOrders.setQuantity(quantity);
				result = productOrdersService.insert(productOrders);
			} else {
				//있으면 수량만 더해서 업데이트
				ProductOrders productOrders = productOrdersList.get(0);
				productOrders.setQuantity(productOrders.getQuantity().add(quantity));
				result = productOrdersService.updateSelective(productOrders);
			}
		}
		
		cartList = ordersService.getCarts(member.getEmail());
		
		model.addAttribute("cartList", cartList);
		model.addAttribute("orders", orders);
		return "order/cart";
	}
	
	@RequestMapping(value="{ordersId}/purchase", method=RequestMethod.POST)
	public String purchase(@PathVariable("ordersId") Integer ordersId
			, Model model
			, HttpServletRequest request
			, HttpSession session) {
		
		Member member = (Member) session.getAttribute("member");
		if (member == null) {
			model.addAttribute("message", "로그인 후에 사용하실 수 있습니다.");
			return "member/login";
		}
		
		Orders orders = ordersService.getById(new BigDecimal(ordersId));
		orders.setState("주문접수");
		
		int result = ordersService.updateSelective(orders);
		if (result > 0)
			model.addAttribute("message", "주문 접수가 완료되었습니다.");
		else
			model.addAttribute("message", "주문에 실패하였습니다.");
		
		List<Cart> purchaseList = ordersService.getPurchaseList(member.getEmail());
		model.addAttribute("purchaseList", purchaseList);
		
		return "order/purchaseList";
	}
	
	@RequestMapping(value="purchase")
	public String purchaseList(Model model
			, HttpSession session) {

		Member member = (Member) session.getAttribute("member");
		if (member == null) {
			model.addAttribute("message", "로그인 후에 사용하실 수 있습니다.");
			return "member/login";
		}

		List<Cart> purchaseList = ordersService.getPurchaseList(member.getEmail());
		model.addAttribute("purchaseList", purchaseList);
		
		return "order/purchaseList";
	}
	
}
