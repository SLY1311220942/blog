package com.sly.blog.base.common.service.hystrix;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.sly.blog.base.common.service.DicCodeService;

import feign.hystrix.FallbackFactory;

/**
 * 字典码表hystrix熔断
 * 
 * @author sly
 * @time 2019年9月15日
 */
@Component
public class DicCodeFallbackFactory implements FallbackFactory<DicCodeService> {

	private static final Logger LOGGER = LoggerFactory.getLogger(DicCodeFallbackFactory.class);

	@Override
	public DicCodeService create(Throwable cause) {

		LOGGER.error(ExceptionUtils.getStackTrace(cause));

		return new DicCodeService() {

		};
	}

}
