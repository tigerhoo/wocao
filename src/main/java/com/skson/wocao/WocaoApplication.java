package com.skson.wocao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WocaoApplication {

	private static Logger logger = LoggerFactory.getLogger(WocaoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(WocaoApplication.class, args);
		for (int i = 0; i <100 ; i++) {
			System.out.println("=======================================");
			logger.info("--------------9909890");
		}
	}

}
