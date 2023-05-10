package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

@RestController
@RequestMapping("/api")
public class TestController {
	private Counter counter;

	public TestController(MeterRegistry registry) {
		this.counter = Counter.builder("invocaciones.hello").description("invocaciones totales del endpoint").register(registry);
	}

	@GetMapping("/hello")
	public String helloWord() {
		counter.increment();
		return "Hello Word";
	}

}
