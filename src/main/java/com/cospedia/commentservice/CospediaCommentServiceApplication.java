package com.cospedia.commentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableEurekaClient
@EnableJpaRepositories
@SpringBootApplication
public class CospediaCommentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CospediaCommentServiceApplication.class, args);
	}
}
