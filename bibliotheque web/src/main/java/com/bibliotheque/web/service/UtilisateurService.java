package com.bibliotheque.web.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bibliotheque.web.model.Utilisateur;
import com.bibliotheque.web.repository.UtilisateurProxy;

import lombok.Data;

@Data
@Service
public class UtilisateurService {

	@Autowired
	private UtilisateurProxy utilisateurProxy;

	public Utilisateur getLogin(String email) {
		return utilisateurProxy.getLogin(email);
	}

	public Optional<Utilisateur> getUtilisateur(Integer id) {
		return utilisateurProxy.getUtilisateur(id);

	}
}
