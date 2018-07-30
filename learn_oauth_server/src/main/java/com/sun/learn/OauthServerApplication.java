package com.sun.learn;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.alibaba.druid.pool.DruidDataSource;


@SpringBootApplication
//@EnableFeignClients("com.sun.learn.controller")
public class OauthServerApplication {

	private final static Logger logger = LoggerFactory.getLogger(OauthServerApplication.class);
	
	@Bean
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource dataSource() {
	    return new DruidDataSource();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(OauthServerApplication.class, args);
		logger.info("Oauth2服务端OauthServerApplication启动成功...");
	}

}
