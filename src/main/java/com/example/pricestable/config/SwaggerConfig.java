//package com.example.pricestable.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//	/**
//	 * Interface for Swagger configuration.
//	 *
//	 * @return Object with Swagger configuration interface.
//	 */
//	@Bean
//	public Docket holidaysApi() {
//		return new Docket(DocumentationType.SWAGGER_2) //
//				.select() //
//				.apis(RequestHandlerSelectors.any()) //
////				.paths(Predicates.not(PathSelectors.regex("/error.*")))// <6>, regex must be in double quotes.
//				.build().apiInfo(apiInfo());//
//	}
//
//	/**
//	 * Api info.
//	 *
//	 * @return the api info
//	 */
//	private ApiInfo apiInfo() {
//		return new ApiInfoBuilder().title("Prices").license("Zara").version("1.0").build();
//	}
//
//}