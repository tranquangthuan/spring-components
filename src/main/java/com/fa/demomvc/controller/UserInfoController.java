package com.fa.demomvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.fa.demomvc.entity.User;

@Controller
public class UserInfoController {

	@GetMapping(value = "userinfor")
	public String userInfor(@SessionAttribute("user") User user) {
		System.out.println("user get from Session Attribute " + user);
		return "user";
	}
}
