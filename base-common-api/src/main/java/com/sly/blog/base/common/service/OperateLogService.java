package com.sly.blog.base.common.service;

import org.springframework.cloud.openfeign.FeignClient;

import com.sly.blog.base.common.service.hystrix.OperateLogFallbackFactory;

/**
 * OperateLog service接口
 * 
 * @author sly
 * @time 2019年9月14日
 */
@FeignClient(value = "base-common", fallbackFactory = OperateLogFallbackFactory.class)
public interface OperateLogService {

}
