package com.sun.learn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="normal接口")
@RestController
public class NormalController {
	private static final Logger logger = LoggerFactory.getLogger(NormalController.class);
	
	@Value("${keys.values}")
	private String keysValue;
	
	@ApiOperation(value = "normal测试接口信息", notes = "normal测试接口信息Notes")
	@RequestMapping(value = "/getNormal", method = RequestMethod.GET)
	@ResponseBody
	public String getNormal(){
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		logger.info(keysValue);
		return keysValue;
	}
	
}
