package br.com.samuelengcomp.planReforma.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.samuelengcomp.planReforma.entidade.Categoria;
import br.com.samuelengcomp.planReforma.repository.CategoriaRepository;

//@RestController
@Controller
@RequestMapping("/reforma/categoria")
public class CategoriaController {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	
	
	@PostMapping("/registrar")
	public ResponseEntity<Categoria> registrar(Categoria categoria) {
		return ResponseEntity.status(HttpStatus.OK).body(categoria);
	}
	
	@GetMapping//(produces = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView listarCategorias(){
		
		Categoria cat = new Categoria("armazem 2");
		categoriaRepository.save(cat);
		
		List<Categoria> categorias = categoriaRepository.findAll();
		ModelAndView mav = new ModelAndView("categoria");
		mav.addObject("categorias", categorias);
		
		//return ResponseEntity.ok(mav);
		return mav;
	}
	
	@GetMapping(value = "/{id}" ,produces = MediaType.APPLICATION_JSON_VALUE)
	public Categoria buscar(@PathVariable("id") Integer id){ //@PathVariable("id") Integer id ou @PathVariable Integer id
		Categoria categoria = new Categoria();
		System.out.println("FUI CHAMADO");
		return categoria;
	}
	
	@PutMapping("/registrar")
	public ResponseEntity<Categoria> atualizarRegistro(Categoria categoria) {
		return ResponseEntity.ok(categoria);
	}
	
	@DeleteMapping("/remover")
	public ResponseEntity removerRegistro(Categoria categoria) {
		return ResponseEntity.noContent().build();
	}

}
