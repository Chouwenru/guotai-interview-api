package com.cathaybk.interview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableJpaRepositories(basePackages = "com.cathaybk.interview.repository")
public class CathayIntervieApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(CathayIntervieApiApplication.class, args);
	}
}
