package com.sly.blog.base.blog.service;

import org.springframework.cloud.openfeign.FeignClient;

import com.sly.blog.base.blog.service.hystrix.ReplyFallbackFactory;

/**
 * 回复service接口
 * 
 * @author sly
 * @time 2019年9月14日
 */
@FeignClient(value = "base-blog", fallbackFactory = ReplyFallbackFactory.class)
public interface ReplyService {

}
