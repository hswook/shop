package com.sh.shop.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sh.shop.domain.BoardConfig;
import com.sh.shop.domain.BoardConfigExample;
import com.sh.shop.domain.BoardConfigExample.Criteria;
import com.sh.shop.persistence.BoardConfigMapper;

@Service
@Transactional
public class BoardConfigService implements GenericService<BoardConfig> {

	@Autowired
	private BoardConfigMapper mapper;

	@Override
	public Integer insert(BoardConfig entity) {
		return mapper.insert(entity);
	}

	@Override
	public Integer update(BoardConfig entity) {
		return mapper.updateByPrimaryKey(entity);
	}

	@Override
	public Integer updateSelective(BoardConfig entity) {
		return mapper.updateByPrimaryKeySelective(entity);
	}

	@Override
	public BoardConfig getById(Object key) {
		return mapper.selectByPrimaryKey((BigDecimal)key);
	}

	@Override
	public Integer getCountById(Object key) {
		return null;
	}

	@Override
	public Integer delete(Object key) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<BoardConfig> getsByCategory(Object key) {
		BoardConfigExample boardConfigExample =  new BoardConfigExample();
		Criteria criteria = boardConfigExample.createCriteria();
		criteria.andCategoryIdEqualTo((BigDecimal)key);
		return mapper.selectByExample(boardConfigExample);
	}
	
}