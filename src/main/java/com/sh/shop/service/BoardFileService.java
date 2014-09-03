package com.sh.shop.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sh.shop.domain.BoardFile;
import com.sh.shop.persistence.BoardFileMapper;

@Service
@Transactional
public class BoardFileService implements GenericService<BoardFile> {

	@Autowired
	private BoardFileMapper mapper;

	@Override
	public Integer insert(BoardFile entity) {
		return mapper.insert(entity);
	}

	@Override
	public Integer update(BoardFile entity) {
		return mapper.updateByPrimaryKey(entity);
	}

	@Override
	public Integer updateSelective(BoardFile entity) {
		return mapper.updateByPrimaryKeySelective(entity);
	}

	@Override
	public BoardFile getById(Object key) {
		return mapper.selectByPrimaryKey((BigDecimal)key);
	}

	@Override
	public Integer getCountById(Object key) {
		return null;
	}
}