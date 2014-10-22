package com.sh.shop.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sh.shop.domain.Cart;
import com.sh.shop.domain.Orders;
import com.sh.shop.domain.OrdersExample;
import com.sh.shop.domain.OrdersExample.Criteria;
import com.sh.shop.domain.Product;
import com.sh.shop.persistence.OrdersMapper;

@Service
@Transactional
public class OrdersService implements GenericService<Orders>{
	
	@Autowired
	private OrdersMapper mapper;

	@Override
	public Integer insert(Orders entity) {
		return mapper.insertSelective(entity);
	}

	@Override
	public Integer update(Orders entity) {
		return mapper.updateByPrimaryKey(entity);
	}

	@Override
	public Integer updateSelective(Orders entity) {
		return mapper.updateByPrimaryKeySelective(entity);
	}

	@Override
	public Orders getById(Object key) {
		return mapper.selectByPrimaryKey((BigDecimal)key);
	}

	@Override
	public Integer getCountById(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer delete(Object key) {
		return mapper.deleteByPrimaryKey((BigDecimal)key);
	}
	
	public List<Orders> getByState(Object key) {
		OrdersExample ordersExample = new OrdersExample();
		Criteria criteria = ordersExample.createCriteria();
		if (!"".equals((String)key) && key != null)
			criteria.andStateEqualTo((String)key);
		return mapper.selectByExample(ordersExample);
	}
	
	public List<Orders> getByMemberEmail(String email) {
		OrdersExample ordersExample = new OrdersExample();
		Criteria criteria = ordersExample.createCriteria();
		criteria.andMemberEmailEqualTo(email);
		return mapper.selectByExample(ordersExample);
	}

	public List<Orders> getCartsByMemberEmail(String email) {
		OrdersExample ordersExample = new OrdersExample();
		Criteria criteria = ordersExample.createCriteria();
		criteria.andMemberEmailEqualTo(email)
				.andStateEqualTo("장바구니");
		return mapper.selectByExample(ordersExample);
	}
	
	public List<Cart> getCartsByOrdersId(Object key) {
		return mapper.selectCartsByOrdersKey((BigDecimal)key);
	}
	
	public List<Cart> getCarts(String email) {
		return mapper.selectCartsByMemberEmail(email);
	}

	public List<Cart> getPurchaseList(String email) {
		return mapper.selectPurchaseListByMemberEmail(email);
	}
}
