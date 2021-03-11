package com.bibliotheque.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bibliotheque.web.model.Livre;
import com.bibliotheque.web.repository.LivreProxy;

import lombok.Data;

@Data
@Service
public class LivreService {

	@Autowired
	private LivreProxy livreProxy;

	/*public Livre getLivre(final int id) {
		return livreProxy.getlivre(id);
	}*/

	public Iterable<Livre> getLivres() {
		return livreProxy.getlivre();
	}
/*
	public void deleteLivre(final int id) {
		livreProxy.deleteLivre(id);
		;
	}

	public Livre saveLivre(Livre livre) {
		Livre savedLivre;

		// Règle de gestion : Le nom du livre doit être mis en majuscule.

		livre.setLastName(livre.getLastName().toUpperCase());

		if (livre.getId() == null) {
			// Si l'id est nul, alors c'est un nouvel employé.
			savedLivre = livreProxy.createLivre(livre);
		} else {
			savedLivre = livreProxy.updateEmployee(livre);
		}

		return savedLivre;
	}
*/
	public LivreProxy getLivreProxy() {
		return livreProxy;
	}

	public void setLivreProxy(LivreProxy livreProxy) {
		this.livreProxy = livreProxy;
	}

}
