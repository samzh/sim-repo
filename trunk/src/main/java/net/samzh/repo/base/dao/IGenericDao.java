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

	/**
	 * 持久化实体
	 * 
	 * @param entity
	 */
	void persist(T entity);

	/**
	 * 移除实体
	 * 
	 * @param entity
	 */
	void remove(T entity);

	/**
	 * 更新实体
	 * 
	 * @param entity
	 */
	void merge(T entity);

	T get(Serializable id);

	/**
	 * 查询所有实体
	 * 
	 * @return
	 */
	List<T> queryAll();

	/**
	 * 根据分页信息查询所有实体
	 * 
	 * @param pageNo
	 *            页数
	 * @param pageSize
	 *            每页条数
	 * @return
	 */
	List<T> queryList(int pageNo, int pageSize);

	/**
	 * 返回实体在数据库中的条数
	 * 
	 * @param entity
	 * @return
	 */
	long getCount(T entity);

	void removeById(Serializable id);

}
