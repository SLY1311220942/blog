package com.sly.blog.base.blog.service.hystrix;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.sly.blog.base.blog.service.CommentService;

import feign.hystrix.FallbackFactory;

/**
 * 评论 service接口
 * 
 * @author sly
 * @time 2019年9月14日
 */
@Component
public class CommentFallbackFactory implements FallbackFactory<CommentService> {

	private static final Logger LOGGER = LoggerFactory.getLogger(CommentFallbackFactory.class);

	@Override
	public CommentService create(Throwable cause) {

		LOGGER.error(ExceptionUtils.getStackTrace(cause));

		return new CommentService() {

		};

	}

}
