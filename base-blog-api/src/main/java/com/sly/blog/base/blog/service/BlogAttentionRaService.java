package com.sly.blog.base.blog.service;

import org.springframework.cloud.openfeign.FeignClient;

import com.sly.blog.base.blog.service.hystrix.BlogAttentionRaFallbackFactory;

/**
 * 用户关注关系service接口
 * 
 * @author sly
 * @time 2019年9月14日
 */
@FeignClient(value = "base-blog", fallbackFactory = BlogAttentionRaFallbackFactory.class)
public interface BlogAttentionRaService {

}
