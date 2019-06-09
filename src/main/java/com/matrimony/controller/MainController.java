package com.matrimony.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping(value = "/{locale:en|fr}/login1", produces = "text/html")
	public String staticResource(Model model) {
		return "login1";

	}

}