package com.Rutuja.Controller.Sweta;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetController {

	@GetMapping("/greet")
	public String welcomeMsg(Model model) {
		
		String msg="Good Morning....Have a nice day";
		model.addAttribute("MESSAGE", msg);
		return "greet";
		
	}
}
