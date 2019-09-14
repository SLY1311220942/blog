package com.sly.blog.base.blog.service.hystrix;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.sly.blog.base.blog.service.CollectionGroupService;

import feign.hystrix.FallbackFactory;

/**
 * 收藏分组 hystrix熔断
 * 
 * @author sly
 * @time 2019年9月14日
 */
@Component
public class CollectionGroupFallbackFactory implements FallbackFactory<CollectionGroupService> {

	private static final Logger LOGGER = LoggerFactory.getLogger(CollectionGroupFallbackFactory.class);

	@Override
	public CollectionGroupService create(Throwable cause) {

		LOGGER.error(ExceptionUtils.getStackTrace(cause));

		return new CollectionGroupService() {

		};

	}

}
