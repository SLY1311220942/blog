package com.sly.blog.base.common.service.hystrix;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.sly.blog.base.common.service.OperateLogService;

import feign.hystrix.FallbackFactory;

/**
 * OperateLog hystrix熔断
 * 
 * @author sly
 * @time 2019年9月14日
 */
@Component
public class OperateLogFallbackFactory implements FallbackFactory<OperateLogService> {

	private static final Logger LOGGER = LoggerFactory.getLogger(OperateLogFallbackFactory.class);

	@Override
	public OperateLogService create(Throwable cause) {
		
		LOGGER.error(ExceptionUtils.getStackTrace(cause));

		return new OperateLogService() {

		};
		
	}

}
