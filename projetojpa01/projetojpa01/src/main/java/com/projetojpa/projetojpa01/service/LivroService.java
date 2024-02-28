package com.projetojpa.projetojpa01.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projetojpa.projetojpa01.dto.LivroDTO;
import com.projetojpa.projetojpa01.entities.Livro;
import com.projetojpa.projetojpa01.repository.LivroRepository;

@Service
public class LivroService {
	
	private final LivroRepository livroRepository;
	
	@Autowired
	public LivroService (LivroRepository livroRepository) {
		this.livroRepository = livroRepository;
	}
	
	public LivroDTO salvar(Livro livro ) {
		Livro salvarLivro = livroRepository.save(Livro){
			Livro existeLivro = livrorepository.fyndById(id).orElseThrow(() -> new RuntimeException("Livro não encontrado"));
			existeLivro.setTitulo(livro.getTitulo());
			existeLivro.setAutor(livro.getAutor());
			Livro updateLivro = LivroRepository.save(existeLivro);
			return new LivroDTO(updatedLivro.getId(), uptadedLivro.getTitulo(), updatedLivro.getAutor());
		}
		
		public boolean deletar(Long id) {
			Optional <Livro> existeCliente = livroRepository.findById(id);
			if (existeCliente.isPresent()) {
				livroRepository.deleteById(id);
				return true;
			}
			
			return false;
		}
		
		public List<Livro> buscarTodos() {
			return livroRepository.findAll();
		}
		
		public Livro buscarPorId(Long id) {
			Optional <Livro> Livro = livroRepository.findAll();
		}
		
		public Livro buscarPorId(Long id) {
			Optional <Livro> Livro = livroRepository.findById(id);
			return Livro.orElse(null);
	}
}
