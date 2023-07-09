package com.cdac.lelogaadi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
//@EnableAutoConfiguration(exclude = {
//        SecurityAutoConfiguration.class
//})
@SpringBootApplication
public class LeloGaadiBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeloGaadiBackendApplication.class, args);
	}

}