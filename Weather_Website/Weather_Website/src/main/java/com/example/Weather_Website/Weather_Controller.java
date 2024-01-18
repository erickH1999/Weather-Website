package com.example.Weather_Website;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class Weather_Controller {

    public final Weather_Service weatherService;

    public Weather_Controller(Weather_Service weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/weather/{city}")
    public String getWeather(@PathVariable String city, Model model) {

        City_Weather weather = weatherService.getCityLocation(city);
        Weather weather1 = weatherService.getWeather(weather);
        model.addAttribute("weather", weather1);
        return "weather-template";
    }

}

