package com.bibliotheque.web.controller;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bibliotheque.web.model.Pret;
import com.bibliotheque.web.model.Utilisateur;
import com.bibliotheque.web.service.PretService;
import com.bibliotheque.web.service.UtilisateurService;

@Controller
public class PretController {

	@Autowired
	private PretService pretService;
	@Autowired
	private UtilisateurService utilisateurService;

	@GetMapping(value = "/confirmationprolongation/{id}")
	public String confirmationprolongation(@PathVariable("id") final int id, Model model) {
		Optional<Pret> pret = pretService.getPret(id);
		model.addAttribute("prets", pret.get());
		return "prolongerreservation";
	}

	@GetMapping(value = "/prolonger/{id}")
	public String prolonger(@PathVariable("id") final int id, Model model, HttpSession session) {
		Optional<Pret> pret = pretService.saveProlongation(id);
		Utilisateur utilisateur = (Utilisateur) session.getAttribute("user");
		Optional<Utilisateur> newSessionUser = utilisateurService.getUtilisateur(utilisateur.getId()); 
		session.setAttribute("user", newSessionUser.get());
		return ("redirect:/profil");
	}

}
