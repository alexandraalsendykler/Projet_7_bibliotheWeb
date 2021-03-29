package com.bibliotheque.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.bibliotheque.web.service.PretService;

@Controller
public class PretController {
	
	@Autowired
	private PretService pretService;
	


}
