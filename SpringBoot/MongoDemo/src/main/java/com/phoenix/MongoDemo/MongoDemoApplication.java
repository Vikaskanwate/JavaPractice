package com.phoenix.MongoDemo;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class MongoDemoApplication {

	@Autowired
	private MongoTemplate mongoTemplate;
	public static void main(String[] args) {
		SpringApplication.run(MongoDemoApplication.class, args);
	}


	@PostConstruct
	public void checkDB() {
		System.out.println("Connected DB: " + mongoTemplate.getDb().getName());

	}
}
