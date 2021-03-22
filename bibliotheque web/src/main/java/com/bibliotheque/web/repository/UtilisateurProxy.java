package com.bibliotheque.web.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
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
	
	public Utilisateur getLogin(Utilisateur loginUtilisateur) {
        String baseApiUrl = props.getApiUrl();
        String getLoginUrl = baseApiUrl + "/seconnecter";
	
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<Utilisateur> request = new HttpEntity<>(loginUtilisateur, new HttpHeaders());
        ResponseEntity<Utilisateur> response = restTemplate.postForEntity(
        		getLoginUrl,
        		request,
                null,
                new ParameterizedTypeReference<Utilisateur>() {}
                );
        
        return response.getBody(); // remplacer le post par un get 
    }

	}
