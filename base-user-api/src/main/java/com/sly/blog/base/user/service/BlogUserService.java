package com.sly.blog.base.user.service;

import org.springframework.cloud.openfeign.FeignClient;

import com.sly.blog.base.user.service.hystrix.UserFallbackFactory;

/**
 * blog user service接口
 * 
 * @author sly
 * @time 2019年9月14日
 */
@FeignClient(value = "base-user", fallbackFactory = UserFallbackFactory.class)
public interface BlogUserService {

}
