package com.sly.blog.base.common.service;

import org.springframework.cloud.openfeign.FeignClient;

import com.sly.blog.base.common.service.hystrix.GlobalPropertyFallbackFactory;

/**
 * 全局属性service接口
 * 
 * @author sly
 * @time 2019年9月15日
 */
@FeignClient(value = "base-common", fallbackFactory = GlobalPropertyFallbackFactory.class)
public interface GlobalPropertyService {

}
