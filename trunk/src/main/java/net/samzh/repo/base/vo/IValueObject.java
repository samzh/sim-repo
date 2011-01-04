package net.samzh.repo.base.vo;

import java.util.Date;

public interface IValueObject {

	/**
	 * 返回ID
	 * 
	 * @return id;
	 */
	long getId();

	/**
	 * 设置ID
	 * 
	 * @param id
	 */
	void setId(long id);

	/**
	 * 返回创建时间
	 * 
	 * @return created 创建时间
	 */
	Date getCreated();

	/**
	 * 设置创建时间
	 * 
	 * @param created
	 *            创建时间
	 */
	void setCreated(Date created);

	/**
	 * 返回修改时间
	 * 
	 * @return updated 修改时间
	 */
	Date getUpdated();

	/**
	 * 设置修改时间
	 * 
	 * @param updated
	 *            修改时间
	 */
	void setUpdated(Date updated);

}
