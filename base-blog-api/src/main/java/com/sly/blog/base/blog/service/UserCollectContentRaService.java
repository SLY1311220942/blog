package com.sly.blog.base.blog.service;

import org.springframework.cloud.openfeign.FeignClient;

import com.sly.blog.base.blog.service.hystrix.UserCollectContentRaFallbackFactory;

/**
 * 用户收藏文章关系service接口
 * 
 * @author sly
 * @time 2019年9月14日
 */
@FeignClient(value = "base-blog", fallbackFactory = UserCollectContentRaFallbackFactory.class)
public interface UserCollectContentRaService {

}
