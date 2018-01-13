package com.mike.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mike.controllers.model.ThingCreateRequest;
import com.mike.controllers.model.ThingCreatedResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "Things")
@RestController
@RequestMapping("/things")
public class ThingsController {

	@ApiOperation(value = "Create a Thing")
	@ApiResponses(value = {
			@ApiResponse(code = 201, message = "Created a Thing", response = ThingCreatedResponse.class)
	})
	@ResponseStatus(value = HttpStatus.CREATED)
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ThingCreatedResponse> createApplication(
			final HttpServletResponse response,
			final HttpServletRequest request,
			@ApiParam(name = "incoming_payload", required = true) @Valid @RequestBody final ThingCreateRequest appRequest) {

		return null;
	}

}
