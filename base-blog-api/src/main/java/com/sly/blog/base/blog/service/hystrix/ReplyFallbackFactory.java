package com.sly.blog.base.blog.service.hystrix;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.sly.blog.base.blog.service.ReplyService;

import feign.hystrix.FallbackFactory;

/**
 * 回复 hystrix熔断
 * 
 * @author sly
 * @time 2019年9月14日
 */
@Component
public class ReplyFallbackFactory implements FallbackFactory<ReplyService> {

	private static final Logger LOGGER = LoggerFactory.getLogger(ReplyFallbackFactory.class);

	@Override
	public ReplyService create(Throwable cause) {

		LOGGER.error(ExceptionUtils.getStackTrace(cause));

		return new ReplyService() {

		};
	}

}
