package com.sly.blog.base.common.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import com.sly.blog.base.common.service.OperateLogService;

/**
 * OperateLog Service 实现类
 * 
 * @author sly
 * @time 2019年9月14日
 */
@RestController
@Transactional(rollbackFor = Exception.class)
public class OperateLogServiceImpl implements OperateLogService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OperateLogServiceImpl.class);


}
