package com.kodeprestige.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/conflict")
public class ConflictsController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "HelloKodersForm";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@RequestParam("koderName") String name, Model model) {
		
		name += " is the worst Koder";
		
		model.addAttribute("name", name);
		
		return "HelloKoders";
	}

}
