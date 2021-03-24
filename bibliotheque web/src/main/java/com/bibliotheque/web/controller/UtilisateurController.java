package com.bibliotheque.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.bibliotheque.web.model.Utilisateur;
import com.bibliotheque.web.service.UtilisateurService;

@Controller
public class UtilisateurController {

	@Autowired
	private UtilisateurService utilisateurService;

	@GetMapping(value = "/connexion")
	public String seConnecter(Model model) {
	
		return "seConnecter";
	}

	@PostMapping("/seConnecter")
	public ModelAndView seConnecter(@RequestParam(value="email", required = true) String email, ModelMap model, HttpSession session) {
		Utilisateur utilisateur = utilisateurService.getLogin(email); 
		if (utilisateur != null) {
			session.setAttribute("user", utilisateur); // rajouter vérification MDP avec bcrypt
			return new ModelAndView("redirect:/"); // redirect sur page profil et devoir afficher les prêts 
		}
		return new ModelAndView("redirect:/connexion", model); }
}


