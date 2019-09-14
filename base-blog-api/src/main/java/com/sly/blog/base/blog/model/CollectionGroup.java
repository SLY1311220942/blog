package com.sly.blog.base.blog.model;

import java.io.Serializable;

/**
 * 收藏分组实体
 * 
 * @author sly
 * @time 2019年9月14日
 */
public class CollectionGroup implements Serializable {

	private static final long serialVersionUID = -315398853901399777L;

	/** varchar(32) NOT NULL收藏分组id */
	private String collectGroupId;
	/** varchar(32) NULL博客用户id */
	private String userId;
	/** varchar(32) NULL父id */
	private String parentId;
	/** varchar(32) NULL分组名称 */
	private String groupName;

	public String getCollectGroupId() {
		return collectGroupId;
	}

	public void setCollectGroupId(String collectGroupId) {
		this.collectGroupId = collectGroupId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

}
