package com.test.SpringSwagger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("rest/hello")
public class HelloResource {
	
	@ApiOperation(value ="Return Hello World")
	@ApiResponses(
				value = {
						@ApiResponse(code = 100, message = "100 is the message"),
						@ApiResponse(code = 200, message = "Successsful Hello")
				}
			)
	@GetMapping
	public String hello() {
		return "Hello World";
	}
	
	@ApiOperation(value ="Return Hello")
	@PostMapping("/post")
	public String helloPost(@RequestBody final String hello) {
		return hello;
	}
	
	@ApiOperation(value ="Return Hello of put method")
	@PutMapping("/put")
	public String helloPut(@RequestBody final String hello) {
		return hello;
	}
}
