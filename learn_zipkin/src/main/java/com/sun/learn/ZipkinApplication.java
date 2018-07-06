package com.sun.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import zipkin.server.EnableZipkinServer;


@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class ZipkinApplication {

	private static final Logger logger = LoggerFactory.getLogger(ZipkinApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ZipkinApplication.class, args);
		logger.info("Zipkin服务ZipkinApplication启动成功...");
	}

}
