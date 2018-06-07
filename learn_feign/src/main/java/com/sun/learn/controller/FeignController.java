package com.sun.learn.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.learn.service.FeignService;

@RestController
public class FeignController {
	
	private static final Logger logger = LoggerFactory.getLogger(FeignController.class);
	
	@Autowired
	private FeignService feignService;
	
	@GetMapping(value="getFeign")
	public Object getFeign(HttpServletRequest request){
		logger.info("accept-encoding={}", request.getHeader("accept-encoding"));
		logger.info("accept-language={}", request.getHeader("accept-language"));
		logger.info("getFeign Success!");
		return feignService.getFeignInfo();
	}
}
