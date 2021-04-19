package com.bibliotheque.web.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bibliotheque.web.model.Pret;
import com.bibliotheque.web.repository.PretProxy;

import lombok.Data;

@Data
@Service
public class PretService {

	@Autowired
	private PretProxy pretProxy;

	public Optional<Pret> getPrets() {
		return pretProxy.getPret(null);

	}

	public Optional<Pret> getPret(Integer id) {
		return pretProxy.getPret(id);

	}

	public PretProxy getPretProxy() {
		return pretProxy;
	}

	public void setPretProxy(PretProxy pretProxy) {
		this.pretProxy = pretProxy;
	}

	public Optional<Pret> saveProlongation(Integer id) {
		return pretProxy.saveProlongation(id);

	}
}
