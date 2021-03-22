package com.bibliotheque.web.model;

import java.util.List;

public class Exemplaire {

	private Livre livres;

	private List<Pret> prets;

	public List<Pret> getPrets() {
		return prets;
	}

	public void setPrets(List<Pret> prets) {
		this.prets = prets;
	}

	public Livre getLivres() {
		return livres;
	}

	public void setLivres(Livre livres) {
		this.livres = livres;
	}

	private Integer id;
	private Integer NombrePhysiqueExemplaire;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNombrePhysiqueExemplaire() {
		return NombrePhysiqueExemplaire;
	}

	public void setNombrePhysiqueExemplaire(Integer nombrePhysiqueExemplaire) {
		NombrePhysiqueExemplaire = nombrePhysiqueExemplaire;
	}

}
