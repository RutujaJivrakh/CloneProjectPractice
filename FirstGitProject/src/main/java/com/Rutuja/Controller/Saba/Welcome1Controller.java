package com.Rutuja.Controller.Saba;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class Welcome1Controller {
	
	@GetMapping("/loginlink")
	public String msg(Model model) {
	String m="Welcome to new project";
	model.addAttribute("LOGIN",m);
	return "login";
		
		
		
	}

}
