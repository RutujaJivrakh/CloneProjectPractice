package com.Rutuja.Controller.Ashwini;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class StudentController {
	@GetMapping("/student")
	public String name(Model model) {
		String n="sameer";
		model.addAttribute("Name",n);
		return n;
	}
}
