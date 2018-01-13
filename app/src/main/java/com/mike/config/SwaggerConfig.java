package com.mike.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mike.App;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage(App.class.getPackage().getName()))
				.paths(PathSelectors.regex("/.*"))
				.build()
				.apiInfo(apiInfo())
				.tags(new Tag("My App", "My App Description"))
				.useDefaultResponseMessages(false)
				.forCodeGeneration(true);
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("Thing Manager")
				.description("Use this to manage Things")
				.version("1.0")
				.contact(new Contact("Mike", "", ""))
				.license("")
				.build();
	}
}