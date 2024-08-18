package com.Register.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Register.Entities.RegisterEntities;

import jakarta.validation.Valid;

@Controller
public class MyController {

	@GetMapping("/reg")
	public String homePage(Model model) {
		System.out.println("Opening Form");

		model.addAttribute("registerEntities", new RegisterEntities());
		return "home"; 
	}

	@PostMapping("/process")
	public String processHandler(@Valid @ModelAttribute("registerEntities") RegisterEntities registerEntities, BindingResult result) {

		if (result.hasErrors()) {
			
			System.out.println(result	);
			return"home";
			
		}
		System.out.println(registerEntities);
		return "sucsses";
	}
}
