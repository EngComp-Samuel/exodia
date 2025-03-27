package br.com.samuelengcomp.segurancao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class IndexController {

	@GetMapping(value = {"index", ""})
	public ModelAndView telaIndex() {
		ModelAndView index = new ModelAndView("index");
				
		index.addObject("saudacao", "Bem-Vindo ao Sistema ");
		index.addObject("nomeSistema", "Exodia");
		index.addObject("descricaoSistema", "Sistema Completo para gestão financeira");
		index.addObject("copyright", "Copyright - Samuel Farias 2025");
		return index;
	}
	
}
