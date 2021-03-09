package com.bibliotheque.web.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Exemplaire {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idExemplaire")

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "idLivre")
	private Livre livres;

	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "idExemplaire")
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
