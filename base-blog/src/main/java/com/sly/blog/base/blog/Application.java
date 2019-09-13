package com.sly.blog.base.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * base-blog启动类
 * 
 * @author sly
 * @time 2019年9月13日
 */
@EnableEurekaClient
@MapperScan("com.sly.blog.base.blog.mapper")
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
