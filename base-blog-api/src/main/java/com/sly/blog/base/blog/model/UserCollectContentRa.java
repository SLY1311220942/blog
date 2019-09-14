package com.sly.blog.base.blog.model;

import java.io.Serializable;

/**
 * 用户收藏文章关系实体
 * 
 * @author sly
 * @time 2019年9月14日
 */
public class UserCollectContentRa implements Serializable {

	private static final long serialVersionUID = -2961949723455923787L;

	/** int(11) NOT NULL用户收藏文章关系id */
	private Integer userCollectContentRaId;
	/** varchar(32) NULL博客用户id */
	private String userId;
	/** varchar(32) NULL文章id */
	private String contentId;
	/** varchar(32) NULL收藏分组id */
	private String collectGroupId;

	public Integer getUserCollectContentRaId() {
		return userCollectContentRaId;
	}

	public void setUserCollectContentRaId(Integer userCollectContentRaId) {
		this.userCollectContentRaId = userCollectContentRaId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getContentId() {
		return contentId;
	}

	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public String getCollectGroupId() {
		return collectGroupId;
	}

	public void setCollectGroupId(String collectGroupId) {
		this.collectGroupId = collectGroupId;
	}

}
