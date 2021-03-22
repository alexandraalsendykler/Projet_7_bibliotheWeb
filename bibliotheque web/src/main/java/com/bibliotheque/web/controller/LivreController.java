package com.bibliotheque.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bibliotheque.web.model.Livre;
import com.bibliotheque.web.service.LivreService;

@Controller
public class LivreController {
	@Autowired
	private LivreService livreService;
	
	@GetMapping("/")
	public String home(Model model) {
		Iterable<Livre> listLivre=livreService.getLivres();
		model.addAttribute("livres", listLivre);
		
		return "Home";
	}

}
