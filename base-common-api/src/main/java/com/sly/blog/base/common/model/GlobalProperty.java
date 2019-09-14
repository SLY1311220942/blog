package com.sly.blog.base.common.model;

import java.io.Serializable;

/**
 * 全局属性实体
 * 
 * @author sly
 * @time 2019年9月14日
 */
public class GlobalProperty implements Serializable {

	private static final long serialVersionUID = -5822300872014596033L;

	/** int(11) NOT NULL主键 自增 */
	private Integer propertyId;
	/** varchar(32) NULL属性code */
	private String propertyCode;
	/** varchar(240) NULL中文名称 */
	private String propertyCnName;
	/** varchar(240) NULL英文名称 */
	private String propertyEnName;
	/** varchar(240) NULL属性值 */
	private String propertyValue;
	/** varchar(24) NULL创建时间 YYMMDD HHmmss */
	private String createTime;
	/** varchar(240) NULL备注 */
	private String remark;
	/** tinyint(4) NULL是否启用:0.关闭 1.启用 */
	private Integer isOpen;
	/** char(1) NULL逻辑删除:Y.删除 N.未删除 */
	private String logicDel;
	/** varchar(32) NULL备用字段1 */
	private String projectKz1;
	/** varchar(32) NULL备用字段2 */
	private String projectKz2;
	/** varchar(32) NULL备用字段3 */
	private String projectKz3;

	public Integer getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(Integer propertyId) {
		this.propertyId = propertyId;
	}

	public String getPropertyCode() {
		return propertyCode;
	}

	public void setPropertyCode(String propertyCode) {
		this.propertyCode = propertyCode;
	}

	public String getPropertyCnName() {
		return propertyCnName;
	}

	public void setPropertyCnName(String propertyCnName) {
		this.propertyCnName = propertyCnName;
	}

	public String getPropertyEnName() {
		return propertyEnName;
	}

	public void setPropertyEnName(String propertyEnName) {
		this.propertyEnName = propertyEnName;
	}

	public String getPropertyValue() {
		return propertyValue;
	}

	public void setPropertyValue(String propertyValue) {
		this.propertyValue = propertyValue;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getIsOpen() {
		return isOpen;
	}

	public void setIsOpen(Integer isOpen) {
		this.isOpen = isOpen;
	}

	public String getLogicDel() {
		return logicDel;
	}

	public void setLogicDel(String logicDel) {
		this.logicDel = logicDel;
	}

	public String getProjectKz1() {
		return projectKz1;
	}

	public void setProjectKz1(String projectKz1) {
		this.projectKz1 = projectKz1;
	}

	public String getProjectKz2() {
		return projectKz2;
	}

	public void setProjectKz2(String projectKz2) {
		this.projectKz2 = projectKz2;
	}

	public String getProjectKz3() {
		return projectKz3;
	}

	public void setProjectKz3(String projectKz3) {
		this.projectKz3 = projectKz3;
	}

}
