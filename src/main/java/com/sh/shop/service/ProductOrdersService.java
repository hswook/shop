package com.sh.shop.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sh.shop.domain.Product;
import com.sh.shop.domain.ProductOrders;
import com.sh.shop.domain.ProductOrdersExample;
import com.sh.shop.domain.ProductOrdersExample.Criteria;
import com.sh.shop.persistence.ProductOrdersMapper;

@Service
@Transactional
public class ProductOrdersService implements GenericService<ProductOrders>{

	@Autowired
	private ProductOrdersMapper mapper;
	
	@Override
	public Integer insert(ProductOrders entity) {
		return mapper.insertSelective(entity); 
	}

	@Override
	public Integer update(ProductOrders entity) {
		return mapper.updateByPrimaryKey(entity);
	}

	@Override
	public Integer updateSelective(ProductOrders entity) {
		return mapper.updateByPrimaryKeySelective(entity);
	}

	@Override
	public ProductOrders getById(Object key) {
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
	
	public List<ProductOrders> getByOrderIdAndProductId(BigDecimal orderId, BigDecimal productId) {
		ProductOrdersExample productOrdersExample = new ProductOrdersExample();
		Criteria criteria = productOrdersExample.createCriteria();
		criteria.andOrdersIdEqualTo(orderId)
				.andProductIdEqualTo(productId);
		return mapper.selectByExample(productOrdersExample);
	}
}
