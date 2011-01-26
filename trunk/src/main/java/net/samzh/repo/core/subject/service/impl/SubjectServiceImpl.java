package net.samzh.repo.core.subject.service.impl;

import java.io.Serializable;
import java.util.List;

import net.samzh.repo.core.subject.dao.SubjectDAO;
import net.samzh.repo.core.subject.service.SubjectService;
import net.samzh.repo.core.subject.vo.Subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SubjectServiceImpl implements SubjectService {

	@Autowired
	private SubjectDAO subjectDAO;

	@Override
	@Transactional
	public void persist(Subject entity) {
		subjectDAO.persist(entity);

	}

	@Override
	@Transactional
	public void merge(Subject entity) {
		subjectDAO.merge(entity);

	}

	@Override
	@Transactional
	public void remove(Subject entity) {
		subjectDAO.remove(entity);

	}

	@Override
	@Transactional
	public void removeById(Serializable id) {
		subjectDAO.removeById(id);

	}

	@Override
	public Subject findById(Serializable id) {
		return subjectDAO.get(id);
	}

	@Override
	public List<Subject> listAll() {

		return subjectDAO.queryAll();
	}

}
