package com.weather.past.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weather.past.restclient.WeatherRestClient;

@Service
public class WeatherInfoServiceBean implements WeatherInfoService {

	@Autowired
	WeatherRestClient weatherRestClient;
	
	@Override
	public String getPastWeatherInfo(String _dateStr, String _cityName) {
        return weatherRestClient.getPastWeekWeatherInfo(_dateStr,_cityName);

	}

}
