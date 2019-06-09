package com.matrimony;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.matrimony.controller,com.matrimony.service"})
public class MatrimonyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MatrimonyApplication.class, args);
	}

}
