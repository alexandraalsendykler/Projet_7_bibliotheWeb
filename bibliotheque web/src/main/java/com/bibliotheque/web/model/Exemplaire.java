package com.bibliotheque.web.model;

import java.util.List;

public class Exemplaire {
	private List<Pret> prets;
	private Integer id;

	public List<Pret> getPrets() {
		return prets;
	}

	public void setPrets(List<Pret> prets) {
		this.prets = prets;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
