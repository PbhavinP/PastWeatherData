package com.weather.past.restclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.weather.past.model.Weather;

@Component
public class WeatherRestClient {

	@Value("${service.weather.appkey}")
	String weatherAppKey;
    @Value("${spring.weather.url}")
    String weatherURL;

	
	/**
	 * Returns set of unique reactive project names 
	 * @return
	 */
	
	public String getPastWeekWeatherInfo(String _dateStr,String _cityName) {
        weatherURL = weatherURL + _dateStr + "20060405/q/CA/"+_cityName+".json";
		RestTemplate template=new RestTemplate();
		System.out.println(weatherURL);
		//Observations observations  = template.getForObject(weatherURL, Observations.class);
		String str = template.getForObject(weatherURL, String.class);
		return str;
		//return observations;
	}


}

