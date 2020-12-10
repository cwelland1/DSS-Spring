package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class templateController {

	@GetMapping("/template")
	public String template() {
		return "template";
	}
	
	@GetMapping("/JTEST")
	public String JTEST() {
		return "JTEST";
	}
	@GetMapping("/StartBrowser")
	public String StartBrowser() {
	return "StartBrowser";

}

}
