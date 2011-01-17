package net.samzh.repo.base.dao;

import java.io.Serializable;
import java.util.List;

/**
 * 泛型通用DAO接口
 * 
 * @author Sam
 * 
 * @param <T>
 */
public interface IGenericDao<T> {

	void create(T entity);

	void delete(T entity);

	void update(T entity);

	T get(Serializable id);

	List<T> findAll();

	List<T> findList(int pageNo, int pageSize);
	
	long getCount();

	void deleteById(Serializable id);

}
