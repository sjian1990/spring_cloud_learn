package com.sun.learn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Oauth2服务端测试Controller类
 * 
 * @author sunjian
 * @company 深圳信用宝金融服务有限公司
 * @version 0.1
 * @date 2018年7月4日
 */
@RestController
public class Oauth2Controller {
	private final static Logger logger = LoggerFactory.getLogger(Oauth2Controller.class);

	/**
	 * Oauth2服务端测试调用接口
	 * 
	 * @return
	 */
	@GetMapping("/oauth2ServerTest")
	public Object oauth2ServerTest() {
		logger.info("Oauth2服务端调用成功!");
		return "Oauth2服务端调用成功!";
	}
}
