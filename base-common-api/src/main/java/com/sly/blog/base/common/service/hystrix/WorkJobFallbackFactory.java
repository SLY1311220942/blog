package com.sly.blog.base.common.service.hystrix;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.sly.blog.base.common.service.WorkJobService;

import feign.hystrix.FallbackFactory;

/**
 * 定时任务hystrix熔断
 * @author sly
 * @time 2019年9月15日
 */
@Component
public class WorkJobFallbackFactory implements FallbackFactory<WorkJobService> {

	private static final Logger LOGGER = LoggerFactory.getLogger(WorkJobFallbackFactory.class);

	@Override
	public WorkJobService create(Throwable cause) {

		LOGGER.error(ExceptionUtils.getStackTrace(cause));
		
		return new WorkJobService() {
			
		};
	}

}
