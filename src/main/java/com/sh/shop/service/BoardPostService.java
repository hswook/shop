package com.sh.shop.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sh.shop.domain.BoardPost;
import com.sh.shop.domain.BoardPostExample;
import com.sh.shop.domain.BoardPostExample.Criteria;
import com.sh.shop.persistence.BoardPostMapper;

@Service
@Transactional
public class BoardPostService implements GenericService<BoardPost> {
	
	@Autowired
	private BoardPostMapper mapper;

	public Integer insertSelective(BoardPost entity) {
		return mapper.insertSelective(entity);
	}
	
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

	@Override
	public Integer delete(Object key) {
		return mapper.deleteByPrimaryKey((BigDecimal)key);
	}
	
	public List<BoardPost> getsByConfig(Object key) {
		BoardPostExample boardPostExample =  new BoardPostExample();
		Criteria criteria = boardPostExample.createCriteria();
		criteria.andConfigIdEqualTo((BigDecimal)key);
		return mapper.selectByExample(boardPostExample);
	}

}
