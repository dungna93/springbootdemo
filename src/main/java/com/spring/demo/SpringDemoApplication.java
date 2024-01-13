package com.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.util.Arrays;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringDemoApplication.class);
		Environment env = app.run(args).getEnvironment();
		System.out.println("Cấu hình CORS: " + Arrays.toString(env.getProperty("spring.mvc.cors.allowed-origins").split(",")));
	}

}
