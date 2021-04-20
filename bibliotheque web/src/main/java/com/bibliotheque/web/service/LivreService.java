package com.bibliotheque.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bibliotheque.web.model.Exemplaire;
import com.bibliotheque.web.model.Livre;
import com.bibliotheque.web.model.Pret;
import com.bibliotheque.web.repository.LivreProxy;

import lombok.Data;

@Data
@Service
public class LivreService {

	@Autowired
	private LivreProxy livreProxy;

	/*
	 * public Livre getLivre(final int id) { return livreProxy.getlivre(id); }
	 */

	public Iterable<Livre> getLivres() {
		Iterable<Livre> livres = livreProxy.getLivres();
		for (Livre livre : livres) {
			Integer nbExemplairesDisponibles = 0;
			List<Exemplaire> exemplaires = livre.getExemplaires();
			for (Exemplaire exemplaire : exemplaires) {
				Integer count = 0;
				Iterable<Pret> prets = exemplaire.getPrets();
				for (Pret pret : prets) {
					if (pret.getStatut().equals("en cours") || pret.getStatut().equals("prolongé")) {
						count++;
					}
				}
				if (count == 0) {
					nbExemplairesDisponibles++;
				}
			}

			livre.setNbExemplairesDisponibles(nbExemplairesDisponibles);
		}
		return livres;
	}

	public Iterable<Livre> getLivresSearch(String search) {
		Iterable<Livre> livres = livreProxy.getLivresSearch(search);
		for (Livre livre : livres) {
			Integer nbExemplairesDisponibles = 0;
			List<Exemplaire> exemplaires = livre.getExemplaires();
			for (Exemplaire exemplaire : exemplaires) {
				Integer count = 0;
				Iterable<Pret> prets = exemplaire.getPrets();
				for (Pret pret : prets) {
					if (pret.getStatut().equals("en cours") || pret.getStatut().equals("prolongé")) {
						count++;
					}
				}
				if (count == 0) {
					nbExemplairesDisponibles++;
				}
			}

			livre.setNbExemplairesDisponibles(nbExemplairesDisponibles);
		}
		return livres;
	}

	public LivreProxy getLivreProxy() {
		return livreProxy;
	}

	public void setLivreProxy(LivreProxy livreProxy) {
		this.livreProxy = livreProxy;
	}

}
