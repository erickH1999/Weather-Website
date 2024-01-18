package com.example.Weather_Website;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
public class City_Weather {

    @Setter
    private double lat;
    @Setter
    private double lon;


}
