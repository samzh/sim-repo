package net.samzh.repo.core.user.vo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import net.samzh.repo.base.vo.ValueObject;
import net.samzh.repo.core.subject.vo.Subject;

@Entity
@Table(name = "r_user")
public class User extends ValueObject {

	private String userName;

	private String password;

	private List<Subject> subjects;

	@OneToMany(targetEntity = Subject.class)
	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "user_name")
	public String getUserName() {
		return userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "password")
	public String getPassword() {
		return password;
	}

}
