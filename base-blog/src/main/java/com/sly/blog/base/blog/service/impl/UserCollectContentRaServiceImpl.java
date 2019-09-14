package com.sly.blog.base.blog.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import com.sly.blog.base.blog.service.UserCollectContentRaService;

/**
 * 用户收藏文章关系service接口
 * 
 * @author sly
 * @time 2019年9月14日
 */
@RestController
@Transactional(rollbackFor = Exception.class)
public class UserCollectContentRaServiceImpl implements UserCollectContentRaService {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserCollectContentRaServiceImpl.class);

}
