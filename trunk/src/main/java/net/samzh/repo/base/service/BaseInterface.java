package net.samzh.repo.base.service;

import java.io.Serializable;

public interface BaseInterface<T> {
	
	public void persist(T entity);
	
	public void merge(T entity);
	
	public void remove(T entity);
	
	public void removeById(Serializable id);
	
	public T findById(Serializable id);
	
}
