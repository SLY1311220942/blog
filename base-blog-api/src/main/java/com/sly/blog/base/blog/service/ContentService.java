package com.sly.blog.base.blog.service;

import org.springframework.cloud.openfeign.FeignClient;

import com.sly.blog.base.blog.service.hystrix.ContentServiceFallbackFactory;

/**
 * 文章service接口
 * 
 * @author sly
 * @time 2019年9月14日
 */
@FeignClient(value = "base-blog", fallbackFactory = ContentServiceFallbackFactory.class)
public interface ContentService {
	
}
