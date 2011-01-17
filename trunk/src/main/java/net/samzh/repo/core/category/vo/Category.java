package net.samzh.repo.core.category.vo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import net.samzh.repo.base.vo.ValueObject;
import net.samzh.repo.core.subject.vo.Subject;

@Entity
@Table(name = "r_category")
public class Category extends ValueObject {

	private String title;

	private int level;

	private Serializable parent;

	private List<Subject> subjects;

	@OneToMany(targetEntity = Subject.class)
	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	@Column(name = "title")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "level")
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Column(name = "parent")
	public Serializable getParent() {
		return parent;
	}

	public void setParent(Serializable parent) {
		this.parent = parent;
	}

}
