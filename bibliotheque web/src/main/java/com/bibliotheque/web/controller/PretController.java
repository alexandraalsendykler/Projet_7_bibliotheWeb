package com.bibliotheque.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bibliotheque.web.repository.PretProxy;
import com.bibliotheque.web.service.PretService;

@Controller
public class PretController {
	
	@Autowired
	private PretService pretService;
	


}
