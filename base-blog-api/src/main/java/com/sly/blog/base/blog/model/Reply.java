package com.sly.blog.base.blog.model;

import java.io.Serializable;

/**
 * 回复实体
 * 
 * @author sly
 * @time 2019年9月14日
 */
public class Reply implements Serializable {

	private static final long serialVersionUID = 4013547503270512189L;

	/** int(11) NOT NULL回复id 自增 */
	private Integer replyId;
	/** text NULL回复内容 */
	private String reply;
	/** varchar(6) NULL被回复的类型1:评论,2:回复 */
	private String replyType;
	/** int(11) NULL被回复Id */
	private Integer replyToId;
	/** varchar(32) NULL被回复用户Id */
	private String replyToUserId;
	/** varchar(32) NULL创建用户id */
	private String userId;
	/** varchar(24) NULL创建时间 */
	private String createTime;
	/** varchar(24) NULL删除时间 */
	private String deleteTime;
	/** char(1) NULL逻辑删除:Y.删除 N.未删除 */
	private String logicDel;
	/** int(11) NULL点赞数量 */
	private Integer upper;

	public Integer getReplyId() {
		return replyId;
	}

	public void setReplyId(Integer replyId) {
		this.replyId = replyId;
	}

	public String getReply() {
		return reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}

	public String getReplyType() {
		return replyType;
	}

	public void setReplyType(String replyType) {
		this.replyType = replyType;
	}

	public Integer getReplyToId() {
		return replyToId;
	}

	public void setReplyToId(Integer replyToId) {
		this.replyToId = replyToId;
	}

	public String getReplyToUserId() {
		return replyToUserId;
	}

	public void setReplyToUserId(String replyToUserId) {
		this.replyToUserId = replyToUserId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getDeleteTime() {
		return deleteTime;
	}

	public void setDeleteTime(String deleteTime) {
		this.deleteTime = deleteTime;
	}

	public String getLogicDel() {
		return logicDel;
	}

	public void setLogicDel(String logicDel) {
		this.logicDel = logicDel;
	}

	public Integer getUpper() {
		return upper;
	}

	public void setUpper(Integer upper) {
		this.upper = upper;
	}

}
