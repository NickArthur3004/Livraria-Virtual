package br.com.livraria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.livraria.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{

}
