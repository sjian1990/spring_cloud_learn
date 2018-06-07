package com.sun.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class FeignApplication {

	private static final Logger logger = LoggerFactory.getLogger(FeignApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FeignApplication.class, args);
		logger.info("Feign服务FeignApplication启动成功...");
	}

}
