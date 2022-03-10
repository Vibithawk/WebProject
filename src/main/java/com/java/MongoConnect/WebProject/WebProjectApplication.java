package com.java.MongoConnect.WebProject;

import com.java.MongoConnect.WebProject.Model.BookModel;
import com.java.MongoConnect.WebProject.Model.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@EnableAutoConfiguration
public class WebProjectApplication  implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(WebProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
