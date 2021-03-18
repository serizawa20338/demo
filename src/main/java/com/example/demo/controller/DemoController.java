package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

	@GetMapping(value = "/hello")
	public String hello() {
		logger.info("DemoController#hello()");
		// System.out.println("DemoController#hello()");
		return "It works!";
	}
}
