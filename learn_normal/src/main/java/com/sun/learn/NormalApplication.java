package com.sun.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class NormalApplication {

	private static final Logger logger = LoggerFactory.getLogger(NormalApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(NormalApplication.class, args);
		logger.info("Normal服务NormalApplication启动成功...");
	}

}
