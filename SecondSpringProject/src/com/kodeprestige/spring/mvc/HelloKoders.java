package com.kodeprestige.spring.mvc;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class HelloKoders {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "HelloKodersForm";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "HelloKoders";
	}

}
