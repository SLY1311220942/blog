package com.sly.blog.base.user.service.hystrix;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.sly.blog.base.user.service.BlogUserService;

import feign.hystrix.FallbackFactory;

/**
 * blog user hystrix熔断
 * 
 * @author sly
 * @time 2019年9月14日
 */
@Component
public class UserFallbackFactory implements FallbackFactory<BlogUserService> {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserFallbackFactory.class);

	@Override
	public BlogUserService create(Throwable cause) {

		LOGGER.error(ExceptionUtils.getStackTrace(cause));

		return new BlogUserService() {

		};

	}

}
