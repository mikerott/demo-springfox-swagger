package com.mike.controllers.model;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "New Thing", description = "New thing request body")
public class ThingCreateRequest {

	@NotNull
	@ApiModelProperty(value = "The thing's name", required = true, example = "Thing1")
	private String name;

	@ApiModelProperty(name = "thingChild", value = "The Thing's child")
	@Valid
	@JsonProperty("child")
	private ThingRequestChildObject theThingChild;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ThingRequestChildObject getTheThingChild() {
		return theThingChild;
	}

	public void setTheThingChild(ThingRequestChildObject theThingChild) {
		this.theThingChild = theThingChild;
	}

}
