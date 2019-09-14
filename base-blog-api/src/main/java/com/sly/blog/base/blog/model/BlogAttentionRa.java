package com.sly.blog.base.blog.model;

import java.io.Serializable;

/**
 * 用户关注关系实体
 * 
 * @author sly
 * @time 2019年9月14日
 */
public class BlogAttentionRa implements Serializable {

	private static final long serialVersionUID = -8806945033595627459L;

	/** varchar(32) NOT NULL用户关注关系id */
	private String attentionRaId;
	/** varchar(32) NULL用户id */
	private String userId;
	/** varchar(32) NULL被关注用户id */
	private String attentionUserId;

	public String getAttentionRaId() {
		return attentionRaId;
	}

	public void setAttentionRaId(String attentionRaId) {
		this.attentionRaId = attentionRaId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAttentionUserId() {
		return attentionUserId;
	}

	public void setAttentionUserId(String attentionUserId) {
		this.attentionUserId = attentionUserId;
	}

}
