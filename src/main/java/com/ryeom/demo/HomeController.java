package com.ryeom.demo;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ryeom.demo.user.Service.UserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	@Inject
	private UserService userService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		
		
		
		
		model.addAttribute("test",userService.Test());
		System.out.println("³ª¿Í¶ó¾å!");
		
		//System.out.println(userService.Test().toString());
		return "index";
	}
	
}
