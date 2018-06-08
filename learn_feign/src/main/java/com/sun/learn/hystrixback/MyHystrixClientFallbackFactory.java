package com.sun.learn.hystrixback;

import org.springframework.stereotype.Component;

import com.sun.learn.remote.FeignRemot;

import feign.hystrix.FallbackFactory;

@Component
public class MyHystrixClientFallbackFactory implements FallbackFactory<FeignRemot> {

	@Override
	public FeignRemot create(Throwable arg0) {
		return new FeignRemot() {
			@Override
			public String getNormal() {
				return "request level down";
			}
		};
	}

}
