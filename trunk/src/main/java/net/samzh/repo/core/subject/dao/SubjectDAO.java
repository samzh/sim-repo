package net.samzh.repo.core.subject.dao;

import net.samzh.repo.base.dao.HibernateBaseDao;
import net.samzh.repo.core.subject.vo.Subject;

import org.springframework.stereotype.Repository;

@Repository
public class SubjectDAO extends HibernateBaseDao<Subject> {

	public SubjectDAO() {
		super(Subject.class);
	}
}
