package com.fa.demomvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.fa.demomvc.entity.User;

@Controller
@SessionAttributes("user")
public class LoginController {

	@GetMapping("login")
	public String home(Model model) {
		// model.addAttribute("user", new User());
		return "login";
	}

	@PostMapping("doLogin")
	public String doLogin(@ModelAttribute("user") User user, Model model) {
		if (user.getUsername().equals("admin") && user.getPassword().equals("admin")) {
			user.setEmail("admin@gmail.com");
			user.setAddress("Da Nang");

			return "home";
		}
		return "login";
	}

	@ModelAttribute("user")
	public User setupUser() {
		return new User();
	}

}
