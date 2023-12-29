package com.spring.demo;

import com.spring.demo.entity.Account;
import com.spring.demo.service.AccountService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(AccountService accountService) {


		return (args) -> {
			List<Account> result =  accountService.getAllAccount();
			for (Account item : result) {
				System.out.println(item.getFullName());
			}

//			System.out.println("Get all data Account table: ");
//			accountService.getAllAccount().forEach(account -> System.out.println(account.getFullName()));
		};
	}
}
