package com.fa.demomvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@GetMapping("home")
	public String home(Model model) {
		model.addAttribute("message", "send data by Model");
		return "home";
	}

	@GetMapping(value = "home1")
	public String home1(ModelMap model) {
		model.addAttribute("message", "Send data by Modelmap");
		return "home";
	}

	@GetMapping(value = "home2")
	public ModelAndView home2() {
		ModelAndView modelAndView = new ModelAndView("home");
		modelAndView.addObject("message", "Send data by ModelAndView");
		return modelAndView;
	}
}
