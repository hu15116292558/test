package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories(basePackages = "com.demo.mapper")
public class EsdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EsdemoApplication.class, args);
	}
}
