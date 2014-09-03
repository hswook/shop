package com.sh.shop.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sh.shop.domain.BoardPost;
import com.sh.shop.persistence.BoardPostMapper;

@Service
@Transactional
public class BoardPostService implements GenericService<BoardPost> {
	
	@Autowired
	private BoardPostMapper mapper;

	@Override
	public Integer insert(BoardPost entity) {
		return mapper.insert(entity);
	}

	@Override
	public Integer update(BoardPost entity) {
		return mapper.updateByPrimaryKey(entity);
	}

	@Override
	public Integer updateSelective(BoardPost entity) {
		return mapper.updateByPrimaryKeySelective(entity);
	}

	@Override
	public BoardPost getById(Object key) {
		return mapper.selectByPrimaryKey((BigDecimal)key);
	}

	@Override
	public Integer getCountById(Object key) {
		return null;
	}

}