package com.sun.learn.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("learn-normal")
public interface FeignRemot {

	@RequestMapping(method = RequestMethod.GET, value = "/getNormal")
	public String getNormal();

}
