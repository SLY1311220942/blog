package com.sly.blog.base.blog.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import com.sly.blog.base.blog.service.ReplyService;

/**
 * 回复service实现
 * 
 * @author sly
 * @time 2019年9月14日
 */
@RestController
@Transactional(rollbackFor = Exception.class)
public class ReplyServiceImpl implements ReplyService {

	private static final Logger LOGGER = LoggerFactory.getLogger(ReplyServiceImpl.class);

}
