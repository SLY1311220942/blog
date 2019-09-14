package com.sly.blog.base.common.model;

import java.io.Serializable;

/**
 * 任务实体
 * 
 * @author sly
 * @time 2019年9月14日
 */
public class WorkJob implements Serializable {

	private static final long serialVersionUID = 7389236799566023244L;

	/** int(11) NOT NULL工作ID */
	private Integer jobId;
	/** varchar(32) NULL工作名称 */
	private String jobName;
	/** varchar(32) NULL工作组 */
	private String jobGroup;
	/** varchar(256) NULL工作类名 */
	private String jobClass;
	/** varchar(128) NULL表达式 */
	private String cronExpression;
	/** int(6) NULL调度状态 1已启动调度 0已停止调度 */
	private Integer scheduleStatesmall;
	/** varchar(24) NULL创建时间 */
	private String createtime;
	/** varchar(240) NULL备注 */
	private String remark;

	public Integer getJobId() {
		return jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getJobGroup() {
		return jobGroup;
	}

	public void setJobGroup(String jobGroup) {
		this.jobGroup = jobGroup;
	}

	public String getJobClass() {
		return jobClass;
	}

	public void setJobClass(String jobClass) {
		this.jobClass = jobClass;
	}

	public String getCronExpression() {
		return cronExpression;
	}

	public void setCronExpression(String cronExpression) {
		this.cronExpression = cronExpression;
	}

	public Integer getScheduleStatesmall() {
		return scheduleStatesmall;
	}

	public void setScheduleStatesmall(Integer scheduleStatesmall) {
		this.scheduleStatesmall = scheduleStatesmall;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
