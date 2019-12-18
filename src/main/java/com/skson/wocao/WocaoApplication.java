package com.skson.wocao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class WocaoApplication extends SpringBootServletInitializer {

	private static Logger logger = LoggerFactory.getLogger(WocaoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(WocaoApplication.class, args);
		System.out.println("=======================================");
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(WocaoApplication.class);
	}

	@RequestMapping("/")
	public Object xx(){
		for (int i = 0; i <100 ; i++) {
			logger.info("--------------9909890");
		}
		return "最骚的就是你";
	}
}
