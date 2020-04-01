package com.kodeprestige.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/koder")
public class KoderController {
	
	@RequestMapping("/form")
	public String showKoderForm (Model model) {
		
		model.addAttribute("koder", new Koder());
		
		return "KoderRegistrationForm";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("koder") Koder koder) {
		
		
		
		
		return "KoderRegistConfirm";
	}

}
