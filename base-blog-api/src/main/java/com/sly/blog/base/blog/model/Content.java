package com.sly.blog.base.blog.model;

import java.io.Serializable;

/**
 * 文章实体
 * 
 * @author sly
 * @time 2019年9月14日
 */
public class Content implements Serializable {

	private static final long serialVersionUID = 4198268344107391524L;

	/** varchar(32) NOT NULL文章id uuid */
	private String contentId;
	/** varchar(64) NULL文章标题 */
	private String title;
	/** text NULL文章内容 */
	private String content;
	/** tinyint(4) NULL文章类型code */
	private Integer contentTypeCode;
	/** varchar(32) NULL文章类型名称 */
	private String contentTypeName;
	/** char(1) NULL是否公开:Y.是 N.否 */
	private String isPublish;
	/** char(1) NULL文章类型:1.文章,2.草稿 */
	private String contentType;
	/** json NULL文章标签 */
	private String tags;
	/** int(11) NULL点击数 */
	private Integer hit;
	/** varchar(24) NULL创建时间 */
	private String createTime;
	/** varchar(24) NULL修改时间 */
	private String updateTime;
	/** varchar(24) NULL删除时间 */
	private String deleteTime;
	/** varchar(32) NULL创建用户ID */
	private String userId;
	/** char(1) NULL逻辑删除:Y.删除 N.未删除 */
	private String logicDel;
	/** int(11) NULL点赞数量 */
	private Integer upper;

	public String getContentId() {
		return contentId;
	}

	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getContentTypeCode() {
		return contentTypeCode;
	}

	public void setContentTypeCode(Integer contentTypeCode) {
		this.contentTypeCode = contentTypeCode;
	}

	public String getContentTypeName() {
		return contentTypeName;
	}

	public void setContentTypeName(String contentTypeName) {
		this.contentTypeName = contentTypeName;
	}

	public String getIsPublish() {
		return isPublish;
	}

	public void setIsPublish(String isPublish) {
		this.isPublish = isPublish;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public Integer getHit() {
		return hit;
	}

	public void setHit(Integer hit) {
		this.hit = hit;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
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
