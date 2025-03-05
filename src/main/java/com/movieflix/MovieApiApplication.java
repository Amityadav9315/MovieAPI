package com.movieflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class MovieApiApplication {
	GsonBuilderUtils

	public static void main(String[] args) {
		SpringApplication.run(MovieApiApplication.class, args);
	}

}
