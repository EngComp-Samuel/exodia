package br.com.samuelengcomp.segurancao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/selectModulos")
public class HomeController {
	
	@GetMapping
	public ModelAndView selecaoModulos() {
		ModelAndView mav = new ModelAndView("homeModulos");
		return mav;
	}

}
