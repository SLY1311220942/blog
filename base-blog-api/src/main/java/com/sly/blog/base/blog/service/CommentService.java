package com.sly.blog.base.blog.service;

import org.springframework.cloud.openfeign.FeignClient;

import com.sly.blog.base.blog.service.hystrix.CommentFallbackFactory;

/**
 * 评论 service接口
 * 
 * @author sly
 * @time 2019年9月14日
 */
@FeignClient(value = "base-blog", fallbackFactory = CommentFallbackFactory.class)
public interface CommentService {

}
