package com.sly.blog.base.common;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * base-common启动类
 * 
 * @author sly
 * @time 2019年9月13日
 */
@EnableEurekaClient
@MapperScan("com.sly.blog.base.common.mapper")
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
