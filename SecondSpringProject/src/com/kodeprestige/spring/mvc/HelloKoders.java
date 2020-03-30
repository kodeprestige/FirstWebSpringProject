package com.kodeprestige.spring.mvc;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class HelloKoders {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "HelloKodersForm";
	}
	
	@RequestMapping("processForm")
	//public String processForm(HttpServletRequest request, Model model) {
	public String processForm(@RequestParam("koderName") String name, Model model) {
		
		//String name = request.getParameter("koderName");
		
		name += " is the best Koder";
		
		model.addAttribute("name", name);
		
		return "HelloKoders";
	}

}
