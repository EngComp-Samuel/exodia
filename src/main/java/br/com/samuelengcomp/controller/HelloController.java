package br.com.samuelengcomp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exodia")
public class HelloController {

	
	@GetMapping("/hello")
	public void hello() {
		System.out.println("Hello chamando");
	}
	
	@GetMapping("/login")
	public void login() {
		System.out.println("login chamando");
	}
	
}
