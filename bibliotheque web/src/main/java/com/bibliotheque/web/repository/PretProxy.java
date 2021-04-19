package com.bibliotheque.web.repository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.bibliotheque.web.model.Pret;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class PretProxy {

	@Autowired
	private CustomProperties props;

	public Optional<Pret> getPret(Integer id) {
		String baseApiUrl = props.getApiUrl();
		String getPretsUrl = baseApiUrl + "/Pret/" + id;

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Optional<Pret>> response = restTemplate.exchange(getPretsUrl, HttpMethod.GET, null,
				new ParameterizedTypeReference<Optional<Pret>>() {
				});
		return response.getBody();
	}

	public Optional<Pret> saveProlongation(Integer id) {
		String baseApiUrl = props.getApiUrl();
		String getPretsUrl = baseApiUrl + "/Prolonger/" + id;

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Optional<Pret>> response = restTemplate.exchange(getPretsUrl, HttpMethod.GET, null,
				new ParameterizedTypeReference<Optional<Pret>>() {
				});
		return response.getBody();
	}

}
