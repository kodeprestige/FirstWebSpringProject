package com.kodeprestige.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class HelloKoders {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "HelloKodersForm";
	}
	
	@RequestMapping("processForm")
	public String processForm(HttpServletRequest request, Model model) {
		
		String name = request.getParameter("koderName");
		
		name += " is the best Koder";
		
		model.addAttribute("name", name);
		
		return "HelloKoders";
	}

}
