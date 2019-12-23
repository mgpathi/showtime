package com.otsi.showtime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages ="com.otsi.*")
@ComponentScan(basePackages ="com.otsi.*")
public class ShowtimeApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ShowtimeApplication.class, args);
	}

}
