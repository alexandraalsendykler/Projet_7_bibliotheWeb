package com.bibliotheque.web.model;

import java.util.Date;

public class Pret {

	private Utilisateur utilisateurs;

	private Exemplaire exemplaires;

	public Exemplaire getExemplaires() {
		return exemplaires;
	}

	public void setExemplaires(Exemplaire exemplaires) {
		this.exemplaires = exemplaires;
	}

	public Utilisateur getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(Utilisateur utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

	private Integer id;
	private Date DateDeFin;
	private Boolean Statut;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateDeFin() {
		return DateDeFin;
	}

	public void setDateDeFin(Date dateDeFin) {
		DateDeFin = dateDeFin;
	}

	public Boolean getStatut() {
		return Statut;
	}

	public void setStatut(Boolean statut) {
		Statut = statut;
	}

}
