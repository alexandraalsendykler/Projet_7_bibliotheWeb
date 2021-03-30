package com.bibliotheque.web.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.bibliotheque.web.model.Pret;
import com.bibliotheque.web.service.PretService;

@Controller
public class PretController {

	@Autowired
	private PretService pretService;

	@GetMapping(value = "/confirmationprolongation/{id}")
	public String confirmationprolongation(@PathVariable("id") final int id, Model model) {
		Optional<Pret> pret = pretService.getPret(id);
		model.addAttribute("prets", pret);
		return "confirmationprolongation";
	}
	@GetMapping(value = "/prolonger/{id}")
	public String prolonger(@PathVariable("id") final int id, Model model) {
		Optional<Pret> pret = pretService.getPret(id);
		model.addAttribute("prets", pret);
		return ("redirect:/profil");
	}
}
