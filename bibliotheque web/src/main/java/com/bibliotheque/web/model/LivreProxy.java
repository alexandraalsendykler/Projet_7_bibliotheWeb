package com.bibliotheque.web.model;

import javax.persistence.Column;

import lombok.Data;

@Data
public class LivreProxy {
	
	@Column(name = "idLivre")
	private Integer id;
	
	private String titre;
	private String auteur;
	private String resume;



}
