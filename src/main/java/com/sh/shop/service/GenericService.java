package com.sh.shop.service;

public interface GenericService<T> {

	public Integer insert(T entity);
	
	public Integer update(T entity);
	
	public Integer updateSelective(T entity);
	
	public T getById(Object key);
	
	public Integer getCountById(Object key);
	
	public Integer delete(Object key);
}