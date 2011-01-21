package net.samzh.repo.base.service;

import java.io.Serializable;
import java.util.List;

public interface BaseInterface<T> {
	
	public void persist(T entity);
	
	public void merge(T entity);
	
	public void remove(T entity);
	
	public void removeById(Serializable id);
	
	public T findById(Serializable id);
	
	public List<T> listAll();
	
}
