package com.vinay.springboot.springmvcfullstackapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.vinay.springboot.springmvcfullstackapplication.repository")
@SpringBootApplication
public class SpringMvcFullStackApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcFullStackApplication.class, args);
	}

}
