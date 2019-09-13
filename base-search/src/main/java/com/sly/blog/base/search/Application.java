package com.sly.blog.base.search;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * base-search启动类
 * 
 * @author sly
 * @time 2019年9月13日
 */
@EnableEurekaClient
@MapperScan("com.sly.blog.base.search.mapper")
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
