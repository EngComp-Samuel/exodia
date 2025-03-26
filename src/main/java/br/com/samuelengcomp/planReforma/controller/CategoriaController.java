package br.com.samuelengcomp.planReforma.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuelengcomp.planReforma.entidade.Categoria;

@RestController
@RequestMapping("/reforma/categoria")
public class CategoriaController {
	
	@PostMapping("/registrar")
	public ResponseEntity<Categoria> registrar(Categoria categoria) {
		return ResponseEntity.ok(categoria);
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Categoria> listar(){
		List<Categoria> categoria = new ArrayList<>();
		System.out.println("FUI CHAMADO");
		return categoria;
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
