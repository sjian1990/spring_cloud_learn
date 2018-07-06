package com.sun.lwarn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StreamApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(StreamApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(StreamApplication.class, args);
		logger.info("Stream服务启动成功...");
	}
	
	
	
	

}
