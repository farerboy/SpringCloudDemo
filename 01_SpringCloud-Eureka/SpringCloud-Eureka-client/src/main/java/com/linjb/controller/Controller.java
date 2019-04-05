package com.linjb.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Value("${server.port}")
	String port;

	@RequestMapping("/home")
	public String home() {
		return "hello world from port "+port;
	}
}
