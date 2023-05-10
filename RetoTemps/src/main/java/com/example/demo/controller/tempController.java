package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.tempService;

@RestController
@RequestMapping("/api")
public class tempController {
	@Autowired
	tempService service;

	@GetMapping("/temps/toFah/{temp}")
	public Float toFahrenheit(@PathVariable float temp) {
		return service.cambioTempToF(temp);
	}
	
	@GetMapping("/temps/toCel/{temp}")
	public Float toCelsius(@PathVariable float temp) {
		return service.cambioTempToC(temp);
	}
}
