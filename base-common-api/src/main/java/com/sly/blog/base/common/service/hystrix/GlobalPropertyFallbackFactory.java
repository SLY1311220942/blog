package com.sly.blog.base.common.service.hystrix;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.sly.blog.base.common.service.GlobalPropertyService;

import feign.hystrix.FallbackFactory;

/**
 * 全局属性hystrix熔断
 * 
 * @author sly
 * @time 2019年9月15日
 */
@Component
public class GlobalPropertyFallbackFactory implements FallbackFactory<GlobalPropertyService> {

	private static final Logger LOGGER = LoggerFactory.getLogger(GlobalPropertyFallbackFactory.class);

	@Override
	public GlobalPropertyService create(Throwable cause) {

		LOGGER.error(ExceptionUtils.getStackTrace(cause));

		return new GlobalPropertyService() {
			
		};
	}

}
