package com.sh.shop.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sh.shop.domain.BoardCategory;
import com.sh.shop.domain.BoardCategoryExample;
import com.sh.shop.domain.BoardCategoryExample.Criteria;
import com.sh.shop.persistence.BoardCategoryMapper;

@Service
@Transactional
public class BoardCategoryService implements GenericService<BoardCategory> {

	@Autowired
	private BoardCategoryMapper mapper;

	@Override
	public Integer insert(BoardCategory entity) {
		return mapper.insert(entity);
	}

	@Override
	public Integer update(BoardCategory entity) {
		return mapper.updateByPrimaryKey(entity);
	}

	@Override
	public Integer updateSelective(BoardCategory entity) {
		return mapper.updateByPrimaryKeySelective(entity);
	}

	@Override
	public BoardCategory getById(Object key) {
		return mapper.selectByPrimaryKey((BigDecimal)key);
	}

	@Override
	public Integer getCountById(Object key) {
		return null;
	}
	
	public List<BoardCategory> gets() {
		BoardCategoryExample boardCategoryExample = new BoardCategoryExample();
		Criteria criteria = boardCategoryExample.createCriteria();
		return mapper.selectByExample(boardCategoryExample);
	}
}