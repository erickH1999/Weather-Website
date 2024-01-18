package com.example.Weather_Website;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Weather_Config {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
