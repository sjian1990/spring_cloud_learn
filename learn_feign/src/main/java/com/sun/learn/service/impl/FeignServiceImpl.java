package com.sun.learn.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.learn.entity.User;
import com.sun.learn.remote.FeignRemot;
import com.sun.learn.service.FeignService;

@Service
public class FeignServiceImpl implements FeignService {
	
	private static final Logger logger = LoggerFactory.getLogger(FeignServiceImpl.class);
	
	@Autowired
	private FeignRemot feignRemot; 
	
	@Override
	public Object getFeignInfo() {
		
		String result = feignRemot.getNormal();
		logger.info("getNormal Success!");
		
		logger.info(result.toString());
		return result;
	}

	@Override
	public Object objectParamTest(User user) {
		String result = feignRemot.objectParamTest(user);
		return result;
	}

}
