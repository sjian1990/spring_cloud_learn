package com.sun.learn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicates;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@SuppressWarnings("unchecked")
public class Swagger2Config {
	
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.paths(Predicates.or( // 这里添加你需要展示的接口
						//PathSelectors.ant("/**"), 
						//PathSelectors.ant("/test/**"), 
						//PathSelectors.ant("/user/**"),
						PathSelectors.ant("/*")
						))
				.apis(RequestHandlerSelectors.basePackage("com.sun.learn.controller"))
				.build();

	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
					.title("Normal接口文档")
					.description("Normal接口文档RESTful APIs")
					.contact(new Contact("sunjian", "https://www.google.com", "505444609@qq.com"))
					.version("1.0")
					.build();
	}
}
