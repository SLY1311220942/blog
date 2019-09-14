package com.sly.blog.base.blog.service.hystrix;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.sly.blog.base.blog.service.UserCollectContentRaService;

import feign.hystrix.FallbackFactory;

/**
 * 用户收藏文章关系hystrix熔断
 * 
 * @author sly
 * @time 2019年9月14日
 */
@Component
public class UserCollectContentRaFallbackFactory implements FallbackFactory<UserCollectContentRaService> {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserCollectContentRaFallbackFactory.class);
	
	@Override
	public UserCollectContentRaService create(Throwable cause) {
		
		LOGGER.error(ExceptionUtils.getStackTrace(cause));
		
		return new UserCollectContentRaService() {
			
		};
		
	}

}
