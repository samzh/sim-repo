package net.samzh.repo.base.vo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
/**
 * VO类超类，拥有ValueObject的基本属性
 */
public class ValueObject implements IValueObject {

	private long id;

	private Date created;

	private Date updated;

	/**
	 * 返回ID
	 * 
	 * @return id;
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}

	/**
	 * 设置ID
	 * 
	 * @param id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * 返回创建时间
	 * 
	 * @return created 创建时间
	 */

	@Column(name = "created")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getCreated() {
		return created;
	}

	/**
	 * 设置创建时间
	 * 
	 * @param created
	 *            创建时间
	 */
	public void setCreated(Date created) {
		this.created = created;
	}

	/**
	 * 返回修改时间
	 * 
	 * @return updated 修改时间
	 */
	@Column(name = "updated")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getUpdated() {
		return updated;
	}

	/**
	 * 设置修改时间
	 * 
	 * @param updated
	 *            修改时间
	 */
	public void setUpdated(Date updated) {
		this.updated = updated;
	}

}
