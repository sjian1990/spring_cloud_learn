package com.sun.learn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NormalController {
	private static final Logger logger = LoggerFactory.getLogger(NormalController.class);
	
	
	@RequestMapping(value = "/getNormal", method = RequestMethod.GET)
	@ResponseBody
	public String getNormal(){
		logger.info("getNormal success!");
		return "normal";
	}
	
}
