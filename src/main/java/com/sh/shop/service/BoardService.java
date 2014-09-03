package com.sh.shop.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sh.shop.domain.BoardPost;
import com.sh.shop.persistence.BoardPostMapper;
import com.sh.shop.util.SearchContext;

@Service
@Transactional
public class BoardService {
	
	@Autowired
	private BoardPostMapper boardPostMapper;
	
	public List<BoardPost> getListByConfigId(BigDecimal configId) {
		List<BoardPost> list = boardPostMapper.selectByConfigId(configId);
		
		return list;
	}
	
	public List<BoardPost> getListByContext(SearchContext searchContext){
		List<BoardPost> list = boardPostMapper.selectBySearchContext(searchContext);
		
		return list;
	}

}
