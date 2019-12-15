package com.skson.wocao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WocaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WocaoApplication.class, args);
		for (int i = 0; i <100 ; i++) {
			System.out.println("=======================================");
		}
	}

}
