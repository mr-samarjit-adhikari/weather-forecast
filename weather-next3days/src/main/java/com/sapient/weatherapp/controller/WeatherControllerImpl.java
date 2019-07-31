package com.sapient.weatherapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.weather.entity.Weather;
import com.sapient.weatherapp.service.WeatherService;

@RestController
public class WeatherControllerImpl{
	@Autowired
	WeatherService		service;
	
	@GetMapping("/{cityname}")
	public Weather getWeatherInfo(@PathVariable("cityname") String city) {
		//System.out.println("Found City = "+city);
		return service.getWeatherForCity(city);
	}
}
