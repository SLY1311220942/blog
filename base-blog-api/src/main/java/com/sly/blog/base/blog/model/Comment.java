package com.sly.blog.base.blog.model;

import java.io.Serializable;

/**
 * 评论实体
 * 
 * @author sly
 * @time 2019年9月14日
 */
public class Comment implements Serializable {

	private static final long serialVersionUID = 5040268604030014642L;

	/** int(11) NOT NULL评论id 自增 */
	private Integer commentId;
	/** text NULL评论内容 */
	private String comment;
	/** varchar(32) NULL评论所属文章id */
	private String contentId;
	/** varchar(24) NULL创建时间 */
	private String createTime;
	/** varchar(24) NULL删除时间 */
	private String deleteTime;
	/** varchar(32) NULL创建用户id */
	private String userId;
	/** char(1) NULL逻辑删除:Y.删除 N.未删除 */
	private String logicDel;
	/** int(11) NULL点赞数量 */
	private Integer upper;

	public Integer getCommentId() {
		return commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getContentId() {
		return contentId;
	}

	public void setContentId(String contentId) {
		this.contentId = contentId;
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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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
