package com.Rutuja.Controller.Jyoti;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
@GetMapping("/welcome")
	public String msg(Model model) {
	String m="Welcome To Bikkad IT";
	model.addAttribute("MSG",m);
	return "welcome";
		
		
		
	}
}
