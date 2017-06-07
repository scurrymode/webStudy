package com.sist.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("movie/main.do")
	public String moive_main(Model model, String name){
		model.addAttribute("msg", "Spring MVC!!"+name);
		
		return "main";
	}

}
