package com.example.Weather_Website;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.Weather_Website")
public class WeatherWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherWebsiteApplication.class, args);
	}

}
