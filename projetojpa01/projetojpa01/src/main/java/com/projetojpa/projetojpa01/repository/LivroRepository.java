package com.projetojpa.projetojpa01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projetojpa.projetojpa01.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{

}
