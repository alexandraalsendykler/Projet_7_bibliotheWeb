package com.bibliotheque.web.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Pret {

	private Integer id;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateReservation;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateDeFin;
	private Boolean disponibilite;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Date getDateReservation() {
		return dateReservation;
	}

	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}

	public Date getDateDeFin() {
		return dateDeFin;
	}

	public void setDateDeFin(Date dateDeFin) {
		this.dateDeFin = dateDeFin;
	}

	public Boolean getDisponibilite() {
		return disponibilite;
	}

	public void setDisponibilite(Boolean disponibilite) {
		this.disponibilite = disponibilite;
	}

}
