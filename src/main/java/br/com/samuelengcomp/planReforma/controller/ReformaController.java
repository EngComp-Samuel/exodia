package br.com.samuelengcomp.planReforma.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuelengcomp.planReforma.entidade.Reforma;

@RestController
@RequestMapping("/reforma")
public class ReformaController {
	
	
	@PostMapping("/registrar")
	public ResponseEntity<Reforma> registrar(Reforma reforma) {
		return ResponseEntity.ok(reforma);
	}
	
	@GetMapping
	public List<Reforma> listar(){
		List<Reforma> reforma = new ArrayList<>();
		return reforma;
	}
	
	@PutMapping("/registrar")
	public ResponseEntity<Reforma> atualizarRegistro(Reforma reforma) {
		return ResponseEntity.ok(reforma);
	}
	
	@PutMapping("/remover")
	public ResponseEntity removerRegistro(Reforma reforma) {
		return ResponseEntity.noContent().build();
	}
	
}
