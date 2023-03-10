package com.ra.product3.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
	
	@Bean
	public Docket docket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/v1/api/**"))

				.build().apiInfo(getInfo());
		
	}

	private ApiInfo getInfo() {
		
		return new ApiInfo("Product Service API", "product","product", "product", new Contact("Rajashree", "http://localhost:9008/v2/api-docs", "ff"), "product", "product",new ArrayList<>());
	}

}
