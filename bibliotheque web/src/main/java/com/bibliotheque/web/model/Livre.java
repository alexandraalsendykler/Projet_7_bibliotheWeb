package com.bibliotheque.web.model;

import java.util.List;

public class Livre {

	private Integer id;
	private String titre;
	private String auteur;
	private String resume;
	private List<Exemplaire> exemplaires;
	private Integer nbExemplairesDisponibles;
	
	public Integer getNbExemplairesDisponibles() {
		return nbExemplairesDisponibles;
	}

	public void setNbExemplairesDisponibles(Integer nbExemplairesDisponibles) {
		this.nbExemplairesDisponibles = nbExemplairesDisponibles;
	}

	public List<Exemplaire> getExemplaires() {
		return exemplaires;
	}

	public void setExemplaires(List<Exemplaire> exemplaires) {
		this.exemplaires = exemplaires;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

}
