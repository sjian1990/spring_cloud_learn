package com.sun.learn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicates;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@SuppressWarnings("unchecked")
public class Swagger2Config {
	
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
				.paths(Predicates.or( // 这里添加你需要展示的接口
						//PathSelectors.ant("/**"), 
						//PathSelectors.ant("/test/**"), 
						//PathSelectors.ant("/user/**"),
						PathSelectors.ant("/**")
						))
				.apis(RequestHandlerSelectors.basePackage("com.sun.learn.controller"))
				.build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
					.title("Feign接口")
					.description("说明RESTful APIs")
					.version("1.0").build();
	}
}
