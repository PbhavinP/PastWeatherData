package com.weather.past.model;

import java.io.Serializable;
import java.util.LinkedHashMap;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Observations implements Serializable{


		private String history;

		public String getHistory() {
			return history;
		}

		public void setHistory(String history) {
			this.history = history;
		}
				
}
