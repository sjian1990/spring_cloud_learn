package com.sun.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigApplication {

	private static final Logger logger = LoggerFactory.getLogger(ConfigApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ConfigApplication.class, args);
		logger.info("配置服务ConfigApplication启动成功...");
	}

}
