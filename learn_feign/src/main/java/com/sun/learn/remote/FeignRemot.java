package com.sun.learn.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sun.learn.config.FooFeignConfiguration;
import com.sun.learn.entity.User;
import com.sun.learn.hystrixback.MyHystrixClientFallbackFactory;

@FeignClient(name ="learn-normal", 
			 configuration=FooFeignConfiguration.class, 
			 fallbackFactory=MyHystrixClientFallbackFactory.class)
public interface FeignRemot {

	@RequestMapping(method = RequestMethod.GET, value = "/getNormal")
	public String getNormal();

	@PostMapping(path="objectParamTest",consumes="application/json")
	public String objectParamTest(User user);

}
