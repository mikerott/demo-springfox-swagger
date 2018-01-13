package com.mike.controllers.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "ThingChild", description = "Child information")
public class ThingRequestChildObject {

	@ApiModelProperty(value = "First Name", example = "Robert")
	@JsonProperty("first_name")
	private String firstname;

	public String getTheThingFirstName() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

}