package com.sh.shop.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sh.shop.domain.Product;
import com.sh.shop.domain.ProductExample;
import com.sh.shop.domain.ProductExample.Criteria;
import com.sh.shop.persistence.ProductMapper;

@Service
@Transactional
public class ProductService implements GenericService<Product>{
	
	@Autowired
	private ProductMapper mapper;

	@Override
	public Integer insert(Product entity) {
		return mapper.insert(entity);
	}
	
	public Integer insertSelective(Product entity) {
		return mapper.insertSelective(entity);
	}

	@Override
	public Integer update(Product entity) {
		return mapper.updateByPrimaryKey(entity);
	}

	@Override
	public Integer updateSelective(Product entity) {
		return mapper.updateByPrimaryKeySelective(entity);
	}

	@Override
	public Product getById(Object key) {
		return mapper.selectByPrimaryKey((BigDecimal)key);
	}
	
	@Override
	public Integer getCountById(Object key) {
		return null;
	}

	@Override
	public Integer delete(Object key) {
		return mapper.deleteByPrimaryKey((BigDecimal)key);
	}
	
	public List<Product> getByType(Object key) {
		ProductExample productExample = new ProductExample();
		Criteria criteria = productExample.createCriteria();
		if (!"".equals((String)key) && key != null)
			criteria.andTypeEqualTo((String)key);
		return mapper.selectByExample(productExample);
	}
}
