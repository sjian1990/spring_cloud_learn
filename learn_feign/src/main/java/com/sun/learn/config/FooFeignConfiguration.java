package com.sun.learn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Response;
import feign.codec.ErrorDecoder;

@Configuration
public class FooFeignConfiguration {
	@Bean
	public ErrorDecoder errorDecoder(){
		
		return new ErrorDecoder() {
			@Override
			public Exception decode(String methodKey, Response response) {
				return new Exception(methodKey);
			}
		};
	}
	
}
