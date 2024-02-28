package com.projetojpa.projetojpa01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projetojpa.projetojpa01.dto.LivroDTO;
import com.projetojpa.projetojpa01.service.LivroService;

@RestController
@RequestMapping 
public class LivroController {
	
	private final LivroService livroService;
	
	@Autowired
	public LivroController(LivroService livroService) {
		this.livroService = livroService;
	}

	@PostMapping
	public ResponseEntity(LivroDTO) criar(@RequestBody @Valid Livro livro){
		LivroDTO salvar(Livro = livroService.salvar(livro);
		return ResponseEntity.status(HttpStatus.CREATED).body(salavarLivro);
	}
	
	@PutMapping("/{}id")
	public ResponseEntity<LivroDTO> alterarClienteControl(@PathVariable Long id, @RequestBody @Valid Livro livro){
		LivroDTO alterarLivroDTO = livroService.atualizar(id, livro);
		if(alterarLivroDTO != null) {
			return ResponseEntity.ok(alteraLivroDTO);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Livro> apagaClienteControl(PathVariable Long id){
		boolean apagar = livroService.deletar(id);
		if (apagar) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Livro> buscarLivroPorId(@PathVariable Long id) {
		Livro livro = livroService.buscarPorId(id);
		if(livro != null) {
			return ResponseEntity.ok(livro);
		}
		else{
			return ResponseEntity.notFound().build();
		}
			
	}
	
	@GetMapping
	publivcResponseEntity<List<Livro>> buscaTodosLivros(){
		List<Livro> Livro = livroService.buscarTodos();
		return ResponseEntity.ok(Livro);
	}
}

	
	
	
	
	
	