package com.sly.blog.base.common.service;

import org.springframework.cloud.openfeign.FeignClient;

import com.sly.blog.base.common.service.hystrix.WorkJobFallbackFactory;

/**
 * 定时任务service接口
 * 
 * @author sly
 * @time 2019年9月15日
 */
@FeignClient(value = "base-common", fallbackFactory = WorkJobFallbackFactory.class)
public interface WorkJobService {

}
