package com.bibliotheque.web.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
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

	public Utilisateur saveUtilisateur(Utilisateur utilisateur) {
		Utilisateur savedUtilisateur;
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		String password = encoder.encode(utilisateur.getMotDePasse());
		utilisateur.setMotDePasse(password);
		savedUtilisateur = utilisateurProxy.createUtilisateur(utilisateur);

		return savedUtilisateur;
	}
}
