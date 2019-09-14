package com.sly.blog.base.blog.service.hystrix;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.sly.blog.base.blog.service.BlogAttentionRaService;

import feign.hystrix.FallbackFactory;

/**
 * 用户关注关系 hystrix熔断
 * 
 * @author sly
 * @time 2019年9月14日
 */
@Component
public class BlogAttentionRaFallbackFactory implements FallbackFactory<BlogAttentionRaService> {

	private static final Logger LOGGER = LoggerFactory.getLogger(BlogAttentionRaFallbackFactory.class);

	@Override
	public BlogAttentionRaService create(Throwable cause) {
		
		LOGGER.error(ExceptionUtils.getStackTrace(cause));
		
		return new BlogAttentionRaService() {

		};
		
	}

}
