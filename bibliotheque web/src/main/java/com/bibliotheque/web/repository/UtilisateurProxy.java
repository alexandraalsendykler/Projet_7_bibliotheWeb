package com.bibliotheque.web.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.bibliotheque.web.model.Livre;
import com.bibliotheque.web.model.Utilisateur;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class UtilisateurProxy {
	
	@Autowired
	private CustomProperties props;
	
	public Utilisateur getLogin(String email) {
        String baseApiUrl = props.getApiUrl();
        String getLoginUrl = baseApiUrl + "/seconnecter?email="+email;
	
        RestTemplate restTemplate = new RestTemplate();
     //   HttpEntity<String> request = new HttpEntity<>(email);
        ResponseEntity<Utilisateur> response = restTemplate.exchange(
        		getLoginUrl,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<Utilisateur>() {}
                );
        
        return response.getBody(); 
    }

	}
