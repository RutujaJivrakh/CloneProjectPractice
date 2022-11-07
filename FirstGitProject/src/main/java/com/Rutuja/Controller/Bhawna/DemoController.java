package com.Rutuja.Controller.Bhawna;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/hello")
	public String form(Model model)
	{
		String m="Hello World!";
		model.addAttribute("jain",m);
		return "hello";
	}
}
