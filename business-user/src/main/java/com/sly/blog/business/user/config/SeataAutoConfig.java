package com.sly.blog.business.user.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sly.blog.common.constant.SeataConstant;

import io.seata.spring.annotation.GlobalTransactionScanner;

/**
 * seata配置
 * 
 * @author sly
 * @time 2019年6月11日
 */
@Configuration
public class SeataAutoConfig {

	/**
	 * 初始化全局事务扫描
	 * 
	 * @return
	 * @author sly
	 * @time 2019年6月11日
	 */
	@Bean
	public GlobalTransactionScanner globalTransactionScanner() {
		return new GlobalTransactionScanner("business-user", SeataConstant.TX_SERVICE_GROUP);
	}
}
