package net.samzh.repo.core.subject.service.impl;

import java.io.Serializable;

import net.samzh.repo.core.subject.dao.SubjectDAO;
import net.samzh.repo.core.subject.service.SubjectService;
import net.samzh.repo.core.subject.vo.Subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectServiceImpl implements SubjectService {

	@Autowired
	private SubjectDAO subjectDAO;

	@Override
	public void persist(Subject entity) {
		subjectDAO.create(entity);

	}

	@Override
	public void merge(Subject entity) {
		subjectDAO.update(entity);

	}

	@Override
	public void remove(Subject entity) {
		subjectDAO.delete(entity);

	}

	@Override
	public void removeById(Serializable id) {
		subjectDAO.deleteById(id);

	}

	@Override
	public Subject findById(Serializable id) {
		return subjectDAO.get(id);
	}

}
