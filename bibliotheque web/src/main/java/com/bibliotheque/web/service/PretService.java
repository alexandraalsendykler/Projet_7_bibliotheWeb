package com.bibliotheque.web.service;

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
	
	public Iterable<Pret>getPrets() {
		return pretProxy.getPrets(null);

	}
	
	public PretProxy getPretProxy() {
		return pretProxy;
	}

	public void setPretProxy(PretProxy pretProxy) {
		this.pretProxy = pretProxy;
	}
}
