package com.example.Weather_Website;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@Service
public class Weather_Service {

    private final static String api_Key = "bb42a06815aa8ce5c5a38e819c11c8a2";
    private final static String api_URL = "http://api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid={api_key}";
    private final static String api_City = "https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}";


    private final RestTemplate restTemplate;

    @Autowired
    public Weather_Service(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    public City_Weather getCityLocation(String city) {

        String apiCity = api_City.replace("{city name}", city).replace("{API key}", api_Key);


        return restTemplate.getForObject(apiCity, City_Weather.class);

    }

    public Weather getWeather(City_Weather city) {

        String lat = String.valueOf(city.getLat());
        String lon = String.valueOf(city.getLon());

        String apiURL = api_URL.replace("{lat}", lat).replace("{lon}", lon).replace("{api_key}", api_Key);

        return restTemplate.getForObject(apiURL, Weather.class);
    }


}
