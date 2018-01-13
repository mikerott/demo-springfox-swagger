package com.mike.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.schema.contexts.ModelPropertyContext;

//@Component
//@Order(SwaggerPluginSupport.SWAGGER_PLUGIN_ORDER + 1000)
public class CustomTypeNameProviderPlugin {// implements ModelPropertyBuilderPlugin {

	// See: https://github.com/springfox/springfox/issues/1180

	public boolean supports(DocumentationType context) {
		return true;
	}

	public void apply(ModelPropertyContext context) {
		for (BeanPropertyDefinition def : context.getBeanPropertyDefinition().asSet()) {
			if (def.getField().hasAnnotation(JsonProperty.class)) {
				String newName = def.getField().getAnnotation(JsonProperty.class).value();
				System.out.println("MIKE: renaming '" + def.getField().getFullName() + "' to '" + newName + "'");
				context.getBuilder().name(newName).build();
			} else {
				context.getBuilder().name(def.getField().getName()).build();
			}
		}

	}

}
