package net.samzh.repo.core.subject.vo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import net.samzh.repo.base.vo.ValueObject;
import net.samzh.repo.core.category.vo.Category;
import net.samzh.repo.core.tag.vo.Tag;
import net.samzh.repo.core.user.vo.User;

@Entity
@Table(name = "r_subject")
public class Subject extends ValueObject {

	private String title;

	private String content;

	private Category category;

	private List<Tag> tags;

	private String referLink;

	private User user;

	@Column(name = "title")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "content")
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@ManyToOne(targetEntity = Category.class, fetch = FetchType.LAZY)
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@ManyToMany(targetEntity = Tag.class)
	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	@Column(name = "refer_link", length = 255)
	public String getReferLink() {
		return referLink;
	}

	public void setReferLink(String referLink) {
		this.referLink = referLink;
	}

	@ManyToOne(targetEntity = User.class)
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
