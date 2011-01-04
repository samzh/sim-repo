package net.samzh.repo.core.user.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import net.samzh.repo.base.vo.ValueObject;

@Entity
@Table(name = "r_user")
public class User extends ValueObject {

	private String userName;

	private String password;

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
