package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerExample {

	@GetMapping("/Message")
	public String form(Model model)
	{
		String msg="Welcome";
		model.addAttribute("xyz",msg);
		return "msg";
	}
	
	
}
