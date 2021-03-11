package com.bibliotheque.web.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.bibliotheque.web.model.Livre;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class LivreProxy {
	
	@Autowired
	private CustomProperties props;
	
	 public Iterable<Livre> getlivre() {
	        String baseApiUrl = props.getApiUrl();
	        String getLivresUrl = baseApiUrl + "/Livres";

	        RestTemplate restTemplate = new RestTemplate();
	        ResponseEntity<Iterable<Livre>> response = restTemplate.exchange(
	                getLivresUrl,
	                HttpMethod.GET,
	                null,
	                new ParameterizedTypeReference<Iterable<Livre>>() {}
	                );

	        // log.debug("Get Livres" + response.getStatusCode().toString());
	        
	        return response.getBody();
	    }

}
