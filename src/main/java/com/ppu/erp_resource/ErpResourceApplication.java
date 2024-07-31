package com.ppu.erp_resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class ErpResourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErpResourceApplication.class, args);
	}

	@GetMapping("hello")s
	public String hello() {
		return "Hello World Earth";
	}
	
}
