package com.sun.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

	private static final Logger logger = LoggerFactory.getLogger(EurekaApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class, args);
		logger.info("注册发现服务EurekaApplication启动成功...");
	}

}
