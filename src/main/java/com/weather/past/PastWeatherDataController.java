package com.weather.past;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.weather.past.model.Weather;
import com.weather.past.service.WeatherInfoServiceBean;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class PastWeatherDataController {
	@Autowired
	WeatherInfoServiceBean weatherInfoServiceBean;

	@ApiOperation(value = "getPastWeatherInformation", notes = "Returns a Past week weather info for entered city.",
			      produces = "application/json", response = Weather.class, responseContainer = "List")
	@ApiResponses(value = {@ApiResponse(code = 200, message = "Successfully Returns a Past week weather info for entered city.")})	   

	@RequestMapping(value="/rest/pastweather/{date}/{cityname}",method = RequestMethod.GET)
	public ResponseEntity<String> getPastWeatherInformation(@PathVariable("date") String _dateStr,@PathVariable("cityname") String _cityName) {
		return new ResponseEntity<String>(weatherInfoServiceBean.getPastWeatherInfo(_dateStr, _cityName), HttpStatus.OK);

	}
}
