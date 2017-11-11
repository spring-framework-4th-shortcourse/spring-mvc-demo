package com.kshrd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	public HelloWorldController() {
		System.out.println("Hello!!!");
	}
	
	@RequestMapping(value = {"/", "/about"})
	public String defaultPage(){
		System.out.println("Default!!");
		return "about";
	}
	
	@RequestMapping("/index")
	public String homePage(){
		System.out.println("Index!!");
		return "home";
	}
	
	/*@RequestMapping("/about")
	public String aboutPage(){
		System.out.println("About!!");
		return "about";
	}*/
	
}
