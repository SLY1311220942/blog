package com.sly.blog.business.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

import com.sly.plugin.xss.annotation.EnableXssFilter;

/**
 * business-search启动类
 * 
 * @author sly
 * @time 2019年9月13日
 */
@EnableFeignClients(basePackages = "com.sly.blog.base")
@EnableEurekaClient
@EnableCircuitBreaker
@SpringBootApplication
@ComponentScan(basePackages = "com.sly.blog")
@EnableXssFilter
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
