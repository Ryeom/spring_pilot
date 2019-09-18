package com.ryeom.demo.user.Controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ryeom.demo.user.Service.UserService;

@Controller
public class UserController {

	@Inject
	private UserService userService;
	
	@RequestMapping("/login")
	public String login(Model model) {
		
		return "signIn/login";
	}
	
	
}
