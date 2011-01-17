package net.samzh.repo.core.tag.vo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import net.samzh.repo.base.vo.ValueObject;
import net.samzh.repo.core.subject.vo.Subject;

@Entity
@Table(name = "r_tag")
public class Tag extends ValueObject {

	private String name;

	private int counter;

	private List<Subject> subjects;

	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "counter")
	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	@ManyToMany(targetEntity = Subject.class)
	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

}
