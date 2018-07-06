package com.sun.learn.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.learn.entity.User;
import com.sun.learn.service.FeignService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "fegin测试")
public class FeignController {

	private static final Logger logger = LoggerFactory.getLogger(FeignController.class);

	@Autowired
	private FeignService feignService;

	@ApiOperation(value = "feigin测试接口信息", notes = "feigin测试接口信息Notes")
	@GetMapping(value = "getFeign")
	public Object getFeign(HttpServletRequest request) {
//		logger.info("accept-encoding={}", request.getHeader("accept-encoding"));
//		logger.info("accept-language={}", request.getHeader("accept-language"));
//		logger.info("getFeign Success!");
		return feignService.getFeignInfo();
	}
	
	@ApiOperation(value = "objectParam测试接口信息", notes = "objectParam测试接口信息Notes")
	@GetMapping(value = "objectParam")
	public Object objectParam(HttpServletRequest request) {
		logger.info("accept-encoding={}", request.getHeader("accept-encoding"));
		logger.info("accept-language={}", request.getHeader("accept-language"));
		logger.info("getFeign Success!");
		User user = new User();
		user.setName("张三");
		user.setAddress("深圳市");
		user.setAge(25);
		return feignService.objectParamTest(user);
	}
	
}
