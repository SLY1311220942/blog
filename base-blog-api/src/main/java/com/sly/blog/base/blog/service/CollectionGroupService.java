package com.sly.blog.base.blog.service;

import org.springframework.cloud.openfeign.FeignClient;

import com.sly.blog.base.blog.service.hystrix.CollectionGroupFallbackFactory;

/**
 * 收藏分组service接口
 * 
 * @author sly
 * @time 2019年9月14日
 */
@FeignClient(value = "base-blog", fallbackFactory = CollectionGroupFallbackFactory.class)
public interface CollectionGroupService {
	
}
