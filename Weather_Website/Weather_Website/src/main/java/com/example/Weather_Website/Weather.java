package com.example.Weather_Website;

import lombok.Getter;
import lombok.Setter;


@Getter
public class Weather {


    @Setter
    private Main main;
    @Setter
    private int timezone;


    @Getter
    public static class Main {
        @Setter
        private double temp;
        @Setter
        private double feels_like;

    }


}
