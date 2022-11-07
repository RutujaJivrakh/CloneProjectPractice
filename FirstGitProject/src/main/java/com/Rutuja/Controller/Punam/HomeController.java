package com.Rutuja.Controller.Punam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/homeurl")
	public String homeMsg(Model model) {
		
		String msg="Home controller class";
		System.out.println("Welcome to Bilkkad IT 04 Team");
		
		model.addAttribute("ABC", msg);
		
		return "home";
		
	}
}
