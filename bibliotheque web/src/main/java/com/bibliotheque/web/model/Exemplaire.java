package com.bibliotheque.web.model;

public class Exemplaire {
	private Iterable<Pret> prets;
	private Integer id;

	public Iterable<Pret> getPrets() {
		return prets;
	}

	public void setPrets(Iterable<Pret> prets) {
		this.prets = prets;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
