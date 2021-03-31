package com.bibliotheque.web.repository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.bibliotheque.web.model.Utilisateur;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class UtilisateurProxy {

	@Autowired
	private CustomProperties props;

	public Utilisateur getLogin(String email) {
		String baseApiUrl = props.getApiUrl();
		String getLoginUrl = baseApiUrl + "/seconnecter/" + email;
		System.out.println(getLoginUrl); // à virer pour tester si données apparaissent dans console
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Utilisateur> response = restTemplate.exchange(getLoginUrl, HttpMethod.GET, null,
				Utilisateur.class);
		System.out.println(response.getBody());
		return response.getBody();
	}

	public Optional<Utilisateur> getUtilisateur(Integer id) {
		String baseApiUrl = props.getApiUrl();
		String getPretsUrl = baseApiUrl + "/user/" + id;

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Optional<Utilisateur>> response = restTemplate.exchange(getPretsUrl, HttpMethod.GET, null,
				new ParameterizedTypeReference<Optional<Utilisateur>>() {
				});
		return response.getBody();
	}
}
