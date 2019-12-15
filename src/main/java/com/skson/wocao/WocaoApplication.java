package com.skson.wocao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class WocaoApplication {

	private static Logger logger = LoggerFactory.getLogger(WocaoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(WocaoApplication.class, args);
		System.out.println("=======================================");
	}

	@RequestMapping("/")
	public Object xx(){
		for (int i = 0; i <100 ; i++) {
			logger.info("--------------9909890");
		}
		return null;
	}
}
