package com.Rutuja.Controller.Pratibha;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WishController {
	
	@GetMapping("/wish")
	public String wish(Model model)
	{
		String s1="welcome to BikkadIT";
		model.addAttribute("WISH", s1);
		return "wish";
	}

}
