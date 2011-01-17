package net.samzh.repo.base.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import net.samzh.repo.base.vo.ValueObject;

import org.springframework.stereotype.Repository;

@Repository
public class BaseDAO<T> implements IDao, IGenericDao<T> {

	private Class<? extends ValueObject> clazz;

	public BaseDAO(ValueObject vo) {
		this.clazz = vo.getClass();
	}

	@SuppressWarnings("unchecked")
	public BaseDAO(@SuppressWarnings("rawtypes") Class clazz) {
		this.clazz = clazz;
	}

	public BaseDAO() {
	}

	@PersistenceContext
	private EntityManager em;

	@Override
	public void create(T entity) {
		em.persist(entity);

	}

	@Override
	public void delete(T entity) {
		em.remove(entity);

	}

	@Override
	public void update(T entity) {
		em.merge(entity);

	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(Serializable id) {
		return (T) em.find(clazz, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll() {
		return em.createQuery("select t from " + clazz.getSimpleName() + " t").getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findList(int pageNo, int pageSize) {
		return em.createQuery("select t from " + this.clazz.getName() + " t")
				.setFirstResult((pageNo - 1) * pageSize).setMaxResults(pageSize).getResultList();
	}
	
	public long getCount() {
		return (Long)em.createQuery("select count(*) from " + this.clazz.getSimpleName()).getSingleResult();
	}

	@Override
	public void deleteById(Serializable id) {
		T t = this.get(id);
		em.remove(t);
	}

}
