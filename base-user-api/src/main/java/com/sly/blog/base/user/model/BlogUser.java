package com.sly.blog.base.user.model;

import java.io.Serializable;

/**
 * blog用户模型类
 * 
 * @author sly
 * @time 2019年9月14日
 */
public class BlogUser implements Serializable {

	private static final long serialVersionUID = -4378107242296657318L;

	/** varchar(32) NOT NULL用户id uuid */
	private String userId;
	/** varchar(32) NULL用户名 */
	private String username;
	/** varchar(32) NULL密码 */
	private String password;
	/** varchar(32) NULL真实姓名 */
	private String realname;
	/** varchar(32) NULL昵称 */
	private String nickname;
	/** varchar(32) NULL手机号 */
	private String phone;
	/** varchar(64) NULL邮箱 */
	private String email;
	/** varchar(24) NULL身份证号 */
	private String idCard;
	/** char(1) NULL性别:M.男 W.女 */
	private String sex;
	/** text NULL爱好 */
	private String hobby;
	/** text NULL关注 */
	private String attention;
	/** varchar(24) NULL创建时间 */
	private String createTime;
	/** varchar(24) NULL修改时间 */
	private String updateTime;
	/** tinyint(4) NULL用户状态:0.未激活 1.激活 2.封禁 */
	private Integer status;
	/** tinyint(4) NULL用户等级 */
	private Integer userLevel;
	/** char(1) NULL逻辑删除:Y.删除 N.未删除 */
	private String logicDel;
	/** varchar(240) NULL备注 */
	private String remark;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getAttention() {
		return attention;
	}

	public void setAttention(String attention) {
		this.attention = attention;
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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getUserLevel() {
		return userLevel;
	}

	public void setUserLevel(Integer userLevel) {
		this.userLevel = userLevel;
	}

	public String getLogicDel() {
		return logicDel;
	}

	public void setLogicDel(String logicDel) {
		this.logicDel = logicDel;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
