package com.sapient.weather.webclients;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sapient.weather.entity.Weather;

public class RestWebClient extends AbstractWebClient<RestTemplate>{
	
	public RestWebClient(RestTemplate parent) {
		super(parent);
	}

	public ResponseEntity<String> getUrl(String url) {
		RestTemplate client = getParent();
		ResponseEntity<String> response = client.getForEntity(url, String.class);
		return response;
	}
}
