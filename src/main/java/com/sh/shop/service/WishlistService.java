package com.sh.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sh.shop.domain.Product;
import com.sh.shop.domain.Wishlist;
import com.sh.shop.domain.WishlistExample;
import com.sh.shop.domain.WishlistExample.Criteria;
import com.sh.shop.persistence.WishlistMapper;

import java.math.BigDecimal;
import java.util.List;

@Service
@Transactional
public class WishlistService implements GenericService<Wishlist> {
	
	@Autowired
	private WishlistMapper mapper;

	@Override
	public Integer insert(Wishlist entity) {
		return mapper.insertSelective(entity);
	}
	
	public Integer insertWhenProductNotExist(Wishlist entity) {
		List<Wishlist> wishlist = getByProductIdAndMemberEmail(entity.getProductId(), entity.getMemberEmail());
		
		if ( wishlist != null && wishlist.size() > 0 ) {
			return 1;
		}
		
		return mapper.insertSelective(entity);
	}

	@Override
	public Integer update(Wishlist entity) {
		return mapper.updateByPrimaryKey(entity);
	}

	@Override
	public Integer updateSelective(Wishlist entity) {
		return mapper.updateByPrimaryKeySelective(entity);
	}

	@Override
	public Wishlist getById(Object key) {
		return mapper.selectByPrimaryKey((BigDecimal)key);
	}
	
	public List<Wishlist> getByProductIdAndMemberEmail(BigDecimal productId, String email) {
		WishlistExample wishlistExample = new WishlistExample();
		Criteria criteria = wishlistExample.createCriteria();
		criteria.andProductIdEqualTo(productId)
				.andMemberEmailEqualTo(email);
		
		return mapper.selectByExample(wishlistExample);
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
	
	public List<Product> getProductListByMemberEmail(String email) {
		return mapper.selectProductListByMemberEmail(email);
	}
}
